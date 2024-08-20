package com.ngen.ecom.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000 72\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010&\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\'\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010(\u001a\u00020$2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020$2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J\u0010\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0010\u0010,\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010\u0004J\u0010\u0010.\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010\u0004J\u000e\u0010/\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u00100\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004J\u0010\u00101\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u000e\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\fJ\u000e\u00104\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0013\u0010!\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0006\u00a8\u00068"}, d2 = {"Lcom/ngen/ecom/utils/AppPreference;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "country", "getCountry", "email", "getEmail", "isDarkModeEnabled", "", "()Z", "isSkipLogin", "languageCode", "getLanguageCode", "latitude", "getLatitude", "longitude", "getLongitude", "mobileNumber", "getMobileNumber", "profileImage", "getProfileImage", "profileThumbnail", "getProfileThumbnail", "userId", "", "getUserId", "()I", "userName", "getUserName", "uuid", "getUuid", "clearPreference", "", "saveAddress", "saveCountry", "saveEmail", "saveLatitude", "saveLongitude", "saveMobileNumber", "phone", "saveProfileImage", "profile", "saveProfileThumbnail", "saveUserId", "saveUserName", "saveUuid", "setAppTheme", "isDarkMode", "setLanguageCode", "setSkipLogin", "isSkip", "Companion", "app_debug"})
public final class AppPreference {
    @org.jetbrains.annotations.NotNull
    private static final com.ngen.ecom.utils.AppPreference sharePref = null;
    private static android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String APP_THEME = "App_Theme";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LANGUAGE = "language";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String USER_NAME = "USER_NAME";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EMAIL = "EMAIL";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String USER_ID = "USER_ID";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String UUID = "UUID";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MOBILE_NUM = "MOBILE_NUM";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PROFILE_IMAGE = "PROFILE_IMAGE";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PROFILE_THUMB_IMG = "PROFILE_THUMBNAIL";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LOCATION_LATITIUDE = "LOCATION_LAT";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LOCATION_LONGITUDE = "LOCATION_LONG";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ADDRESS = "ADDRESS";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String COUNTRY = "COUNTRY";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String IS_LOGIN_SKIP = "LOGIN_SKIP";
    @org.jetbrains.annotations.NotNull
    public static final com.ngen.ecom.utils.AppPreference.Companion Companion = null;
    
    public AppPreference() {
        super();
    }
    
    public final void setAppTheme(boolean isDarkMode) {
    }
    
    public final boolean isDarkModeEnabled() {
        return false;
    }
    
    public final void setLanguageCode(@org.jetbrains.annotations.NotNull
    java.lang.String languageCode) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLanguageCode() {
        return null;
    }
    
    public final void saveUserName(@org.jetbrains.annotations.Nullable
    java.lang.String userName) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void saveEmail(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void saveUserId(int userId) {
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final void saveUuid(@org.jetbrains.annotations.Nullable
    java.lang.String uuid) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUuid() {
        return null;
    }
    
    public final void saveMobileNumber(@org.jetbrains.annotations.Nullable
    java.lang.String phone) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMobileNumber() {
        return null;
    }
    
    public final void saveProfileImage(@org.jetbrains.annotations.Nullable
    java.lang.String profile) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfileImage() {
        return null;
    }
    
    public final void saveProfileThumbnail(@org.jetbrains.annotations.Nullable
    java.lang.String profile) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfileThumbnail() {
        return null;
    }
    
    public final void saveLatitude(@org.jetbrains.annotations.Nullable
    java.lang.String latitude) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLatitude() {
        return null;
    }
    
    public final void saveLongitude(@org.jetbrains.annotations.Nullable
    java.lang.String longitude) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLongitude() {
        return null;
    }
    
    public final void saveCountry(@org.jetbrains.annotations.Nullable
    java.lang.String country) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final void saveAddress(@org.jetbrains.annotations.Nullable
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setSkipLogin(boolean isSkip) {
    }
    
    public final boolean isSkipLogin() {
        return false;
    }
    
    public final void clearPreference() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/ngen/ecom/utils/AppPreference$Companion;", "", "()V", "ADDRESS", "", "APP_THEME", "COUNTRY", "EMAIL", "IS_LOGIN_SKIP", "LANGUAGE", "LOCATION_LATITIUDE", "LOCATION_LONGITUDE", "MOBILE_NUM", "PROFILE_IMAGE", "PROFILE_THUMB_IMG", "USER_ID", "USER_NAME", "UUID", "sharePref", "Lcom/ngen/ecom/utils/AppPreference;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.ngen.ecom.utils.AppPreference getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}