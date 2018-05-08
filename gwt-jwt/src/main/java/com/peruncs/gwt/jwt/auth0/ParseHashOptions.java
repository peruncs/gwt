package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class ParseHashOptions {
    public String hash;
    public String state;
    public String nonce;
    public boolean _idTokenVerification;
}
