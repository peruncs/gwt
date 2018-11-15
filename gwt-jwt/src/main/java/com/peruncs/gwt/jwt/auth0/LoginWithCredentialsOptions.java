package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class LoginWithCredentialsOptions {
    public String redirectUri;
    public String responseType;
    public String responseMode;
    public String scope;
}
