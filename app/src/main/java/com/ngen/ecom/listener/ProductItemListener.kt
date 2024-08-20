package com.ngen.ecom.listener

import com.ngen.ecom.model.product.Product


interface ProductItemListener {
    fun onItemClicked(item: Product)
}