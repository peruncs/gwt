package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class TokenProvider {
    public boolean enableCache;
    public int cacheTTLInSeconds;
}
