package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class CrossOriginLoginOptions {
    public String username;
    public String email;
    public String password;
    public String realm;
}
