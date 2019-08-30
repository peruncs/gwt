package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface TabEndNewRow {

    /**
     * @param value value of true to the option will result in an empty new row being created.
     * @return TabEndNewRow object
     */
    @JsOverlay
    static TabEndNewRow of(boolean value) {
        return Js.cast(value);
    }


    /**
     * Passing an object to the option will result in a new rown being created with the data object provided.
     *
     * @param complex - property map
     * @return TabEndNewRow object
     */
    @JsOverlay
    static TabEndNewRow of(JsPropertyMap<?> complex) {
        return Js.cast(complex);
    }

    /**
     * Passing an object to the option will result in a new rown being created with the data object provided.
     *
     * @param complex object.
     * @return TabEndNewRow object
     */
    @JsOverlay
    static TabEndNewRow of(JsObject complex) {
        return Js.cast(complex);
    }

    /**
     * @param custom - custom function,
     * @return TabEndNewRow object
     */
    @JsOverlay
    static TabEndNewRow of(Custom custom) {
        return Js.cast(custom);
    }

    @FunctionalInterface
    @JsFunction
    interface Custom {
        /**
         * return the data object for the new row.
         *
         * @param row - row component for current last row in table
         * @return - the data object or the new row
         */
        Any get(RowComponent row);
    }

}
