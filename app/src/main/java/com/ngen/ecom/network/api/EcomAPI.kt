package com.ngen.ecom.network.api

import com.ngen.ecom.model.product.ProductResponse
import retrofit2.Response
import retrofit2.http.GET

interface EcomAPI {
    @GET("products")
    suspend fun getProductList() : Response<ProductResponse>
}