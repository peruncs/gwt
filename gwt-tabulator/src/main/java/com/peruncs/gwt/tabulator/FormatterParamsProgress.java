package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class FormatterParamsProgress extends FormatterParamsTraffic {

    /**
     * A text value to display over the progress bar, this can be:
     *  - string - any string
     *  - boolean - if set to true this will show the value of the cell
     *  - function - a callback that is passed the value of the cell and must return the legend contents (eg function(value){return value + "%"})
     */
    public ProgressLegendUnion legend;

    /**
     * The text colour for the legend, has the same range of value options as the color property.
     */
    public ColorUnion legendColor;


    /**
     * The text alignment for the legend, this can be:
     *  - center - center align text (default)
     *  - left - left align text
     *  - right - right align text
     *  - justify - stretch out text to fit line
     */
    public String legendAlign;

}
