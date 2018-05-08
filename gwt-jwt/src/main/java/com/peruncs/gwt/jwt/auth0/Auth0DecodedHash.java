package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Auth0DecodedHash {

    public String accessToken;
    public String idToken;
    public Any idTokenPayload;
    public Any appState;
    public String refreshToken;
    public String state;
    public int expiresIn;
    public String tokenType;
    public String scope;

}