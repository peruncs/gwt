package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true)
public class CrossOriginAuthentication {

    @JsConstructor
    public CrossOriginAuthentication(WebAuth any, JsPropertyMap<?> options) {
    }

    public native <Any> void login(CrossOriginLoginOptions options, Auth0Callback<Any> callback);

    public native void callback();
}
