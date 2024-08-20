package com.ngen.ecom.ui.fragments;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020&H\u0002J\f\u0010+\u001a\u00020\u0017*\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/ngen/ecom/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/ngen/ecom/listener/ProductItemListener;", "()V", "_binding", "Lcom/ngen/ecom/databinding/FragmentHomeBinding;", "ecomViewModel", "Lcom/ngen/ecom/network/viewModel/EcomViewModel;", "getEcomViewModel", "()Lcom/ngen/ecom/network/viewModel/EcomViewModel;", "ecomViewModel$delegate", "Lkotlin/Lazy;", "isArabicLangSelected", "", "layoutError", "Landroidx/appcompat/widget/LinearLayoutCompat;", "preference", "Lcom/ngen/ecom/utils/AppPreference;", "productListAdapter", "Lcom/ngen/ecom/adapter/product/ProductListAdapter;", "searchTextWatcher", "Landroid/text/TextWatcher;", "getProductList", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onItemClicked", "item", "Lcom/ngen/ecom/model/product/Product;", "performSearch", "search", "", "showErrorMessage", "icon", "", "message", "hideKeyboard", "Companion", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.ngen.ecom.listener.ProductItemListener {
    @org.jetbrains.annotations.Nullable
    private com.ngen.ecom.databinding.FragmentHomeBinding _binding;
    private androidx.appcompat.widget.LinearLayoutCompat layoutError;
    @org.jetbrains.annotations.Nullable
    private com.ngen.ecom.utils.AppPreference preference;
    private boolean isArabicLangSelected = false;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy ecomViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.ngen.ecom.adapter.product.ProductListAdapter productListAdapter;
    private static int categoryId = 1;
    @org.jetbrains.annotations.NotNull
    private final android.text.TextWatcher searchTextWatcher = null;
    @org.jetbrains.annotations.NotNull
    public static final com.ngen.ecom.ui.fragments.HomeFragment.Companion Companion = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.ngen.ecom.network.viewModel.EcomViewModel getEcomViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void getProductList() {
    }
    
    private final void performSearch(java.lang.String search) {
    }
    
    private final void showErrorMessage(int icon, java.lang.String message) {
    }
    
    @java.lang.Override
    public void onItemClicked(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.model.product.Product item) {
    }
    
    private final void hideKeyboard(android.view.View $this$hideKeyboard) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/ngen/ecom/ui/fragments/HomeFragment$Companion;", "", "()V", "categoryId", "", "getCategoryId", "()I", "setCategoryId", "(I)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getCategoryId() {
            return 0;
        }
        
        public final void setCategoryId(int p0) {
        }
    }
}