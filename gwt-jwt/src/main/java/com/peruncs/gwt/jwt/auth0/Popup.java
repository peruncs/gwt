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

    public native Any preload(JsPropertyMap<?> options);

    public native void callback(CallbackOptions options);

    public native void authorize(AuthorizeOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void loginWithCredentials(LoginWithCredentialsOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void passwordlessVerify(PasswordlessVerifyOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void signupAndLogin(SignupAndLoginOptions options, Auth0Callback<Auth0Error,Any> callback);


    @JsType
    static public class CallbackOptions {
        public String hash;
        public String state;
        public String nonce;
        public String _idTokenVerification;
    }

}
