package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class FormatterParamsTraffic {

    /**
     * Minimum value for progress bar (default 0).
     */
    public int min;

    /**
     * Maximum value for progress bar (default 100).
     */
    public int max;

    /** Colour of progress bar (default ["red", "orange", "green"]), this can be:*/

    /**
     * Colour of traffic bar (default ["red", "orange", "green"]), this can be:
     *  - array of strings - an array of color strings, that will divide the background colour across the min-max range of values(eg ["green", "orange", "#ff0000"])
     * - function - a callback that is passed the value of the cell and must return the color (eg function(value){return "red"}).
     */
    public ColorUnion color;
}
