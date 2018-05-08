package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class Auth0Error {
    public Any error;
    public String errorDescription;
    public String code;
    public String description;
    public String name;
    public String policy;
    public Any original;
    public int statusCode;
    public String statusText;
}