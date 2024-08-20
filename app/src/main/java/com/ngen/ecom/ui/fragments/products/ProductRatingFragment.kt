package com.ngen.ecom.ui.fragments.products

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ngen.ecom.adapter.review.UserReviewsAdapter
import com.ngen.ecom.databinding.FragmentProductRatingBinding
import com.ngen.ecom.utils.Constants
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductRatingFragment : Fragment() {
    private var _binding: FragmentProductRatingBinding? = null
    private var userReviewAdapter: UserReviewsAdapter? = null

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductRatingBinding.inflate(inflater, container, false)


        val view = _binding?.root


        _binding?.apply {

            userReviewAdapter = UserReviewsAdapter(requireContext())
            rvReviews.layoutManager = LinearLayoutManager(requireContext())
            rvReviews.adapter = userReviewAdapter

            userReviewAdapter?.differ?.submitList(Constants.product?.reviews)

        }

        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}