package com.ngen.ecom.network.di

import com.google.gson.GsonBuilder
import com.ngen.ecom.network.api.AuthInterceptor
import com.ngen.ecom.network.api.NetworkInterceptor
import com.ngen.ecom.network.api.EcomAPI
import com.ngen.ecom.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofitBuilder() : Retrofit.Builder{
        val gson = GsonBuilder()
            .setLenient()
            .create()
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(BASE_URL)
    }


    @Provides
    @Singleton
    fun provideQaarenAPI(retrofitBuilder : Retrofit.Builder, okHttpClientBuilder: OkHttpClient.Builder, authInterceptor: AuthInterceptor) : EcomAPI{
        return retrofitBuilder.client(okHttpClientBuilder.addInterceptor(authInterceptor).build()).build().create()
    }

    @Provides
    @Singleton
    internal fun provideOkHttpClientBuilder(networkInterceptor : NetworkInterceptor): OkHttpClient.Builder {
        val logging = HttpLoggingInterceptor()
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .addInterceptor(networkInterceptor)
    }

}