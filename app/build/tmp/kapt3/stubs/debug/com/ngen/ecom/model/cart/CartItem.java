package com.ngen.ecom.model.cart;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lcom/ngen/ecom/model/cart/CartItem;", "", "id", "", "productId", "title", "", "price", "", "imageUrl", "sku", "quantity", "(Ljava/lang/Integer;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageUrl", "()Ljava/lang/String;", "getPrice", "()D", "getProductId", "()I", "getQuantity", "getSku", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;I)Lcom/ngen/ecom/model/cart/CartItem;", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "Cart")
public final class CartItem {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    private final int productId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private final double price = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String imageUrl = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sku = null;
    private final int quantity = 0;
    
    public CartItem(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, int productId, @org.jetbrains.annotations.NotNull
    java.lang.String title, double price, @org.jetbrains.annotations.NotNull
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull
    java.lang.String sku, int quantity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final int getProductId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSku() {
        return null;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ngen.ecom.model.cart.CartItem copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, int productId, @org.jetbrains.annotations.NotNull
    java.lang.String title, double price, @org.jetbrains.annotations.NotNull
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull
    java.lang.String sku, int quantity) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}