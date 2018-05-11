package com.peruncs.gwt.stripe;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "StripeCheckout", namespace = JsPackage.GLOBAL)
public class StripeCheckout {
    public static native StripeCheckout configure(CheckoutSettings settings);
    public native void open(CheckoutSettings settings);
    public native void close();
}
