package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class BaseAuthOptions {
    public int leeway;
    public String domain;
    public String clientID;
    public String responseType;
    public String responseMode;
    public String redirectUri;
    public String scope;
    public String audience;

    /** This is a non-standard way to pass configuration to the underlying Lock.
     *
     * @link https://community.auth0.com/t/how-to-open-login-signup-on-the-universal-login-hosted-page/12642
     *
     * */
    public String mode; //"signUp", "login" or "forgotPassword"
}
