package com.ngen.ecom.network.repository

import com.ngen.ecom.network.api.EcomAPI
import com.ngen.ecom.network.result
import javax.inject.Inject

class EcomRepository @Inject constructor(private val ecomApi: EcomAPI) {

    suspend fun getProductList() = result {
        ecomApi.getProductList()
    }

}