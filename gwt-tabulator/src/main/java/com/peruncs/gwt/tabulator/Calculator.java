package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;


/**
 * Column calculator.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface Calculator {

    @JsOverlay
    static Calculator avg() {
        return Js.cast("avg");
    }

    @JsOverlay
    static Calculator max() {
        return Js.cast("max");
    }

    @JsOverlay
    static Calculator min() {
        return Js.cast("min");
    }

    @JsOverlay
    static Calculator sum() {
        return Js.cast("sum");
    }

    @JsOverlay
    static Calculator concat() {
        return Js.cast("concat");
    }

    @JsOverlay
    static Calculator count() {
        return Js.cast("count");
    }

    @JsOverlay
    static Calculator custom(Custom customFunction) {
        return Js.cast(customFunction);
    }

    /**
     * If you want to perform your own calculations on a column then you can pass a custom calculation function to either of the topCalc or bottomCalc options.
     */
    @JsFunction
    @FunctionalInterface
    interface Custom {
        /**
         * Calculate.
         *
         * @param values     - array of column values
         * @param data       - all table data
         * @param calcParams - params passed from the column definition object
         * @return custom calculation
         */
        int calculate(Any[] values, Any data, CalculatorParams calcParams);
    }

}
