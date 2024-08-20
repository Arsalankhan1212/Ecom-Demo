package com.ngen.ecom.network.api

import android.util.Log
import com.ngen.ecom.utils.TokenManager
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor() : Interceptor {

    @Inject
    lateinit var tokenManager : TokenManager

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
        request.addHeader("x-access-token","${tokenManager.getUserToken()}")
       // request.addHeader("x-access-token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJhbGlAZ21haWwuY29tIiwiaWF0IjoxNjk1Mzk0Mzk1LCJleHAiOjE3MjY5MzAzOTV9.T6i35HFjUlDMlJ9rvP4atnq6jkNl3uTC_R62smiKrUw")
        return chain.proceed(request.build())

    }
}