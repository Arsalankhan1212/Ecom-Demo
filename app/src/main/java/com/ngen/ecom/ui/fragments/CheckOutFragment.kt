package com.ngen.ecom.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ngen.ecom.R
import com.ngen.ecom.databinding.FragmentCheckOutBinding
import com.ngen.ecom.ui.dialog.AddPaymentDialogFragment
import com.ngen.ecom.ui.dialog.AddShippingDialogFragment


class CheckOutFragment : Fragment() {
    private var _binding : FragmentCheckOutBinding ?= null
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCheckOutBinding.inflate(inflater,container,false)
        _binding?.apply {

            val taxValue = 19.97

            val totalAmount =  CartFragment.totalAmount + taxValue

            tvSubtotalValue.text = "$${String.format("%.2f",CartFragment.totalAmount)}"
            tvTotalValue.text = "$${String.format("%.2f",totalAmount)}"

            btnAddPayment.setOnClickListener {
                val dialog = AddPaymentDialogFragment()
                dialog.show(childFragmentManager,dialog.tag)
            }

            btnAddShipping.setOnClickListener {
                val dialog = AddShippingDialogFragment()
                dialog.show(childFragmentManager,dialog.tag)
            }

            btnPayNow.setOnClickListener {
                Toast.makeText(requireContext(),"Functionality Will be added soon!",Toast.LENGTH_SHORT).show()
            }
        }
        return _binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}