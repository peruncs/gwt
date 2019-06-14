package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class FormatterParamsDateTimeDiff extends FormatterParamsTimeBase {

    /**
     * A moment object of the data to compare against (defaults to the current date time)
     */
    public Any date;

    /**
     * If set to true diff will be displayed in a human readable fashion (eg "10 days") (default: false).
     */
    boolean humanize;

    /**
     * The time using for the difference ("years", "months", "weeks", "days", "hours", "minutes", "seconds"). This property will be ignored if humanize is used (default is "seconds").
     */
    public String unit;

    /**
     * If humanize is used setting this to true will make times relative (eg "10 days ago"). if humanize is not used the string passed to this will be appended after the difference value (default:false)"
     */
    public boolean suffix;
}
