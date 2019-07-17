package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType
public interface CalculatorParams {

    /**
     * The number of decimals to display (default is 2), setting this value to false will display however many decimals are provided with the number
     */
    static CalculatorParams of(BooleanOrInt precision) {
        return Js.cast(JsPropertyMap.of("precision", precision));
    }


    static CalculatorParams of(ParamLookup paramLookupFunction) {
        return Js.cast(paramLookupFunction);
    }

    /**
     * If you want to dynamically generate the calc params at the time the calculation is called you can pass a function into the property that should return the params object.
     */
    @JsFunction
    @FunctionalInterface
    interface ParamLookup {
        /**
         * Lookup parameters.
         *
         * @param values - array of column values
         * @param data   - all table data
         * @return the parameter object
         */
        Any paramLookup(Any[] values, Any data);
    }

}
