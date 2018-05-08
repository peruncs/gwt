package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class PasswordlessVerifyOptions {
    public VerificationType type;
    public String phoneNumber;
    public String email;
    public String connection;
    public String verificationCode;
}
