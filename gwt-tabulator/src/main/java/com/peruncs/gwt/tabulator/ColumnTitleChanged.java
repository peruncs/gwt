package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

@JsFunction
@FunctionalInterface
/**
 * Callback for column title change.
 */
public interface ColumnTitleChanged {

    /**
     * Callback.
     *
     * @param value - the new column value
     * @param column - the updated column definition object for the affected column.
     * @param columns - the updated column definition array for all columns in the table.
     */
    void call(Any value, ColumnOptions column, ColumnOptions[] columns);

}
