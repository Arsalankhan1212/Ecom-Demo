package com.ngen.ecom.ui.fragments.products;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0018H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010&\u001a\u00020\u0014*\u00020\u00042\u0006\u0010$\u001a\u00020\u0018H\u0002J\u001a\u0010\'\u001a\u00020\u0014*\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160)H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/ngen/ecom/ui/fragments/products/ProductDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/ngen/ecom/databinding/FragmentProductDetailBinding;", "database", "Lcom/ngen/ecom/network/database/EcomDatabase;", "layoutError", "Landroidx/appcompat/widget/LinearLayoutCompat;", "preference", "Lcom/ngen/ecom/utils/AppPreference;", "tabsAdapter", "Lcom/ngen/ecom/adapter/product/ProductCategoryTabsAdapter;", "tokenManager", "Lcom/ngen/ecom/utils/TokenManager;", "getTokenManager", "()Lcom/ngen/ecom/utils/TokenManager;", "setTokenManager", "(Lcom/ngen/ecom/utils/TokenManager;)V", "assignSliderImages", "", "imageUrl", "", "position", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "productImageSelector", "id", "setCurrentPreviewImage", "handleProductDetailTabs", "setSliderImages", "productImagesList", "", "Companion", "app_debug"})
public final class ProductDetailFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.ngen.ecom.databinding.FragmentProductDetailBinding _binding;
    @org.jetbrains.annotations.Nullable
    private com.ngen.ecom.utils.AppPreference preference;
    private androidx.appcompat.widget.LinearLayoutCompat layoutError;
    private com.ngen.ecom.adapter.product.ProductCategoryTabsAdapter tabsAdapter;
    private com.ngen.ecom.network.database.EcomDatabase database;
    @javax.inject.Inject
    public com.ngen.ecom.utils.TokenManager tokenManager;
    @org.jetbrains.annotations.Nullable
    private static java.lang.Integer productId;
    @org.jetbrains.annotations.NotNull
    public static final com.ngen.ecom.ui.fragments.products.ProductDetailFragment.Companion Companion = null;
    
    public ProductDetailFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ngen.ecom.utils.TokenManager getTokenManager() {
        return null;
    }
    
    public final void setTokenManager(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.utils.TokenManager p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setSliderImages(com.ngen.ecom.databinding.FragmentProductDetailBinding $this$setSliderImages, java.util.List<java.lang.String> productImagesList) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    private final void assignSliderImages(java.lang.String imageUrl, int position) {
    }
    
    private final void productImageSelector(int id) {
    }
    
    private final void setCurrentPreviewImage(java.lang.String imageUrl) {
    }
    
    private final void handleProductDetailTabs(com.ngen.ecom.databinding.FragmentProductDetailBinding $this$handleProductDetailTabs, int id) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/ngen/ecom/ui/fragments/products/ProductDetailFragment$Companion;", "", "()V", "productId", "", "getProductId", "()Ljava/lang/Integer;", "setProductId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getProductId() {
            return null;
        }
        
        public final void setProductId(@org.jetbrains.annotations.Nullable
        java.lang.Integer p0) {
        }
    }
}