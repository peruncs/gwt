package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class FormatterParamsTickCross {

    /**
     * Set to true to cause empty values (undefined, null, "") to display an empty cell instead of a cross (default false).
     */
    public boolean allowEmpty;

    /**
     * Set to true to allow any truthy value to show a tick (default false).
     */
    public boolean allowTruthy;

    /**
     * Custom HTML for the tick element, if set to false the tick element will not be shown (it will only show crosses).
     */
    public boolean tickElement;

    /**
     * Custom HTML for the cross element, if set to false the cross element will not be shown (it will only show ticks)
     */
    public boolean crossElement;

}
