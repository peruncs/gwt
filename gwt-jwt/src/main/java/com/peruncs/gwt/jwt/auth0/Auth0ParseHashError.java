package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class Auth0ParseHashError extends Auth0Error {
    public String state;
}
