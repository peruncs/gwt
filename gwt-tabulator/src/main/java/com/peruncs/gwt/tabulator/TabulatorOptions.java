package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

/**
 * Tabulator options.
 */
@JsType
public class TabulatorOptions {
    public String height;
    public boolean virtualDom = true;
    public int virtualDomBuffer;
    public StringOrNode placeholder;
    public StringOrNode footerElement;
    public boolean tooltips = false;
    public String tooltipGenerationMode = "load";
}



