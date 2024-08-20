package com.ngen.ecom.network.api

import android.content.Context
import com.ngen.ecom.R
import com.ngen.ecom.utils.NetworkUtil
import com.ngen.ecom.utils.NoInternetException
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class NetworkInterceptor @Inject constructor(@ApplicationContext val context: Context) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!NetworkUtil.isAvailable(context))
            throw NoInternetException(context.getString(R.string.str_no_internet_connection))

        return chain.proceed(chain.request())
    }
}