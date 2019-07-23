package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsType
public class FormatterParamsLink {
    /**
     * The field in the row data that should be used for the link lable
     */
    public String labelField;

    /**
     * Representing the lable, or a function which must return the string for the label, the function is passed the Cell Component as its first argument.
     */
    public String label;

    /**
     * A prefix to put before the url value (eg. to turn a emaill address into a clickable mailto link you should set this to "mailto:").
     */
    public String urlPrefix;

    /**
     * -The field in the row data that should be used for the link url.
     */
    public String urlField;

    /**
     * Representing the url, or a function which must return the string for the url, the function is passed the Cell Component as its first argument.
     */

    @JsFunction
    @FunctionalInterface
    public interface URLProvider {
        String provideURL(CellComponent cell);
    }

    public StringOr<URLProvider> url;

    /**
     * Representing the value of the anchor tags target artibute (eg. set to "_blank" to open link in new tab).
     */
    public String target;

}
