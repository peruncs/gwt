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

    public native <Any> void loginWithCredentials(LoginWithCredentialsOptions options, Auth0Callback<Any> callback);

    public native <Any> void signupAndLogin(SignupAndLoginOptions options, Auth0Callback<Any> callback);

}
