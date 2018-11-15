package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(isNative = true)
public class Management {

    @JsConstructor
    public Management(ManagementOptions options) {
    }

    public native void getUser(String userId, Auth0Callback<Auth0Error,Auth0UserProfile> callback);

    public native void patchUserMetadata(String userId, Any userMetadata, Auth0Callback<Auth0Error,Auth0UserProfile> callback);

    public native void linkUser(String userId, String secondaryUserToken, Auth0Callback<Auth0Error,Any> callback);
}
