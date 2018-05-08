package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class Auth0Identity {
    public String connection;
    public boolean isSocial;
    public String provider;
    public String user_id;
}