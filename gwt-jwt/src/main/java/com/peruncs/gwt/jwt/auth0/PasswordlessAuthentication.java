package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true)
public class PasswordlessAuthentication {

    @JsConstructor
    public PasswordlessAuthentication(Any request, JsPropertyMap<?> option) {
    }

    public native String buildVerifyUrl(PasswordlessVerifyOptions options);

    public native void start(PasswordlessStartOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void verify(PasswordlessVerifyOptions options, Auth0Callback<Auth0Error,Any> callback);
}
