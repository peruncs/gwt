package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class SorterParamsArray extends SorterParamsBase{

    /**
     * Arrays will be sorted by length by default, this property takes a string for the comparison type:
     * length - sort arrays by length
     * sum - sort arrays by sum of their value
     * max - sort arrays by maximum value
     * min - sort arrays by minimum value
     * avg - sort arrays by average value of all elements
     */
    public String type;


}
