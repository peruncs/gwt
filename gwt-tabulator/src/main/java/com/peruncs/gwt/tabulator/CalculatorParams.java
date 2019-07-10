package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

public interface CalculatorParams {

    @JsType
    class Precision {
        /**
         * the number of decimals to display (default is 2), setting this value to false will display however many decimals are provided with the number
         */
        BooleanOrInt precision;
    }

     //todo
    // This can be
    //    function paramLookup(values, data){
    //        //values - array of column values
    //        //data - all table data
    //
    //        //do some processing and return the param object
    //        return {param1:"green"};
    //    }
}
