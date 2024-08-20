package com.ngen.ecom.network.api;

import com.ngen.ecom.utils.TokenManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class AuthInterceptor_Factory implements Factory<AuthInterceptor> {
  private final Provider<TokenManager> tokenManagerProvider;

  public AuthInterceptor_Factory(Provider<TokenManager> tokenManagerProvider) {
    this.tokenManagerProvider = tokenManagerProvider;
  }

  @Override
  public AuthInterceptor get() {
    AuthInterceptor instance = newInstance();
    AuthInterceptor_MembersInjector.injectTokenManager(instance, tokenManagerProvider.get());
    return instance;
  }

  public static AuthInterceptor_Factory create(Provider<TokenManager> tokenManagerProvider) {
    return new AuthInterceptor_Factory(tokenManagerProvider);
  }

  public static AuthInterceptor newInstance() {
    return new AuthInterceptor();
  }
}
