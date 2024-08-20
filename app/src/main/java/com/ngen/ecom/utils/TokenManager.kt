package com.ngen.ecom.utils

import android.annotation.SuppressLint
import android.content.Context
import com.ngen.ecom.utils.Constants.TOKEN_PRE_FILE_NAME
import com.ngen.ecom.utils.Constants.USER_TOKEN
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class TokenManager @Inject constructor(@ApplicationContext context: Context) {

    private var mPref = context.getSharedPreferences(TOKEN_PRE_FILE_NAME, Context.MODE_PRIVATE)

    fun saveUserToken(token: String) {
        val editor = mPref.edit()
        editor.putString(USER_TOKEN, token).apply()
    }

    fun getUserToken(): String? = mPref.getString(USER_TOKEN, "")

    fun clearToken(){
        mPref.edit().clear().apply()
    }
}