package com.peruncs.gwt.cookies;

import jsinterop.annotations.JsType;

/**
 * Cookie options.
 */
@JsType
public class CookieOptions {
    public int expires;
    public String path;
    public String domain;
    public boolean secure;
}



