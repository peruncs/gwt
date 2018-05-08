package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class BaseAuthOptions {
    public String domain;
    public String clientID;
    public String responseType;
    public ResponseMode responseMode;
    public String redirectUri;
    public String scope;
    public String audience;
}
