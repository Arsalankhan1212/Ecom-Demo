package com.ngen.ecom.network;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\f\r\u000e\u000fB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/ngen/ecom/network/Response;", "T", "", "data", "errorMessage", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorMessage", "()Ljava/lang/String;", "Error", "Loading", "NetworkError", "Success", "Lcom/ngen/ecom/network/Response$Error;", "Lcom/ngen/ecom/network/Response$Loading;", "Lcom/ngen/ecom/network/Response$NetworkError;", "Lcom/ngen/ecom/network/Response$Success;", "app_debug"})
public abstract class Response<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable
    private final T data = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String errorMessage = null;
    
    private Response(T data, java.lang.String errorMessage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ngen/ecom/network/Response$Error;", "T", "Lcom/ngen/ecom/network/Response;", "errorMessage", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.ngen.ecom.network.Response<T> {
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
        T data) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ngen/ecom/network/Response$Loading;", "T", "Lcom/ngen/ecom/network/Response;", "()V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.ngen.ecom.network.Response<T> {
        
        public Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/ngen/ecom/network/Response$NetworkError;", "T", "Lcom/ngen/ecom/network/Response;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class NetworkError<T extends java.lang.Object> extends com.ngen.ecom.network.Response<T> {
        
        public NetworkError(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ngen/ecom/network/Response$Success;", "T", "Lcom/ngen/ecom/network/Response;", "data", "(Ljava/lang/Object;)V", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.ngen.ecom.network.Response<T> {
        
        public Success(@org.jetbrains.annotations.Nullable
        T data) {
        }
        
        public Success() {
        }
    }
}