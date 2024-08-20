package com.ngen.ecom.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ngen/ecom/utils/ImageGetter;", "Landroid/text/Html$ImageGetter;", "res", "Landroid/content/res/Resources;", "htmlTextView", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "(Landroid/content/res/Resources;Landroid/widget/TextView;Landroid/content/Context;)V", "getDrawable", "Landroid/graphics/drawable/Drawable;", "url", "", "getScreenWidth", "", "BitmapDrawablePlaceHolder", "app_debug"})
public final class ImageGetter implements android.text.Html.ImageGetter {
    @org.jetbrains.annotations.NotNull
    private final android.content.res.Resources res = null;
    @org.jetbrains.annotations.NotNull
    private final android.widget.TextView htmlTextView = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    public ImageGetter(@org.jetbrains.annotations.NotNull
    android.content.res.Resources res, @org.jetbrains.annotations.NotNull
    android.widget.TextView htmlTextView, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.Nullable
    java.lang.String url) {
        return null;
    }
    
    private final int getScreenWidth() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/ngen/ecom/utils/ImageGetter$BitmapDrawablePlaceHolder;", "Landroid/graphics/drawable/BitmapDrawable;", "res", "Landroid/content/res/Resources;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V", "drawable", "Landroid/graphics/drawable/Drawable;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setDrawable", "app_debug"})
    public static final class BitmapDrawablePlaceHolder extends android.graphics.drawable.BitmapDrawable {
        @org.jetbrains.annotations.Nullable
        private android.graphics.drawable.Drawable drawable;
        
        public BitmapDrawablePlaceHolder(@org.jetbrains.annotations.NotNull
        android.content.res.Resources res, @org.jetbrains.annotations.Nullable
        android.graphics.Bitmap bitmap) {
            super();
        }
        
        @java.lang.Override
        public void draw(@org.jetbrains.annotations.NotNull
        android.graphics.Canvas canvas) {
        }
        
        public final void setDrawable(@org.jetbrains.annotations.NotNull
        android.graphics.drawable.Drawable drawable) {
        }
    }
}