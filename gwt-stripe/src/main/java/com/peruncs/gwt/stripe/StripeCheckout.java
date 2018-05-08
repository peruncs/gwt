package com.peruncs.gwt.stripe;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "StripeCheckout", namespace = JsPackage.GLOBAL)
public class StripeCheckout {
    public static native StripeCheckout configure(Settings settings);
    public native void open();
    public native void close();
}
