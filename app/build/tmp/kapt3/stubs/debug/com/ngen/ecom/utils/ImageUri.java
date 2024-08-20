package com.ngen.ecom.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lcom/ngen/ecom/utils/ImageUri;", "", "()V", "getBitmapFromUri", "Landroid/graphics/Bitmap;", "activity", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "getFileName", "", "contentResolver", "Landroid/content/ContentResolver;", "selectedImageUri", "getMimeType", "app_debug"})
public final class ImageUri {
    @org.jetbrains.annotations.NotNull
    public static final com.ngen.ecom.utils.ImageUri INSTANCE = null;
    
    private ImageUri() {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getBitmapFromUri(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMimeType(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFileName(@org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull
    android.net.Uri selectedImageUri) {
        return null;
    }
}