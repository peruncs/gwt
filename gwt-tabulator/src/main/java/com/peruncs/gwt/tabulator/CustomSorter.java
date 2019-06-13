package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

/**
 * Advanced sorting can define a custom sorter function in the sorter option
 */
@FunctionalInterface
@JsFunction
public interface CustomSorter {
    /**
     *
     * @param a - value being compared
     * @param b - value being compared
     * @param aRow - the row components for the a value being compared (useful if you need to access additional fields in the row data for the sort)
     * @param bRow - the row components for the b value being compared (useful if you need to access additional fields in the row data for the sort)
     * @param column - the column component for the column being sorted
     * @param dir - the direction of the sort ("asc" or "desc")
     * @param sortedParams - sorterParams object from column definition array
     * @return - you must return the difference between the two values, a - b.
     */
    int sort(Object a, Object b, Row aRow, Row bRow, Column column, String dir, Any sortedParams);
}
