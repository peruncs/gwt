package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The movableRowsSender option should be set on the sending table, and sets the action that should be taken
 * after the row has been successfuly dropped into the receiving table.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface MovableRowsSender {

    /**
     * do nothing(default).
     *
     * @return MovableRowsSender
     */
    @JsOverlay
    static MovableRowsSender doNothing() {
        return Js.cast(false);
    }

    /**
     * Deletes the row from the table.
     *
     * @return MovableRowsSender
     */
    @JsOverlay
    static MovableRowsSender delete() {
        return Js.cast("delete");
    }

    /**
     * Custom.
     *
     * @return MovableRowsSender
     */
    @JsOverlay
    static MovableRowsSender custom(Custom customCallback) {
        return Js.cast(customCallback);
    }

    /**
     * You can also pass a callback to the movableRowsSender option for custom sender functionality.
     */
    @JsFunction
    @FunctionalInterface
    interface Custom {
        /**
         * @param fromRow   the row component from the sending table
         * @param toRow     the row component from the receiving table (if available)
         * @param fromTable the Tabulator object for the receiving table
         */
        void onSend(RowComponent fromRow, RowComponent toRow, Tabulator fromTable);
    }

}
