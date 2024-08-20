package com.ngen.ecom.utils

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.ngen.ecom.R
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle


fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Activity.customToast(message: String,toastStyle : MotionToastStyle) {
    MotionToast.createToast(
        this,
        message =  message,
        style = toastStyle,
        position = MotionToast.GRAVITY_BOTTOM,
        duration = MotionToast.LONG_DURATION,
        font = ResourcesCompat.getFont(this, R.font.font_manrope_medium)
    )
}

fun Activity.customToastCenter(message: String, toastStyle : MotionToastStyle) {
    MotionToast.createToast(
        this,
        message =  message,
        style = toastStyle,
        position = MotionToast.GRAVITY_CENTER,
        duration = MotionToast.LONG_DURATION,
        font = ResourcesCompat.getFont(this, R.font.font_manrope_medium)
    )
}