package com.ngen.ecom.adapter.cart

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ngen.ecom.databinding.CartItemBinding
import com.ngen.ecom.model.cart.CartItem
import com.ngen.ecom.utils.GlideManager

class CartAdapter(val context: Context, private val listener : CartListener) :
    RecyclerView.Adapter<CartAdapter.ProductViewHolder>(){

    private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<CartItem>() {
        override fun areItemsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, DIFF_CALLBACK)

    inner class ProductViewHolder(val binding: CartItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int = differ.currentList.size


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        with(holder) {
            with(differ.currentList[adapterPosition]) {

                binding.tvProductName.text = this.title
                binding.tvPrice.text = "${price}$"
                binding.tvSKU.text = "SKU: $sku"
                binding.tvQuantity.text = quantity.toString()

                // loading an image
                GlideManager.load(context, imageUrl).into(binding.imgProduct)

               binding.imgIncrement.setOnClickListener {
                   listener.onIncrementQuantity(this)
               }
                binding.imgDecrement.setOnClickListener {
                    if (this.quantity > 0){
                        binding.tvQuantity.text = quantity.toString()
                        listener.onDecrementQuantity(this)
                    }

                }
            }
        }
    }

    interface CartListener{
        fun onIncrementQuantity(item : CartItem)
        fun onDecrementQuantity(item : CartItem)
    }
}
