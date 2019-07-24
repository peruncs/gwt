package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class ClipboardCopyConfig {

    /**
     * You have three choices for the type of column headers included in the clipboard output:
     *
     * "groups" - include full column headers including column groups (default value)
     * "columns" - include only the actual column headers, ignore grouping
     * false - do not include any column headers in the clipboard output
     */
    public BooleanOr<String> columnHeaders;

    /**
     * Row groups will only be included in the clipboard output if the active copy selector is used.
     */
    public boolean rowGroups;
    public boolean columnCalcs;
}
