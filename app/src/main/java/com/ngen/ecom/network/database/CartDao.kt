package com.ngen.ecom.network.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.ngen.ecom.model.cart.CartItem

@Dao
interface CartDao {
    @Insert
    suspend fun addToCart(cartItem: CartItem): Long

    @Update
    suspend fun updateCartItem(cartItem: CartItem)

    @Query("SELECT * FROM Cart")
    fun getAllCartItems(): LiveData<List<CartItem>>

    @Query("UPDATE Cart SET quantity = quantity + 1 WHERE productId = :productId")
    suspend fun incrementQuantity(productId: Int)

    @Query("UPDATE Cart SET quantity = quantity - 1 WHERE productId = :productId AND quantity > 1")
    suspend fun decrementQuantity(productId: Int)

    @Query("DELETE FROM Cart WHERE id = :cartItemId")
    suspend fun removeCartItemById(cartItemId: Int)

    @Query("DELETE FROM Cart")
    suspend fun clearCart()
}