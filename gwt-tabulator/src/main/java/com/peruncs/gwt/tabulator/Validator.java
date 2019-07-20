package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public interface Validator {
   //todo

    //1.  can be string
    //2. can be array of validators
    //3. can be custom:
    //validator to prevent values divisible by the provided divisor
//    var noDivide = function(cell, value, parameters){
//        //cell - the cell component for the edited cell
//        //value - the new input value of the cell
//        //parameters - the parameters passed in with the validator
//
//        return value % parameters.divisor; //don't allow values divisible by devisor ;
//    }
//
//    //in your column definition for the column
//    {title:"Age", field:"age", editor:"input", validator:[{
//        type:noDivide,
//                parameters:{
//            divisor:5,
//        }
//    }]
//    }


}
