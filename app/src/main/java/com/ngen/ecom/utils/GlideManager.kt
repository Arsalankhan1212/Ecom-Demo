package com.ngen.ecom.utils

import android.content.Context
import android.graphics.drawable.Drawable
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.ngen.ecom.R

object GlideManager {

    fun load(context: Context, path : String) : RequestBuilder<Drawable>{
        //preloading the image
        Glide.with(context)
            .load(path)
            .error(R.drawable.ic_error)
            .preload()

        val requestOptions: RequestOptions = RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .skipMemoryCache(true)
            .dontAnimate()
            .dontTransform()
            .placeholder(R.drawable.ic_placeholder)
            .priority(Priority.IMMEDIATE)
            .format(DecodeFormat.DEFAULT)

        return Glide.with(context)
            .load(path)
            .thumbnail(0.5f )
            .apply(requestOptions)
            .error(R.drawable.ic_error)
    }
}