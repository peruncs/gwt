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

    /**
     * @param standardFunction - "avg", "max", "min", "sum", "concat", "count".
     * @return
     */
    static Calculator of(String standardFunction) {
        return Js.cast(standardFunction);
    }

    static Calculator of(Custom customFunction) {
        return Js.cast(customFunction);
    }

    default String asString() {
        return Js.cast(this);
    }

    default Custom asCustom() {
        return Js.cast(this);
    }

    default boolean isString() {
        return (Object) this instanceof String;
    }

}
