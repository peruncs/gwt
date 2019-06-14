package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

/**
 * If you want to dynamically generate the formatterParams at the time the formatter is called you can pass a function into the property that should return the params object
 * @param <T>
 */
@FunctionalInterface
@JsFunction
public interface FormatterPramsLookup<T extends Any> {
    /**
     * Lookup function.
     *
     * @param cell - the cell component
     * @return
     */
    T paramLookup(CellComponent cell);
}
