package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public abstract class SorterParamsBase {


    /**
     * Force empty cells to top or bottom of table regardless of sort order, this property takes a string:
     * top - force empty cells to the top of the table
     * bottom - force empty cells to the bottom of the table
     */
    public String alignEmptyValues;

}
