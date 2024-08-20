package com.ngen.ecom.network

import android.util.Log
import com.ngen.ecom.utils.NoInternetException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow

/*This is a generic function to handle API response and Validate it
* 1) handling try catch error
* 2) handling API Error
* */
fun <T> result(call: suspend () -> retrofit2.Response<T>): Flow<Response<T>> = channelFlow {
    send(Response.Loading())
    try {
        call().let {

            if (it.isSuccessful && it.body() != null) {
                send(Response.Success(it.body()))
            } else {
                it.errorBody().let { error ->
                    error?.close()
                    send(Response.Error(error.toString()))
                }
            }
        }
    } catch (e: Throwable) {
        if (e is NoInternetException){
            send(Response.NetworkError(e.message.toString()))
        }
        else if (e.message != null) //TODO: Take message from response json object
            send(Response.Error(e.message.toString()))
        else
            send(Response.Error("Un-Known error on server side"))
    }
}