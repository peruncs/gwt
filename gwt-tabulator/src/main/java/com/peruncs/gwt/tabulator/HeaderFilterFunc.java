package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class HeaderFilterFunc {
    //Can be string
    //can be Callback :
//    function customHeaderFilter(headerValue, rowValue, rowData, filterParams){
//        //headerValue - the value of the header filter element
//        //rowValue - the value of the column in this row
//        //rowData - the data for the row being filtered
//        //filterParams - params object passed to the headerFilterFuncParams property
//
//        return rowData.name == filterParams.name && rowValue < headerValue; //must return a boolean, true if it passes the filter.
//    }
//
//    //column definition object in table constructor
//    {title:"Age", field:"age", headerFilter:"input", headerFilterPlaceholder:"Max Age", headerFilterFunc:customHeaderFilter, headerFilterFuncParams:{name:"bob"}}
}
