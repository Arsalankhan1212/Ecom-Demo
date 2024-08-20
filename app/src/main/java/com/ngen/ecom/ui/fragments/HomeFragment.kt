package com.ngen.ecom.ui.fragments

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.ngen.ecom.R
import com.ngen.ecom.adapter.product.ProductListAdapter
import com.ngen.ecom.databinding.FragmentHomeBinding
import com.ngen.ecom.listener.ProductItemListener
import com.ngen.ecom.model.product.Product
import com.ngen.ecom.network.Response
import com.ngen.ecom.network.viewModel.EcomViewModel
import com.ngen.ecom.utils.AppPreference
import com.ngen.ecom.utils.Constants
import com.ngen.ecom.utils.GridSpacingItemDecoration
import com.ngen.ecom.utils.LoadingUtils
import com.ngen.ecom.utils.NetworkUtil
import com.ngen.ecom.utils.customToast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import www.sanju.motiontoast.MotionToastStyle


@AndroidEntryPoint
class HomeFragment : Fragment(), ProductItemListener {
    private var _binding: FragmentHomeBinding? = null

    private lateinit var layoutError: LinearLayoutCompat

    private var preference: AppPreference? = null
    private var isArabicLangSelected = false

    private val ecomViewModel by viewModels<EcomViewModel>()

    private var productListAdapter : ProductListAdapter?= null



    companion object {
        var categoryId = 1
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val view = _binding?.root

        layoutError = view?.findViewById(R.id.layoutError)!!

        preference = AppPreference.getInstance(requireContext())

        productListAdapter = ProductListAdapter(requireContext(),this@HomeFragment)


        isArabicLangSelected = !preference?.languageCode.equals("en", true)

        _binding?.apply {

            imgClearText.setOnClickListener {
                etSearch.setText("")

            }
            etSearch.addTextChangedListener(searchTextWatcher)

            recyclerView.apply {

                val spanCount = 2 // 2 columns
                val spacing = 20 // 50px
                val includeEdge = true

                layoutManager = GridLayoutManager(requireContext(), spanCount)
                addItemDecoration(
                    GridSpacingItemDecoration(
                        spanCount,
                        spacing,
                        includeEdge
                    )
                )
                adapter = productListAdapter
            }


            getProductList()



        }
        return view
    }

    //getting product list by category id
    private fun getProductList(){
        lifecycleScope.launch {
            ecomViewModel.getProductList().collect {
                when (it) {
                    is Response.Loading -> {
                        LoadingUtils.showDialog(requireContext(), false)
                    }

                    is Response.Success -> {
                        it.data?.let { response ->
                            LoadingUtils.hideDialog()
                            productListAdapter?.submitList(response.products)
                        }
                    }

                    is Response.Error -> {
                        LoadingUtils.hideDialog()
                        it.errorMessage?.let {
                            showErrorMessage(R.drawable.ic_error, it)
                        }
                    }

                    is Response.NetworkError -> {
                        LoadingUtils.hideDialog()
                        showErrorMessage(
                            R.drawable.ic_no_internet,
                            getString(R.string.str_no_internet_connection)
                        )
                    }
                }
            }
        }
    }


    private fun performSearch(search: String) {
        productListAdapter?.filter?.filter(search)
    }

    private fun showErrorMessage(icon: Int, message: String) {
        layoutError.isVisible = true
        _binding?.layoutError?.apply {
            imgError.setImageResource(icon)
            tvErrorMsg.text = message
            btnRefresh.setOnClickListener {
                layoutError.isVisible = false
                getProductList()
            }
            imgClose.isVisible = false

        }
    }

    //search edit text text watcher
    private val searchTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val text = p0.toString()
            _binding?.imgClearText?.isVisible = text.isNotEmpty()
        }

        override fun afterTextChanged(text: Editable?) {
            if (NetworkUtil.isAvailable(requireContext()))
                performSearch(text.toString())
            else
                requireActivity().customToast(
                    getString(R.string.str_no_internet_connection),
                    MotionToastStyle.NO_INTERNET
                )
        }

    }

    override fun onItemClicked(item: Product) {
        Constants.product = item
        findNavController().navigate(R.id.action_homeFragment_to_productDetailFragment)
    }

    private fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}