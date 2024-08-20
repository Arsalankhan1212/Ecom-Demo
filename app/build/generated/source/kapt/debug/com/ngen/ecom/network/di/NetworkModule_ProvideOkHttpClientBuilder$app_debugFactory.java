package com.ngen.ecom.network.di;

import com.ngen.ecom.network.api.NetworkInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideOkHttpClientBuilder$app_debugFactory implements Factory<OkHttpClient.Builder> {
  private final NetworkModule module;

  private final Provider<NetworkInterceptor> networkInterceptorProvider;

  public NetworkModule_ProvideOkHttpClientBuilder$app_debugFactory(NetworkModule module,
      Provider<NetworkInterceptor> networkInterceptorProvider) {
    this.module = module;
    this.networkInterceptorProvider = networkInterceptorProvider;
  }

  @Override
  public OkHttpClient.Builder get() {
    return provideOkHttpClientBuilder$app_debug(module, networkInterceptorProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientBuilder$app_debugFactory create(
      NetworkModule module, Provider<NetworkInterceptor> networkInterceptorProvider) {
    return new NetworkModule_ProvideOkHttpClientBuilder$app_debugFactory(module, networkInterceptorProvider);
  }

  public static OkHttpClient.Builder provideOkHttpClientBuilder$app_debug(NetworkModule instance,
      NetworkInterceptor networkInterceptor) {
    return Preconditions.checkNotNullFromProvides(instance.provideOkHttpClientBuilder$app_debug(networkInterceptor));
  }
}
