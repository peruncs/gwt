package com.peruncs.gwt.tabulator;


import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface CalculatorParams {

    /**
     * The number of decimals to display (default is 2), setting this value to false will display however many decimals are provided with the number
     *
     * @param precision  the desired precision.
     * @return CalculatorParams
     */
    @JsOverlay
    static CalculatorParams precision(BooleanOr<Integer> precision) {
        return Js.cast(JsPropertyMap.of("precision", precision));
    }

    /**
     * Custome lookup.
     *
     * @param lookupFunction custom lookup function.
     * @return CalculatorParams
     */
    @JsOverlay
    static CalculatorParams lookup(Lookup lookupFunction) {
        return Js.cast(lookupFunction);
    }

    /**
     * If you want to dynamically generate the calc params at the time the calculation is called you can pass a function into the property that should return the params object.
     */
    @JsFunction
    @FunctionalInterface
    interface Lookup {
        /**
         * Lookup parameters.
         *
         * @param values - array of column values
         * @param data   - all table data
         * @return the parameter object
         */
        Object lookup(Any[] values, Any data);
    }

}
