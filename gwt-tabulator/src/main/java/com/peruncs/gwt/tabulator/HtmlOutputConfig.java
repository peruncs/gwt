package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

/**
 * The output getHtml function will now contain column header groups, row groups, and column calculations.
 * <p>
 * You can choose to remove column headers groups and row groups in the output data by setting the values in the htmlOutputConfig option
 * in the table definition:
 */
@JsType
public class HtmlOutputConfig {
    /**
     * false - do not include column groups in column headers for HTML table
     */
    boolean columnGroups;

    /**
     * false - do not include row groups in HTML table
     */
    boolean rowGroups;

    /**
     * false -  do not include column calcs in HTML table
     */
    boolean columnCalcs;
}
