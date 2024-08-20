package com.ngen.ecom.network.di;

import com.ngen.ecom.network.api.AuthInterceptor;
import com.ngen.ecom.network.api.EcomAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideQaarenAPIFactory implements Factory<EcomAPI> {
  private final NetworkModule module;

  private final Provider<Retrofit.Builder> retrofitBuilderProvider;

  private final Provider<OkHttpClient.Builder> okHttpClientBuilderProvider;

  private final Provider<AuthInterceptor> authInterceptorProvider;

  public NetworkModule_ProvideQaarenAPIFactory(NetworkModule module,
      Provider<Retrofit.Builder> retrofitBuilderProvider,
      Provider<OkHttpClient.Builder> okHttpClientBuilderProvider,
      Provider<AuthInterceptor> authInterceptorProvider) {
    this.module = module;
    this.retrofitBuilderProvider = retrofitBuilderProvider;
    this.okHttpClientBuilderProvider = okHttpClientBuilderProvider;
    this.authInterceptorProvider = authInterceptorProvider;
  }

  @Override
  public EcomAPI get() {
    return provideQaarenAPI(module, retrofitBuilderProvider.get(), okHttpClientBuilderProvider.get(), authInterceptorProvider.get());
  }

  public static NetworkModule_ProvideQaarenAPIFactory create(NetworkModule module,
      Provider<Retrofit.Builder> retrofitBuilderProvider,
      Provider<OkHttpClient.Builder> okHttpClientBuilderProvider,
      Provider<AuthInterceptor> authInterceptorProvider) {
    return new NetworkModule_ProvideQaarenAPIFactory(module, retrofitBuilderProvider, okHttpClientBuilderProvider, authInterceptorProvider);
  }

  public static EcomAPI provideQaarenAPI(NetworkModule instance, Retrofit.Builder retrofitBuilder,
      OkHttpClient.Builder okHttpClientBuilder, AuthInterceptor authInterceptor) {
    return Preconditions.checkNotNullFromProvides(instance.provideQaarenAPI(retrofitBuilder, okHttpClientBuilder, authInterceptor));
  }
}
