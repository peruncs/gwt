package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class AuthorizeOptions extends BaseAuthOptions {

    public String connection;
    public String state;
    public String nonce;
    public boolean owp;
    public int leeway;
    public Any[] plugins;
    public boolean _disableDeprecationWarnings;

    /** This is a non-standard way to pass configuration to the underlying Lock.
     *
     * @link https://community.auth0.com/t/how-to-open-login-signup-on-the-universal-login-hosted-page/12642
     *
     * */
    public String mode; //"signUp", "login" or "forgotPassword"

}
