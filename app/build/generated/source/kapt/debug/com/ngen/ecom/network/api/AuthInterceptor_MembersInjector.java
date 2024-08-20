package com.ngen.ecom.network.api;

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
public final class AuthInterceptor_MembersInjector implements MembersInjector<AuthInterceptor> {
  private final Provider<TokenManager> tokenManagerProvider;

  public AuthInterceptor_MembersInjector(Provider<TokenManager> tokenManagerProvider) {
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<AuthInterceptor> create(
      Provider<TokenManager> tokenManagerProvider) {
    return new AuthInterceptor_MembersInjector(tokenManagerProvider);
  }

  @Override
  public void injectMembers(AuthInterceptor instance) {
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.ngen.ecom.network.api.AuthInterceptor.tokenManager")
  public static void injectTokenManager(AuthInterceptor instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
