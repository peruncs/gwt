package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class DbSignUpOptions {
    public String email;
    public String password;
    public String connection;
    public String scope;
    public Any user_metadata;
}
