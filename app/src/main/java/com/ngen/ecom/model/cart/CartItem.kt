package com.ngen.ecom.model.cart

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Cart")
data class CartItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    val productId : Int,
    val title: String,
    val price: Double,
    val imageUrl : String,
    val sku : String,
    val quantity: Int,
    )