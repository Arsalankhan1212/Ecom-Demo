package com.ngen.ecom.ui.fragments.products;

import com.ngen.ecom.utils.TokenManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductDetailFragment_MembersInjector implements MembersInjector<ProductDetailFragment> {
  private final Provider<TokenManager> tokenManagerProvider;

  public ProductDetailFragment_MembersInjector(Provider<TokenManager> tokenManagerProvider) {
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<ProductDetailFragment> create(
      Provider<TokenManager> tokenManagerProvider) {
    return new ProductDetailFragment_MembersInjector(tokenManagerProvider);
  }

  @Override
  public void injectMembers(ProductDetailFragment instance) {
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.ngen.ecom.ui.fragments.products.ProductDetailFragment.tokenManager")
  public static void injectTokenManager(ProductDetailFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
