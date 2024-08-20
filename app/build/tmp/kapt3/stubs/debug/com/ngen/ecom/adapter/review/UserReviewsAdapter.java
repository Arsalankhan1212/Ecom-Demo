package com.ngen.ecom.adapter.review;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\b0\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/ngen/ecom/adapter/review/UserReviewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ngen/ecom/adapter/review/UserReviewsAdapter$ProductViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ngen/ecom/model/product/Review;", "getContext", "()Landroid/content/Context;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductViewHolder", "app_debug"})
public final class UserReviewsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ngen.ecom.adapter.review.UserReviewsAdapter.ProductViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ngen.ecom.model.product.Review> DIFF_CALLBACK = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.ngen.ecom.model.product.Review> differ = null;
    
    public UserReviewsAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<com.ngen.ecom.model.product.Review> getDiffer() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.ngen.ecom.adapter.review.UserReviewsAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.adapter.review.UserReviewsAdapter.ProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ngen/ecom/adapter/review/UserReviewsAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ngen/ecom/databinding/ReviewItemBinding;", "(Lcom/ngen/ecom/adapter/review/UserReviewsAdapter;Lcom/ngen/ecom/databinding/ReviewItemBinding;)V", "getBinding", "()Lcom/ngen/ecom/databinding/ReviewItemBinding;", "app_debug"})
    public final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.ngen.ecom.databinding.ReviewItemBinding binding = null;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull
        com.ngen.ecom.databinding.ReviewItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ngen.ecom.databinding.ReviewItemBinding getBinding() {
            return null;
        }
    }
}