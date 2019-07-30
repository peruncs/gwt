package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface Validator {

    @JsOverlay
    static Validator ofRequired() {
        return Js.cast("required");
    }

    @JsOverlay
    static Validator ofUnique() {
        return Js.cast("unique");
    }

    @JsOverlay
    static Validator ofInteger() {
        return Js.cast("integer");
    }

    @JsOverlay
    static Validator ofFloat() {
        return Js.cast("float");
    }

    @JsOverlay
    static Validator ofNumeric() {
        return Js.cast("numeric");
    }

    @JsOverlay
    static Validator ofString() {
        return Js.cast("string");
    }

    @JsOverlay
    static Validator of(Any any) {
        return Js.cast(any);
    }

    @JsOverlay
    static Validator of(Validator[] many) {
        return Js.cast(many);
    }

    @JsOverlay
    static Validator of(Custom custom) {
        return Js.cast(custom);
    }


    @JsFunction
    @FunctionalInterface
    interface Custom {
        /**
         * @param cell       - the cell component for the edited cell.
         * @param value      - the new input value of the cell.
         * @param parameters - the parameters passed in with the validator.
         * @return -  It should return true if the value passes validation and false if it fails.
         */
        boolean validate(CellComponent cell, Any value, Any parameters);
    }

}
