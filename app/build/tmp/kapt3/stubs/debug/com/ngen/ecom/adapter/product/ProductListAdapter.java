package com.ngen.ecom.adapter.product;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001&B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0017J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016J\u0014\u0010\"\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0$J\u0010\u0010%\u001a\u00020\u001b*\u00060\u0002R\u00020\u0000H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000b0\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/ngen/ecom/adapter/product/ProductListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ngen/ecom/adapter/product/ProductListAdapter$ProductViewHolder;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "listener", "Lcom/ngen/ecom/listener/ProductItemListener;", "(Landroid/content/Context;Lcom/ngen/ecom/listener/ProductItemListener;)V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ngen/ecom/model/product/Product;", "getContext", "()Landroid/content/Context;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "originalList", "", "productFilter", "Landroid/widget/Filter;", "getFilter", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "", "animateProductImage", "ProductViewHolder", "app_debug"})
public final class ProductListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ngen.ecom.adapter.product.ProductListAdapter.ProductViewHolder> implements android.widget.Filterable {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.ngen.ecom.listener.ProductItemListener listener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ngen.ecom.model.product.Product> DIFF_CALLBACK = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.ngen.ecom.model.product.Product> originalList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.ngen.ecom.model.product.Product> differ = null;
    @org.jetbrains.annotations.NotNull
    private final android.widget.Filter productFilter = null;
    
    public ProductListAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.ngen.ecom.listener.ProductItemListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<com.ngen.ecom.model.product.Product> getDiffer() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.ngen.ecom.adapter.product.ProductListAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
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
    com.ngen.ecom.adapter.product.ProductListAdapter.ProductViewHolder holder, int position) {
    }
    
    private final void animateProductImage(com.ngen.ecom.adapter.product.ProductListAdapter.ProductViewHolder $this$animateProductImage) {
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull
    java.util.List<com.ngen.ecom.model.product.Product> list) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ngen/ecom/adapter/product/ProductListAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ngen/ecom/databinding/ProductItemBinding;", "(Lcom/ngen/ecom/adapter/product/ProductListAdapter;Lcom/ngen/ecom/databinding/ProductItemBinding;)V", "getBinding", "()Lcom/ngen/ecom/databinding/ProductItemBinding;", "app_debug"})
    public final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.ngen.ecom.databinding.ProductItemBinding binding = null;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull
        com.ngen.ecom.databinding.ProductItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ngen.ecom.databinding.ProductItemBinding getBinding() {
            return null;
        }
    }
}