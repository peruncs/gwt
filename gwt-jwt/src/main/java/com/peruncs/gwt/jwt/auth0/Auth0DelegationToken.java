package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class Auth0DelegationToken {
    public int expiresIn;
    public String idToken;
    public String tokenType;
}
