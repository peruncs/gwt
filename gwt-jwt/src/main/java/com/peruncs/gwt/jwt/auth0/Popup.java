package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true)
public class Popup {

    @JsConstructor
    public Popup(Any client, JsPropertyMap<?> options) {
    }

    public native Any buildPopupHandler();

    public native Any preload(JsPropertyMap<?> any);

    public native void callback(CallbackOptions options);

    public native <Any> void loginWithCredentials(LoginWithCredentialsOptions options, Auth0Callback<Any> callback);

    public native <Any> void passwordlessVerify(PasswordlessVerifyOptions options, Auth0Callback<Any> callback);

    public native <Any> void signupAndLogin(SignupAndLoginOptions options, Auth0Callback<Any> callback);

    public native <Any> void authorize(AuthOptions options, Auth0Callback<Any> callback);

    @JsType
    static public class CallbackOptions {
        public String hash;
        public String state;
        public String nonce;
        public String _idTokenVerification;
    }

}
