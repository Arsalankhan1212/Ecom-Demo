package com.ngen.ecom.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ`\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016Jh\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/ngen/ecom/utils/QuoteSpanClass;", "Landroid/text/style/LeadingMarginSpan;", "Landroid/text/style/LineBackgroundSpan;", "backgroundColor", "", "stripeColor", "stripeWidth", "", "gap", "(IIFF)V", "drawBackground", "", "c", "Landroid/graphics/Canvas;", "p", "Landroid/graphics/Paint;", "left", "right", "top", "baseline", "bottom", "text", "", "start", "end", "lnum", "drawLeadingMargin", "x", "dir", "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "app_debug"})
public final class QuoteSpanClass implements android.text.style.LeadingMarginSpan, android.text.style.LineBackgroundSpan {
    private final int backgroundColor = 0;
    private final int stripeColor = 0;
    private final float stripeWidth = 0.0F;
    private final float gap = 0.0F;
    
    public QuoteSpanClass(int backgroundColor, int stripeColor, float stripeWidth, float gap) {
        super();
    }
    
    @java.lang.Override
    public int getLeadingMargin(boolean first) {
        return 0;
    }
    
    @java.lang.Override
    public void drawLeadingMargin(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
    android.graphics.Paint p, int x, int dir, int top, int baseline, int bottom, @org.jetbrains.annotations.NotNull
    java.lang.CharSequence text, int start, int end, boolean first, @org.jetbrains.annotations.NotNull
    android.text.Layout layout) {
    }
    
    @java.lang.Override
    public void drawBackground(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
    android.graphics.Paint p, int left, int right, int top, int baseline, int bottom, @org.jetbrains.annotations.NotNull
    java.lang.CharSequence text, int start, int end, int lnum) {
    }
}