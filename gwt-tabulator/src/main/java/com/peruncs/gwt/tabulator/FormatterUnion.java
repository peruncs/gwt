package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class FormatterUnion {
    //todo - String or Function
    /*
    The formatter function accepts two arguments, the CellComponent for the cell being formatted and the formatterParams option from the column definition.

The function must return the contents of the cell, either the text value of the cell, valid HTML or a DOM node.

{title:"Name", field:"name", formatter:function(cell, formatterParams, onRendered){
    //cell - the cell component
    //formatterParams - parameters set for the column
    //onRendered - function to call when the formatter has been rendered

    return "Mr" + cell.getValue(); //return the contents of the cell;
},
}
     */
}
