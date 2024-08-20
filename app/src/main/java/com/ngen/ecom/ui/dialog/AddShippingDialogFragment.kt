package com.ngen.ecom.ui.dialog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.ngen.ecom.R
import com.ngen.ecom.databinding.FragmentAddShippingDialogBinding


class AddShippingDialogFragment : DialogFragment() {

    private var _binding : FragmentAddShippingDialogBinding ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAddShippingDialogBinding.inflate(layoutInflater,container,false)

        _binding?.apply {
            btnSave.setOnClickListener {
                val name = etName.text.toString()
                val address = etAddress.text.toString()
                val city = etCity.text.toString()
                val state = etState.text.toString()
                val zipCode = etZipCode.text.toString()

                // Validate input and pass back the data
                if (name.isNotEmpty() && address.isNotEmpty() && city.isNotEmpty() &&
                    state.isNotEmpty() && zipCode.isNotEmpty()) {
                    Toast.makeText(requireContext(), "Data Temporary saved!", Toast.LENGTH_SHORT).show()
                    dismiss()
                } else {
                    Toast.makeText(requireContext(), "Please fill out all fields", Toast.LENGTH_SHORT).show()
                }
            }

            btnCancel.setOnClickListener {
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