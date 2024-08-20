package com.ngen.ecom.ui.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0003J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ngen/ecom/ui/fragments/CartFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/ngen/ecom/adapter/cart/CartAdapter$CartListener;", "()V", "_binding", "Lcom/ngen/ecom/databinding/FragmentCartBinding;", "cartAdapter", "Lcom/ngen/ecom/adapter/cart/CartAdapter;", "database", "Lcom/ngen/ecom/network/database/EcomDatabase;", "calculateTotalAmount", "", "itemList", "", "Lcom/ngen/ecom/model/cart/CartItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDecrementQuantity", "item", "onDestroy", "onIncrementQuantity", "Companion", "app_debug"})
public final class CartFragment extends androidx.fragment.app.Fragment implements com.ngen.ecom.adapter.cart.CartAdapter.CartListener {
    @org.jetbrains.annotations.Nullable
    private com.ngen.ecom.databinding.FragmentCartBinding _binding;
    private com.ngen.ecom.network.database.EcomDatabase database;
    @org.jetbrains.annotations.Nullable
    private com.ngen.ecom.adapter.cart.CartAdapter cartAdapter;
    private static double totalAmount = 0.0;
    @org.jetbrains.annotations.NotNull
    public static final com.ngen.ecom.ui.fragments.CartFragment.Companion Companion = null;
    
    public CartFragment() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void calculateTotalAmount(java.util.List<com.ngen.ecom.model.cart.CartItem> itemList) {
    }
    
    @java.lang.Override
    public void onIncrementQuantity(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.model.cart.CartItem item) {
    }
    
    @java.lang.Override
    public void onDecrementQuantity(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.model.cart.CartItem item) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/ngen/ecom/ui/fragments/CartFragment$Companion;", "", "()V", "totalAmount", "", "getTotalAmount", "()D", "setTotalAmount", "(D)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final double getTotalAmount() {
            return 0.0;
        }
        
        public final void setTotalAmount(double p0) {
        }
    }
}