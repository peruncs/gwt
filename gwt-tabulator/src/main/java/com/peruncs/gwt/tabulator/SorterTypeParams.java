package com.peruncs.gwt.tabulator;


import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;


@JsType
public interface SorterTypeParams {

    static SorterTypeParams ofString(string s) {
        return Js.cast(s);
    }

    static SorterTypeParams ofNumeric(numeric n) {
        return Js.cast(n);
    }

    static SorterTypeParams ofAlphaNum(alphanum an) {
        return Js.cast(an);
    }

    static SorterTypeParams ofDateTime(datetime dt) {
        return Js.cast(dt);
    }

    static SorterTypeParams ofArray(array a) {
        return Js.cast(a);
    }

    static SorterTypeParams ofLookup(Lookup l) {
        return Js.cast(l);
    }

    @JsType
    abstract class base {
        /**
         * Force empty cells to top or bottom of table regardless of sort order, this property takes a string:
         * top - force empty cells to the top of the table
         * bottom - force empty cells to the bottom of the table
         */
        public String alignEmptyValues;

    }

    @JsType
    class string extends base {

        /**
         * the locale code for the string comparison function, (without this the sorter will use the locale of the browser).
         * It can accept:
         * string - the locale code for the sort
         * boolean - set the value to true to use the current table locale
         */
        public String locale;


    }

    @JsType
    class numeric extends base {
    }

    @JsType
    class alphanum extends base {
    }

    @JsType
    class datetime extends base {
        String format;
    }

    @JsType
    class array extends base {

        /**
         * Arrays will be sorted by length by default, this property takes a string for the comparison type:
         * length - sort arrays by length
         * sum - sort arrays by sum of their value
         * max - sort arrays by maximum value
         * min - sort arrays by minimum value
         * avg - sort arrays by average value of all elements
         */
        public String type;

    }


    /**
     * If you want to dynamically generate the sorterParams at the time the sort is called you can pass a function into the property that should return the params object.
     */
    @FunctionalInterface
    @JsFunction
    interface Lookup {
        /**
         * Lookup function.
         *
         * @param column the column component for the column being sorted
         * @param dir    - the direction of the sort ("asc" or "desc")
         * @return sort params.
         */
        JsObject paramLookup(ColumnComponent column, String dir);
    }

}