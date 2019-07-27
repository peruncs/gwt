package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;


/**
 * Column calculator.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface Calculator {

    static Calculator avg() {
        return Js.cast("avg");
    }

    static Calculator max() {
        return Js.cast("max");
    }

    static Calculator min() {
        return Js.cast("min");
    }

    static Calculator sum() {
        return Js.cast("sum");
    }

    static Calculator concat() {
        return Js.cast("concat");
    }

    static Calculator count() {
        return Js.cast("count");
    }

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
         * @return
         */
        int calculate(Any[] values, Any data, CalculatorParams calcParams);
    }

}
