package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class ManagementOptions {
    public String domain;
    public String token;
    public String clientID;
    public String clientSecret;
    public String audience;
    public String scope;
    public TokenProvider tokenProvider;
    public boolean telemetry;
}
