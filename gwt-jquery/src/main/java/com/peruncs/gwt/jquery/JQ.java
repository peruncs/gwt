package com.peruncs.gwt.jquery;


import elemental2.dom.Node;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


@JsType(name = "jQuery", isNative = true, namespace = JsPackage.GLOBAL)
public class JQ {
//    public  static native <T extends JQueryElement<T>> T $(Object selector);
//    public  static native  <T extends JQueryElement> T $(Object selector, Object context);
//    public  static native  <T extends JQueryElement> T $(Object selector, JQueryElement context);
    public  static native <T extends JQElement<T>> T $(Node selector);
//    public  static native  <T extends JQueryElement> T $(JQueryElement selector, Object context);
//    public  static native  <T extends JQueryElement> T $(JQueryElement selector, JQueryElement context);
    public  static native  <T extends JQElement<T>> T $(String selector);
//    public  static native  <T extends JQueryElement> T $(String selector, Object context);
//    public  static native  <T extends JQueryElement> T $(String selector, JQueryElement context);
}