package com.example.parcialtp3_2.code_behind

enum class ViewsRoutes(
    private val route: String
) {
    START("/"),
    SIGN_UP("sign"),
    LOG_IN("log"),
    HOME("home"),
    CATEGORYS("categorys"),
    CREATE_ACCOUNT("createAccount"),
    FORGOT_PSWD("forgotPswd"),
    SECURITY_PIN("securityPin"),
    NEW_PSWD("newPswd"),
    SUCCESS("success"),
    PROFILE("profile"),
    TRANSACTIONS("trans"),
    SECURITY("security"),
    CHANGE_PIN("changePin"),
    LOAD("pantallaCargaPin"),
    DELETE("pantallDelete"),
    ADD("pantallaAdd"),
    FINGER_POINT("fingerPoint"),
    JOHN_FINGER("johnFinger"),
    ADD_FINGER("addFinger"),
    TERMS_AND_CONDITIONS("terms"),
    EDIT_PROFILE("editProfile");

    fun getRoute(): String {
        return this.route
    }
}