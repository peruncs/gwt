package com.peruncs.gwt.jquery;
import com.peruncs.gwt.utils.Callback;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(name = "jQuery", isNative = true, namespace = JsPackage.GLOBAL)
public class JQueryElement<T> {
 
    public native JQueryElement<T> first();

    public native JQueryElement<T> get(int index);

    @JsProperty(name="length")
    public native int length();

    public native JQueryElement<T> on(String events, Callback handler);
    
}
