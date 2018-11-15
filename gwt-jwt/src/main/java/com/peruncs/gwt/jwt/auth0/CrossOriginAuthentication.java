package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true)
public class CrossOriginAuthentication {

    @JsConstructor
    public CrossOriginAuthentication(WebAuth any, JsPropertyMap<?> options) {
    }

    public native void login(CrossOriginLoginOptions options, Auth0Callback<Auth0Error, Any> callback);

    public native void callback();
}
