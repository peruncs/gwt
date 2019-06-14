package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class SortOrder {
    /**Column name*/
    public String column;

    /**Column direction - "asc" or "desc" */
    public String dir;
}
