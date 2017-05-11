package com.peruncs.gwt.jquery;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


@JsType(name = "jQuery", isNative = true, namespace = JsPackage.GLOBAL)
public class JQuery {
    public  static native <T extends JQueryElement<T>> T $(Object selector);
//    public  static native  <T extends JQueryElement> T $(Object selector, Object context);
//    public  static native  <T extends JQueryElement> T $(Object selector, JQueryElement context);
    public  static native <T extends JQueryElement<T>> T $(JQueryElement selector);
//    public  static native  <T extends JQueryElement> T $(JQueryElement selector, Object context);
//    public  static native  <T extends JQueryElement> T $(JQueryElement selector, JQueryElement context);
    public  static native  <T extends JQueryElement<T>> T $(String selector);
//    public  static native  <T extends JQueryElement> T $(String selector, Object context);
//    public  static native  <T extends JQueryElement> T $(String selector, JQueryElement context);
}