package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * Advanced sorting can define a custom sorter function in the sorter option
 */
@FunctionalInterface
@JsFunction
public interface SorterPramsCustom {
    /**
     *
     * @param a - value being compared
     * @param b - value being compared
     * @param aRowComponent - the row components for the a value being compared (useful if you need to access additional fields in the row data for the sort)
     * @param bRowComponent - the row components for the b value being compared (useful if you need to access additional fields in the row data for the sort)
     * @param columnComponent - the columnComponent component for the columnComponent being sorted
     * @param dir - the direction of the sort ("asc" or "desc")
     * @param sortedParams - sorterParams object from columnComponent definition array
     * @return - you must return the difference between the two values, a - b.
     */
    int sort(Object a, Object b, RowComponent aRowComponent, RowComponent bRowComponent, ColumnComponent columnComponent, String dir, SorterParamsUnion sortedParams);
}
