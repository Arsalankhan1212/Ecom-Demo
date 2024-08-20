package com.ngen.ecom.utils

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class AppPreference {
    companion object {
        private val sharePref = AppPreference()
        private lateinit var sharedPreferences: SharedPreferences
        private val APP_THEME = "App_Theme"
        private val LANGUAGE = "language"

        private val USER_NAME= "USER_NAME"
        private val EMAIL = "EMAIL"
        private val USER_ID = "USER_ID"
        private val UUID = "UUID"
        private val MOBILE_NUM = "MOBILE_NUM"
        private val PROFILE_IMAGE = "PROFILE_IMAGE"
        private val PROFILE_THUMB_IMG = "PROFILE_THUMBNAIL"
        private val LOCATION_LATITIUDE = "LOCATION_LAT"
        private val LOCATION_LONGITUDE = "LOCATION_LONG"
        private val ADDRESS = "ADDRESS"
        private val COUNTRY = "COUNTRY"
        private val IS_LOGIN_SKIP = "LOGIN_SKIP"

        fun getInstance(context: Context): AppPreference {
            if (!::sharedPreferences.isInitialized) {
                synchronized(AppPreference::class.java) {
                    if (!::sharedPreferences.isInitialized) {
                        sharedPreferences = context.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
                    }
                }
            }
            return sharePref
        }
    }

    fun setAppTheme(isDarkMode: Boolean) {
        sharedPreferences.edit()
            .putBoolean(APP_THEME, isDarkMode)
            .apply()
    }

    val isDarkModeEnabled: Boolean get() = sharedPreferences.getBoolean(APP_THEME, false)

    fun setLanguageCode(languageCode: String) {
        sharedPreferences.edit()
            .putString(LANGUAGE, languageCode)
            .apply()
    }

    val languageCode: String get() = sharedPreferences.getString(LANGUAGE,"en")!!


    fun saveUserName(userName : String?) = sharedPreferences.edit().putString(USER_NAME,userName).apply()
    val userName : String? get() = sharedPreferences.getString(USER_NAME,null)

    fun saveEmail(email : String?) = sharedPreferences.edit().putString(EMAIL, email).apply()
    val email : String? get() = sharedPreferences.getString(EMAIL, null)

    fun saveUserId(userId : Int) = sharedPreferences.edit().putInt(USER_ID,userId).apply()
    val userId : Int get() = sharedPreferences.getInt(USER_ID, -1)

    fun saveUuid(uuid : String?) = sharedPreferences.edit().putString(UUID,uuid).apply()
    val uuid : String? get() = sharedPreferences.getString(UUID, null)

    fun saveMobileNumber(phone : String?) = sharedPreferences.edit().putString(MOBILE_NUM,phone).apply()
    val mobileNumber : String? get() : String? = sharedPreferences.getString(MOBILE_NUM, null)

    fun saveProfileImage(profile : String?) = sharedPreferences.edit().putString(PROFILE_IMAGE,profile).apply()
    val profileImage : String? get() = sharedPreferences.getString(PROFILE_IMAGE, null)

    fun saveProfileThumbnail(profile : String?) = sharedPreferences.edit().putString(PROFILE_THUMB_IMG,profile).apply()
    val profileThumbnail : String? get() = sharedPreferences.getString(PROFILE_THUMB_IMG, null)

    fun saveLatitude(latitude : String?) = sharedPreferences.edit().putString(
        LOCATION_LATITIUDE,latitude).apply()
    val latitude : String? get() = sharedPreferences.getString(LOCATION_LATITIUDE, null)

    fun saveLongitude(longitude : String?) = sharedPreferences.edit().putString(
        LOCATION_LONGITUDE,longitude).apply()
    val longitude : String? get() = sharedPreferences.getString(LOCATION_LONGITUDE, null)

    fun saveCountry(country : String?) = sharedPreferences.edit().putString(
        COUNTRY,country).apply()
    val country : String? get() = sharedPreferences.getString(COUNTRY, null)

    fun saveAddress(address : String?) = sharedPreferences.edit().putString(
        ADDRESS,address).apply()
    val address : String? get() = sharedPreferences.getString(ADDRESS, null)

    fun setSkipLogin(isSkip: Boolean) {
        sharedPreferences.edit()
            .putBoolean(IS_LOGIN_SKIP, isSkip)
            .apply()
    }

    val isSkipLogin: Boolean get() = sharedPreferences.getBoolean(IS_LOGIN_SKIP, false)

    fun clearPreference() {
        sharedPreferences.edit().clear().apply()
    }

}