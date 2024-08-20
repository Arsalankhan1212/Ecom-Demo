package com.ngen.ecom.adapter.review

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ngen.ecom.databinding.ReviewItemBinding
import com.ngen.ecom.model.product.Review
import com.ngen.ecom.utils.DateFormatter

class UserReviewsAdapter(val context : Context) : RecyclerView.Adapter<UserReviewsAdapter.ProductViewHolder>() {

    private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Review>(){
        override fun areItemsTheSame(oldItem: Review, newItem: Review): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Review, newItem: Review): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, DIFF_CALLBACK)


    inner class ProductViewHolder(val binding : ReviewItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ReviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        with(holder){
            with(differ.currentList[adapterPosition]){
                binding.tvUserName.text = this.reviewerName
                binding.tvReviewDate.text = DateFormatter.formatDate(this.date)
                binding.tvReviewMessage.text = this.comment
                binding.userRating.rating = this.rating.toFloat()
                itemView.setOnClickListener {
                }
            }
        }
    }


}