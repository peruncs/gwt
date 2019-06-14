package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class TooltipUnion {
//todo
    /*
    The tooltip parameter can take three different types of value

boolean - a value of false disables the tooltip, a value of true sets the tooltip of the cell to its value
string - a string that will be displayed for all cells in the matching column/table.
function - a callback function that returns the string for the cell. see below:
The function accepts one argument, the CellComponent for the cell the tooltip is being generated for.

var table = new Tabulator("#example-table", {
    tooltips:function(cell){
        //cell - cell component

        //function should return a string for the tooltip of false to hide the tooltip
        return  cell.getColumn().getField() + " - " + cell.getValue(); //return cells "field - value";
    },
});
     */
}
