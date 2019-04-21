package com.peruncs.gwt.cookies;

import elemental2.core.JsMap;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class Cookies {

    public native static JsMap<String, Any> get();

    public native static String get(String name);

    public native static String get(String name, CookieOptions options);

    public native static JsMap<String, Any> getJSON(String name);

    public native static JsMap<String, Any> getJSON(String name, CookieOptions options);

    public native static void set(String name, String value);

    public native static void set(String name, String value, CookieOptions options);

    public native static String remove(String name);

    public native static String remove(String name, CookieOptions options);
}
