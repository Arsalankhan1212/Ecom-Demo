package com.ngen.ecom.adapter.product

import android.animation.Animator
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ngen.ecom.databinding.ProductItemBinding
import com.ngen.ecom.listener.ProductItemListener
import com.ngen.ecom.model.product.Product
import com.ngen.ecom.utils.GlideManager
import java.util.Locale

class ProductListAdapter(val context: Context, private val listener: ProductItemListener) :
    RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>(), Filterable {

    private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }
    }

    private val originalList = mutableListOf<Product>()
    val differ = AsyncListDiffer(this, DIFF_CALLBACK)

    inner class ProductViewHolder(val binding: ProductItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ProductItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int = differ.currentList.size


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        with(holder) {
            with(differ.currentList[adapterPosition]) {

                binding.tvTotalReviews.text = "(${this.reviews.size})"
                binding.tvProductName.text = this.title
                binding.tvProductBadge.text = "${this.discountPercentage}% off"
                binding.ratingBar.rating = rating.toFloat()

                // loading an image
                GlideManager.load(context, thumbnail).into(binding.imgProduct)
                // setting min and max price
                binding.tvPriceValue.text = "${this.price}$"

                itemView.setOnClickListener {
                    listener.onItemClicked(differ.currentList[adapterPosition])
                }

                // Image scale up animation
                // animateProductImage()
            }
        }
    }

    private fun ProductViewHolder.animateProductImage() {
        binding.imgProduct.animate().scaleX(1.10f).scaleY(1.10f).setDuration(300)
            .setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(p0: Animator) {}

                override fun onAnimationEnd(p0: Animator) {
                    binding.imgProduct.animate().scaleX(1f).scaleY(1f).setDuration(100).start()
                }

                override fun onAnimationCancel(p0: Animator) {}

                override fun onAnimationRepeat(p0: Animator) {}
            }).start()
    }

    fun submitList(list: List<Product>) {
        originalList.clear()
        originalList.addAll(list)
        differ.submitList(list)
    }

    override fun getFilter(): Filter {
        return productFilter
    }

    private val productFilter = object : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val filteredList = mutableListOf<Product>()
            if (constraint.isNullOrEmpty()) {
                filteredList.addAll(originalList)
            } else {
                val filterPattern = constraint.toString().trim()

                // Check if the input is a numeric value for price filtering
                if (filterPattern.toDoubleOrNull() != null) {
                    val price = filterPattern.toDouble()
                    originalList.forEach {
                        if (it.price.toString().contains(filterPattern))
                            filteredList.add(it)
                    }
                   // filteredList.addAll(originalList.filter { it.price == price })
                } else {
                    // Filter by title
                    filteredList.addAll(originalList.filter {
                        it.title.lowercase(Locale.getDefault()).contains(filterPattern.lowercase(Locale.getDefault()))
                    })
                }
            }

            val results = FilterResults()
            results.values = filteredList
            return results
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            differ.submitList(results?.values as? List<Product>)
        }
    }
}
