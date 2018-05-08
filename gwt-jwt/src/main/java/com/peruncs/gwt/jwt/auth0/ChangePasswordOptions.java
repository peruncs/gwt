package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class ChangePasswordOptions {
    public String connection;
    public String email;
    public String password;
}
