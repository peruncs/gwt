package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class ResourceOwnerLoginOptions extends LoginOptions {
    public String connection;
    public String device;
}
