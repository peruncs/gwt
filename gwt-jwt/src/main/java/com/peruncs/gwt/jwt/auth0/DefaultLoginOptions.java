package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class DefaultLoginOptions extends LoginOptions {
    public String audience;
    public String realm;
}