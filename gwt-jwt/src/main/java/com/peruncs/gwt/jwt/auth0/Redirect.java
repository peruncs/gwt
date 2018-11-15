package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true)
public class Redirect {

    @JsConstructor
    public Redirect(Any client, JsPropertyMap<?> options) {
    }

    public native void loginWithCredentials(LoginWithCredentialsOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void signupAndLogin(SignupAndLoginOptions options, Auth0Callback<Auth0Error,Any> callback);

}
