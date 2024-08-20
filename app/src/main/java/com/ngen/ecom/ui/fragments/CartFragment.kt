package com.ngen.ecom.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.ngen.ecom.R
import com.ngen.ecom.adapter.cart.CartAdapter
import com.ngen.ecom.databinding.FragmentCartBinding
import com.ngen.ecom.model.cart.CartItem
import com.ngen.ecom.network.database.EcomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class CartFragment() : Fragment(), CartAdapter.CartListener {
    private var _binding: FragmentCartBinding? = null
    private lateinit var database: EcomDatabase

    private var cartAdapter : CartAdapter?= null

    companion object{
        var totalAmount = 0.0
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCartBinding.inflate(inflater, container, false)

        database = EcomDatabase.getInstance(requireContext())

        cartAdapter = CartAdapter(requireContext(), this@CartFragment)

        _binding?.apply {
            rvCart.apply {
                layoutManager = LinearLayoutManager(requireContext())
                adapter = cartAdapter
            }

            imgClearCart.setOnClickListener {
               CoroutineScope(Dispatchers.IO).launch {
                   database.cartDao().clearCart()
                   tvAmount.text = "$0"
               }
            }

            btnCheckOut.setOnClickListener {
                findNavController().navigate(R.id.action_cartFragment_to_checkOutFragment)
            }

            database.cartDao().getAllCartItems().observe(requireActivity()) {
                if (it.isEmpty()){
                    layoutEmptyCart.isVisible = true
                    rvCart.isVisible = false
                    btnCheckOut.isEnabled = false
                }
                else{
                    btnCheckOut.isEnabled = true
                    layoutEmptyCart.isVisible = false
                    rvCart.isVisible = true
                    cartAdapter?.differ?.submitList(it)

                    calculateTotalAmount(it)
                }

            }

        }


        return _binding?.root
    }

    @SuppressLint("SetTextI18n")
    private fun calculateTotalAmount(itemList: List<CartItem>?) {
        totalAmount = 0.0
        itemList?.forEach {
            totalAmount += (it.price * it.quantity)
        }

        _binding?.tvAmount?.text = "$${String.format("%.2f", totalAmount)}"
    }

    override fun onIncrementQuantity(item: CartItem) {
        CoroutineScope(Dispatchers.IO).launch {
            database.cartDao().incrementQuantity(item.productId)
        }
    }

    override fun onDecrementQuantity(item: CartItem) {
        if (item.quantity > 0){
            CoroutineScope(Dispatchers.IO).launch {
                database.cartDao().decrementQuantity(item.productId)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}