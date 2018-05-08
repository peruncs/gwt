package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class LoginOptions {
    public String username;
    public String password;
    public String scope;
}
