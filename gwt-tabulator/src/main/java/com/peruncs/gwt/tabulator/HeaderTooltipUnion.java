package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class HeaderTooltipUnion {
    //todo

    /*
    The tooltip headerTooltip can take three different types of value

boolean - a value of false disables the tooltip, a value of true sets the tooltip of the column header to its title value.
string - a string that will be displayed for the tooltip.
function - a callback function that returns the string for the column header. see below:
The function accepts one argument, the ColumnComponent for the column the tooltip is being generated for.

var table = new Tabulator("#example-table", {
    tooltips:function(column){
        //column - column component

        //function should return a string for the header tooltip of false to hide the tooltip
        return  column.getDefinition().title;
    },
});
     */
}
