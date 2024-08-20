package com.ngen.ecom.utils

import android.content.Context

open class LoadingUtils {
    companion object {
        private var fullScreenLoader: FullScreenLoader? = null
        fun showDialog(
            context: Context?,
            isCancelable: Boolean
        ) {
            hideDialog()
            if (context != null) {
                try {
                    fullScreenLoader = FullScreenLoader(context)
                    fullScreenLoader?.let { loader->
                        loader.setCanceledOnTouchOutside(true)
                        loader.setCancelable(isCancelable)
                        loader.show()
                    }

                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }

        fun hideDialog() {
            if (fullScreenLoader!=null && fullScreenLoader?.isShowing!!) {
                fullScreenLoader = try {
                    fullScreenLoader?.dismiss()
                    null
                } catch (e: Exception) {
                    null
                }
            }
        }

    }

}
