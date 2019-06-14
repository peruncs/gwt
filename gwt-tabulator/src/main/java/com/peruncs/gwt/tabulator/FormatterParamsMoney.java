package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class FormatterParamsMoney {

    /**
     * Symbol to represent the decimal point (default ".")
     */
    public String decimal;

    /**
     * Symbol to represent the thousands seperator (default ",")
     */
    public String thousand;

    /**
     * Currency symbol (no default)
     */
    public String symbol;

    /**
     * Position the symbol after the number (default false)
     */
    public boolean symbolAfter;
    /**
     * The number of decimals to display (default is 2), setting this value to false will display however many decimals are provided with the number
     */
    public boolean precision;
}
