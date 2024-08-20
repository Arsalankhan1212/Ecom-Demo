package com.ngen.ecom.utils

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import com.ngen.ecom.R

class FullScreenLoader(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_full_screen_loading)

        window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT
        )
        window?.setBackgroundDrawableResource(android.R.color.transparent)


    }
}