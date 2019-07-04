package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true)
public class DBConnection {

    @JsConstructor
    public DBConnection(Any request, JsPropertyMap<?> option) {
    }

    public native void signup(DbSignUpOptions options, Auth0Callback<Auth0Error, Any> callback);

    public native void changePassword(ChangePasswordOptions options, Auth0Callback<Auth0Error, Any> callback);
}
