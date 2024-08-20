package com.ngen.ecom.network.viewModel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/ngen/ecom/network/viewModel/EcomViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/ngen/ecom/network/repository/EcomRepository;", "(Lcom/ngen/ecom/network/repository/EcomRepository;)V", "getProductList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ngen/ecom/network/Response;", "Lcom/ngen/ecom/model/product/ProductResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class EcomViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.ngen.ecom.network.repository.EcomRepository repository = null;
    
    @javax.inject.Inject
    public EcomViewModel(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.network.repository.EcomRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProductList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ngen.ecom.network.Response<com.ngen.ecom.model.product.ProductResponse>>> $completion) {
        return null;
    }
}