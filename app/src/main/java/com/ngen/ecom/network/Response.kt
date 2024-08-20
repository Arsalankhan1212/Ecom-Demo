package com.ngen.ecom.network

sealed class Response<T>(val data : T?= null, val errorMessage : String?= null){

    class Loading<T>() : Response<T>()
    class Success<T>(data: T?= null) : Response<T>(data= data)
    class Error<T>(errorMessage: String, data: T?= null) : Response<T>(data,errorMessage = errorMessage)
    class NetworkError<T>(message : String) : Response<T>(errorMessage = message)
}
