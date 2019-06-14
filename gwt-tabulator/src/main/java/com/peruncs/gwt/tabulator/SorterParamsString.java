package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class SorterParamsString extends SorterParamsBase{

    /**
     * the locale code for the string comparison function, (without this the sorter will use the locale of the browser).
     * It can accept:
     * string - the locale code for the sort
     * boolean - set the value to true to use the current table locale
     */
    public String locale ;


}
