package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * Determines how to sort data in this column.
 */

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface SorterType {

    /**
     * will sort columns as strings of characters. sorterParams has optional parameter in SorterParamsString.
     */
    @JsOverlay
    static SorterType string() {
        return Js.cast("string");
    }

    /**
     * will sort column as numbers (integer or float, will also handle numbers using "," separators). sorterParams has optional parameter in NumberParamsBase.
     */
    @JsOverlay
    static SorterType number() {
        return Js.cast("number");
    }

    /**
     * will sort column as alpha numeric code
     */
    @JsOverlay
    static SorterType alphanum() {
        return Js.cast("alphanum");
    }

    /**
     * will sort column as booleans.
     */
    @JsOverlay
    static SorterType bulean() {
        return Js.cast("boolean");
    }

    /**
     * will sort column ordering if value has a type of "undefined" or not.
     */
    @JsOverlay
    static SorterType exists() {
        return Js.cast("exists");
    }

    @JsOverlay
    static SorterType date() {
        return Js.cast("date");
    }


    @JsOverlay
    static SorterType time() {
        return Js.cast("time");
    }

    @JsOverlay
    static SorterType datetime() {
        return Js.cast("datetime ");
    }

    @JsOverlay
    static SorterType array() {
        return Js.cast("array ");
    }

    @JsOverlay
    static <P> SorterType custom(Custom<P> customSorter) {
        return Js.cast(customSorter);
    }

    @FunctionalInterface
    @JsFunction
    interface Custom<P> {
        /**
         * Perform custom sort.
         *
         * @param a               - value being compared
         * @param b               - value being compared
         * @param aRowComponent   - the row components for the a value being compared (useful if you need to access additional fields in the row data for the sort)
         * @param bRowComponent   - the row components for the b value being compared (useful if you need to access additional fields in the row data for the sort)
         * @param columnComponent - the columnComponent component for the columnComponent being sorted
         * @param dir             - the direction of the sort ("asc" or "desc")
         * @param sortedParams    - sorterParams object from columnComponent definition array
         * @return - you must return the difference between the two values, a - b.
         */
        int sort(Object a, Object b, RowComponent aRowComponent, RowComponent bRowComponent, ColumnComponent columnComponent, String dir, P sortedParams);
    }

}
