package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The movableRowsReceiver option should be set on the receiving tables, and sets the action that should be taken when the row is dropped into the table.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface MovableRowsReceiver {

    /**
     * inserts row next to the row it was dropped on, if not dropped on a row it is added to the table (default)
     *
     * @return
     */
    @JsOverlay
    static MovableRowsReceiver insert() {
        return Js.cast("insert");
    }

    /**
     * adds row to the table.
     *
     * @return
     */
    @JsOverlay
    static MovableRowsReceiver add() {
        return Js.cast("add");
    }

    /**
     * updates the row it is dropped on with the sent rows data.
     *
     * @return
     */
    @JsOverlay
    static MovableRowsReceiver update() {
        return Js.cast("update");
    }

    /**
     * replaces the row it is dropped on with the sent row.
     *
     * @return
     */
    @JsOverlay
    static MovableRowsReceiver replace() {
        return Js.cast("replace");
    }

    /**
     * Custom.
     *
     * @return
     */
    @JsOverlay
    static MovableRowsReceiver custom(Custom customCallback) {
        return Js.cast(customCallback);
    }

    /**
     * You can also pass a callback to the movableRowsReceiver option for custom receiver functionality. the callback
     * must return a boolean to indicate whether the drop should be considered successful or not (eg. you may want to
     * reject a drop if it was not on a row)
     */
    @JsFunction
    @FunctionalInterface
    interface Custom {
        /**
         * @param fromRow   the row component from the sending table
         * @param toRow     Table the row component from the receiving table (if available)
         * @param fromTable the Tabulator object for the sending table
         * @return
         */
        boolean onReceive(RowComponent fromRow, RowComponent toRow, Tabulator fromTable);
    }


}
