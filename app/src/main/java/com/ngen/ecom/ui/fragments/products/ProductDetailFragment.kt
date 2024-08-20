package com.ngen.ecom.ui.fragments.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.ngen.ecom.R
import com.ngen.ecom.adapter.product.ProductCategoryTabsAdapter
import com.ngen.ecom.databinding.FragmentProductDetailBinding
import com.ngen.ecom.model.cart.CartItem
import com.ngen.ecom.network.database.EcomDatabase
import com.ngen.ecom.utils.AppPreference
import com.ngen.ecom.utils.Constants
import com.ngen.ecom.utils.TokenManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@AndroidEntryPoint
class ProductDetailFragment : Fragment() {
    private var _binding: FragmentProductDetailBinding? = null

    private var preference: AppPreference? = null

    private lateinit var layoutError: LinearLayoutCompat

    private lateinit var tabsAdapter : ProductCategoryTabsAdapter

    private lateinit var database : EcomDatabase

    @Inject
    lateinit var tokenManager: TokenManager

    companion object {
        var productId: Int? = null

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductDetailBinding.inflate(inflater, container, false)

        val view = _binding?.root

        database = EcomDatabase.getInstance(requireContext())

        layoutError = view?.findViewById(R.id.layoutError)!!

        val fromRightAnim = AnimationUtils.loadAnimation(requireContext(), R.anim.back_arrow_anim)

        preference = AppPreference.getInstance(requireContext())

        _binding?.apply {

            imgBack.startAnimation(fromRightAnim)

            //collapsable toolbar listener
            appBarLayout.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
                val maxScroll = appBarLayout.totalScrollRange
                val percentage = kotlin.math.abs(verticalOffset).toFloat() / maxScroll.toFloat()
                //changing back button i.e. white and black button
                val iconRes =
                    if (percentage >= 0.8) R.drawable.ic_back_arrow else R.drawable.ic_back_arrow_white

                //changing text color
                val textColorRes = if (percentage >= 0.8) R.color.black else R.color.white

                //hiding Product title and visible toolbar title (both are product title)
                if (percentage >= 0.8) {
                    tvToolbarTitle.visibility = View.VISIBLE
                    tvProductTitle.visibility = View.GONE
                } else {
                    //hiding toolbar title and visible product title (both are product title)
                    tvToolbarTitle.visibility = View.GONE
                    tvProductTitle.visibility = View.VISIBLE
                }
                imgBack.setImageResource(iconRes)
                tvToolbarTitle.setTextColor(ContextCompat.getColor(requireContext(), textColorRes))

            }

            productImg1.isSelected = true // default image 1 is selected


            // ============ Product Detail Tab items ================
            //product detail tabs with view pager
            tabsAdapter = ProductCategoryTabsAdapter(requireActivity())
            tabsAdapter.addFragment(AboutProductFragment(),"About Product")
            tabsAdapter.addFragment(ProductRatingFragment(),"Product Reviews")

            viewPager.isUserInputEnabled = false
            viewPager.adapter = tabsAdapter
            viewPager.currentItem = 0

            layoutAbout.setOnClickListener {
                handleProductDetailTabs(R.id.layoutAbout)
                viewPager.currentItem = 1
            }
            layoutReviews.setOnClickListener {
                handleProductDetailTabs(R.id.layoutReviews)
                viewPager.currentItem = 2
            }

            imgBack.setOnClickListener {
                findNavController().popBackStack()
            }

            layoutAbout.isSelected = true
            tvAbout.isVisible = true


            layoutAbout.setOnClickListener {
                handleProductDetailTabs(R.id.layoutAbout)
            }
            layoutReviews.setOnClickListener {
                handleProductDetailTabs(R.id.layoutReviews)
            }

            imgCart.setOnClickListener {
                Constants.product?.apply {
                    val cartItem = CartItem(null,id,title,price,thumbnail,sku,1)

                    CoroutineScope(Dispatchers.IO).launch {
                       val id = database.cartDao().addToCart(cartItem)
                        withContext(Main){
                            if (id > 0){
                                Toast.makeText(requireContext(),"Product added to cart",Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }
            }
        }

        return _binding?.root
    }

    private fun FragmentProductDetailBinding.setSliderImages(productImagesList: List<String>) {
        //assigning image to imageview
        val imgListSize = productImagesList.size

        if (imgListSize == 0)
            assignSliderImages(Constants.product?.thumbnail ?: "",1)

        if (imgListSize > 0)
            assignSliderImages(productImagesList[0], 1)
        else
            productImg1.isVisible = false

        if (imgListSize > 1)
            assignSliderImages(productImagesList[1], 2)
        else
            productImg2.isVisible = false

        if (imgListSize > 2)
            assignSliderImages(productImagesList[2], 3)
        else
            productImg3.isVisible = false

        if (imgListSize > 3)
            assignSliderImages(productImagesList[3], 4)
        else
            productImg4.isVisible = false

        //product image click listener in collapsable toolbar i.e. vertical 4 images
        productImg1.setOnClickListener {
            productImageSelector(productImg1.id)
            setCurrentPreviewImage(productImagesList[0])
        }
        productImg2.setOnClickListener {
            productImageSelector(productImg2.id)
            setCurrentPreviewImage(productImagesList[1])
        }
        productImg3.setOnClickListener {
            productImageSelector(productImg3.id)
            setCurrentPreviewImage(productImagesList[2])
        }
        productImg4.setOnClickListener {
            productImageSelector(productImg4.id)
            setCurrentPreviewImage(productImagesList[3])
        }
    }

    override fun onResume() {
        super.onResume()
        _binding?.apply {
            setSliderImages(Constants.product?.images ?: emptyList())
            setCurrentPreviewImage(Constants.product?.thumbnail?:"")

            Constants.product?.apply {
                tvToolbarTitle.text = title
                tvProductTitle.text = title

                tvRating.text = rating.toString()
                tvPriceRangeValue.text = "${price}$"
            }
        }
    }

    private fun assignSliderImages(imageUrl: String, position: Int) {
        val toImageView = when (position) {
            1 -> _binding?.productImg1!!
            2 -> _binding?.productImg2!!
            3 -> _binding?.productImg3!!
            else -> _binding?.productImg4!!
        }

        Glide.with(requireContext())
            .load(imageUrl)
            .placeholder(R.drawable.ic_placeholder)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(toImageView)
    }

    //selecting and unselected product feature images i.e. by apply stroke to selected image in slider
    private fun productImageSelector(id: Int) {
        when (id) {
            R.id.productImg1 -> {
                _binding?.apply {
                    productImg1.isSelected = true
                    productImg2.isSelected = false
                    productImg3.isSelected = false
                    productImg4.isSelected = false
                }
            }

            R.id.productImg2 -> {
                _binding?.apply {
                    productImg2.isSelected = true
                    productImg1.isSelected = false
                    productImg3.isSelected = false
                    productImg4.isSelected = false
                }
            }

            R.id.productImg3 -> {
                _binding?.apply {
                    productImg3.isSelected = true
                    productImg1.isSelected = false
                    productImg2.isSelected = false
                    productImg4.isSelected = false
                }
            }

            R.id.productImg4 -> {
                _binding?.apply {
                    productImg4.isSelected = true
                    productImg1.isSelected = false
                    productImg2.isSelected = false
                    productImg3.isSelected = false
                }
            }
        }
    }

    private fun setCurrentPreviewImage(imageUrl: String) {
        Glide.with(requireContext())
            .load(imageUrl)
            .placeholder(R.drawable.ic_placeholder)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(_binding?.imgProduct!!)

        //val animating the image
        val animation =
            AnimationUtils.loadAnimation(requireContext(), R.anim.fade_in)
        _binding?.imgProduct?.startAnimation(animation)
    }

    private fun FragmentProductDetailBinding.handleProductDetailTabs(id: Int) {
        when (id) {
            R.id.layoutAbout -> {
                layoutAbout.isSelected = true
                tvAbout.isVisible = true

                layoutReviews.isSelected = false
                tvReviews.isVisible = false
                viewPager.currentItem = 0
            }

            R.id.layoutReviews -> {
                layoutAbout.isSelected = false
                tvAbout.isVisible = false

                layoutReviews.isSelected = true
                tvReviews.isVisible = true
                viewPager.currentItem = 1
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}