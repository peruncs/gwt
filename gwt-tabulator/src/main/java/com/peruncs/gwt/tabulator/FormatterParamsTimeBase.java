package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class FormatterParamsTimeBase {
    /**
     * The format of the date/time in the row data(default: YYY-MM-DD hh:mm:ss).
     */
    public String inputFormat;

    /**
     * The value to be displayed if an invalid input date/time is provided (default:""), this can take three different types of value:
     * true - a boolean of true will display the cells original value
     * function - a function passed into this will be called with the original value of the cell passed into its first argument
     * string/number - a string on number will be displayed instead of the cells value
     */
    public InvalidPlaceHolderUnion invalidPlaceholder;
}
