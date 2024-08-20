package com.ngen.ecom.listener;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ngen/ecom/listener/ProductItemListener;", "", "onItemClicked", "", "item", "Lcom/ngen/ecom/model/product/Product;", "app_debug"})
public abstract interface ProductItemListener {
    
    public abstract void onItemClicked(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.model.product.Product item);
}