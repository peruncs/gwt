package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class SorterParamsArray {

    /**
     * Arrays will be sorted by length by default, this property takes a string for the comparison type:
     * length - sort arrays by length
     * sum - sort arrays by sum of their value
     * max - sort arrays by maximum value
     * min - sort arrays by minimum value
     * avg - sort arrays by average value of all elements
     */
    public String type;

    /**
     *  force empty cells to top or bottom of table regardless of sort order, this property takes a string:
     * top - force empty cells to the top of the table
     * bottom - force empty cells to the bottom of the table
     */
    public String alignEmptyValues;

}
