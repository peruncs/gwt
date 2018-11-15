package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class ChangePasswordOptions {
    public String connection;
    public String send;
    public String phoneNumber;
    public String email;
    public Any authParams;
}
