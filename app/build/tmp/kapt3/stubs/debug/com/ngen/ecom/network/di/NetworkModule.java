package com.ngen.ecom.network.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000bH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/ngen/ecom/network/di/NetworkModule;", "", "()V", "provideOkHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "networkInterceptor", "Lcom/ngen/ecom/network/api/NetworkInterceptor;", "provideOkHttpClientBuilder$app_debug", "provideQaarenAPI", "Lcom/ngen/ecom/network/api/EcomAPI;", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "okHttpClientBuilder", "authInterceptor", "Lcom/ngen/ecom/network/api/AuthInterceptor;", "provideRetrofitBuilder", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit.Builder provideRetrofitBuilder() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.ngen.ecom.network.api.EcomAPI provideQaarenAPI(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit.Builder retrofitBuilder, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient.Builder okHttpClientBuilder, @org.jetbrains.annotations.NotNull
    com.ngen.ecom.network.api.AuthInterceptor authInterceptor) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient.Builder provideOkHttpClientBuilder$app_debug(@org.jetbrains.annotations.NotNull
    com.ngen.ecom.network.api.NetworkInterceptor networkInterceptor) {
        return null;
    }
}