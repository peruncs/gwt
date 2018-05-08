package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class LogoutOptions {
    public String clientID;
    public String returnTo;
    boolean federated;
}
