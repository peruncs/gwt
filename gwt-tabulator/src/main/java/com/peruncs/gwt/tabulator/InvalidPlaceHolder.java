package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

/**
 * The value to be displayed if an invalid input date/time is provided (default:""), this can take three different types of value:
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface InvalidPlaceHolder {

    /**
     * a string  will be displayed instead of the cells value
     *
     * @param stringPlaceHolder
     * @return
     */
    @JsOverlay
    static InvalidPlaceHolder of(String stringPlaceHolder) {
        return Js.cast(stringPlaceHolder);
    }

    /**
     * true - a boolean of true will display the cells original value.
     *
     * @param displayCellOriginalValue
     * @return
     */
    @JsOverlay
    static InvalidPlaceHolder of(boolean displayCellOriginalValue) {
        return Js.cast(displayCellOriginalValue);
    }

    /**
     * a function passed into this will be called with the original value of the cell passed into its first argument
     *
     * @param callback
     * @return
     */
    @JsOverlay
    static InvalidPlaceHolder of(CallbackRet1<Any, Any> callback) {
        return Js.cast(callback);
    }

}
