package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class Calculator {
//todo
    //1. Can be String of: avg, max, min, sum, concat, count

    //2. Can be custom function - If you want to perform your own calculations on a column then you can pass a custom calculation function to either of the topCalc or bottomCalc options:
    //    count number of users over 18
    //    var adultCalc = function(values, data, calcParams){
    //        //values - array of column values
    //        //data - all table data
    //        //calcParams - params passed from the column definition object
    //
    //        var calc = 0;
    //
    //        values.forEach(function(value){
    //            if(value > 18){
    //                calc ++;
    //            }
    //        });
    //
    //        return calc;
    //    }

}
