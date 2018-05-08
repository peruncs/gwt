package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class RenewAuthOptions {
    public String domain;
    public String clientID;
    public String redirectUri;
    public String responseType;
    public ResponseMode responseMode;
    public String state;
    public String nonce;
    public String scope;
    public String audience;
    public String postMessageDataType;
    public String ostMessageOrigin;
    public int timeout;
    public boolean usePostMessage;
}
