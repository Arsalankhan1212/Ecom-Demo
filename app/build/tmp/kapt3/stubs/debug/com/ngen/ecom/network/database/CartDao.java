package com.ngen.ecom.network.database;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH\'J\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/ngen/ecom/network/database/CartDao;", "", "addToCart", "", "cartItem", "Lcom/ngen/ecom/model/cart/CartItem;", "(Lcom/ngen/ecom/model/cart/CartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementQuantity", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCartItems", "Landroidx/lifecycle/LiveData;", "", "incrementQuantity", "removeCartItemById", "cartItemId", "updateCartItem", "app_debug"})
@androidx.room.Dao
public abstract interface CartDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addToCart(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.model.cart.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateCartItem(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.model.cart.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM Cart")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ngen.ecom.model.cart.CartItem>> getAllCartItems();
    
    @androidx.room.Query(value = "UPDATE Cart SET quantity = quantity + 1 WHERE productId = :productId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object incrementQuantity(int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE Cart SET quantity = quantity - 1 WHERE productId = :productId AND quantity > 1")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object decrementQuantity(int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Cart WHERE id = :cartItemId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeCartItemById(int cartItemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM Cart")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearCart(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}