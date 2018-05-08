package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class AuthOptions extends BaseAuthOptions {
    public int leeway;
    public Any[] plugins;
    public boolean _disableDeprecationWarnings;
}
