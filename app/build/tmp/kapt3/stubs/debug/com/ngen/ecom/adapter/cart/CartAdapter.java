package com.ngen.ecom.adapter.cart;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0017J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\n0\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/ngen/ecom/adapter/cart/CartAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ngen/ecom/adapter/cart/CartAdapter$ProductViewHolder;", "context", "Landroid/content/Context;", "listener", "Lcom/ngen/ecom/adapter/cart/CartAdapter$CartListener;", "(Landroid/content/Context;Lcom/ngen/ecom/adapter/cart/CartAdapter$CartListener;)V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ngen/ecom/model/cart/CartItem;", "getContext", "()Landroid/content/Context;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CartListener", "ProductViewHolder", "app_debug"})
public final class CartAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ngen.ecom.adapter.cart.CartAdapter.ProductViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.ngen.ecom.adapter.cart.CartAdapter.CartListener listener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ngen.ecom.model.cart.CartItem> DIFF_CALLBACK = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.ngen.ecom.model.cart.CartItem> differ = null;
    
    public CartAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.ngen.ecom.adapter.cart.CartAdapter.CartListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<com.ngen.ecom.model.cart.CartItem> getDiffer() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.ngen.ecom.adapter.cart.CartAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.adapter.cart.CartAdapter.ProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ngen/ecom/adapter/cart/CartAdapter$CartListener;", "", "onDecrementQuantity", "", "item", "Lcom/ngen/ecom/model/cart/CartItem;", "onIncrementQuantity", "app_debug"})
    public static abstract interface CartListener {
        
        public abstract void onIncrementQuantity(@org.jetbrains.annotations.NotNull
        com.ngen.ecom.model.cart.CartItem item);
        
        public abstract void onDecrementQuantity(@org.jetbrains.annotations.NotNull
        com.ngen.ecom.model.cart.CartItem item);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ngen/ecom/adapter/cart/CartAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ngen/ecom/databinding/CartItemBinding;", "(Lcom/ngen/ecom/adapter/cart/CartAdapter;Lcom/ngen/ecom/databinding/CartItemBinding;)V", "getBinding", "()Lcom/ngen/ecom/databinding/CartItemBinding;", "app_debug"})
    public final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.ngen.ecom.databinding.CartItemBinding binding = null;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull
        com.ngen.ecom.databinding.CartItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ngen.ecom.databinding.CartItemBinding getBinding() {
            return null;
        }
    }
}