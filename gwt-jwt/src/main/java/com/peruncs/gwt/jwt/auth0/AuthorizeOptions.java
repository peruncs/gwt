package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class AuthorizeOptions extends BaseAuthOptions {
    public String connection;
    public String state;
    public String nonce;
    public boolean owp;
}
