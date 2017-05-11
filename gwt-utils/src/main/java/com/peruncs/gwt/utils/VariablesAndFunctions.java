package com.peruncs.gwt.utils;


/**
 * JavaScript global variables and functions utils.
 *
 */
//@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class VariablesAndFunctions {

    public native static <T> T eval(String expresion);

//    @JsOverlay
//    public boolean isJSVariableDefined(String jsVariableName) {
//        return Boolean.TRUE.equals(eval("!!window[" + jsVariableName + "]"));
//    }
//    
//    @JsOverlay
//    public static <T> T getJSVariableValue(String jsVariableName) {
//        return eval("!!window[" + jsVariableName + "]");
//    }
    public static native String getStringJSVariable(String jsVar) /*-{
        return $wnd[jsVar].toString();
    }-*/;

    public static native Object getJSVariable(String jsVar) /*-{
        return $wnd[jsVar];
    }-*/;
    
    public static native boolean isVariableDefined(String jsVar)/*-{
        return !!$wnd[jsVar];
    }-*/;

    public static native boolean isFunctionDefined(String functionName)/*-{
                return typeof functionName == 'function';
    }-*/;
}
