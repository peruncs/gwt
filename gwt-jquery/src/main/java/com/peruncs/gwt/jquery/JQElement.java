package com.peruncs.gwt.jquery;

import com.peruncs.gwt.utils.Callback;
import elemental2.dom.Node;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(name = "jQuery", isNative = true, namespace = JsPackage.GLOBAL)
public class JQElement<T> extends Node{
 
    public native JQElement<T> first();

    public native JQElement<T> get(int index);

    @JsProperty(name="length")
    public native int length();

    public native JQElement<T> on(String events, Callback handler);
    
}
