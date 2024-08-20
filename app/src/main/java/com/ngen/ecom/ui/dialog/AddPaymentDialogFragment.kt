package com.ngen.ecom.ui.dialog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.ngen.ecom.R
import com.ngen.ecom.databinding.FragmentAddPaymentDialogBinding


class AddPaymentDialogFragment : DialogFragment() {
    private var _binding : FragmentAddPaymentDialogBinding ? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddPaymentDialogBinding.inflate(inflater,container,false)
        _binding?.apply {

            btnSavePayment.setOnClickListener {
                val cardholderName = etCardholderName.text.toString()
                val cardNumber = etCardNumber.text.toString()
                val expirationDate = etExpirationDate.text.toString()
                val cvv = etCVV.text.toString()

                // Validate input and pass back the data
                if (cardholderName.isNotEmpty() && cardNumber.isNotEmpty() &&
                    expirationDate.isNotEmpty() && cvv.isNotEmpty()) {
                    Toast.makeText(requireActivity(), "Temporary saved!", Toast.LENGTH_SHORT).show()
                    dismiss()
                } else {
                    Toast.makeText(requireActivity(), "Please fill out all fields", Toast.LENGTH_SHORT).show()
                }
            }

            btnCancelPayment.setOnClickListener {
                dismiss()
            }

        }

        return _binding?.root
    }
    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}