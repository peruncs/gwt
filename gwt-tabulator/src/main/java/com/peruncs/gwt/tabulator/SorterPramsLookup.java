package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

/**
 * If you want to dynamically generate the sorterParams at the time the sort is called you can pass a function into the property that should return the params object.
 * @param <T>
 */
@FunctionalInterface
@JsFunction
public interface SorterPramsLookup<T extends Any> {
    /**
     * Lookup function.
     *
     * @param column the column component for the column being sorted
     * @param dir - the direction of the sort ("asc" or "desc")
     * @return
     */
    T paramLookup(ColumnComponent column, String dir);
}
