package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;


/**
 * Copy Formatter.
 * <p>
 * The copy formatter is used to take the row data provided by the selector and turn it into a text string for the clipboard.
 * <p>
 * There is one built in copy formatter called "table", if you have extended the clipboard module and want to change the default you can use the clipboardCopyFormatter property. you can also pass in a formatting function directly into this property.
 * <p>
 * var table = new Tabulator("#example-table", {
 * clipboardCopyFormatter:"cusstomFormatter", //use a custom built in formatter
 * });
 * <p>
 * You can also pass a custom formatter function into the clipboardCopyFormatter property, it should take one argument of the row data array from the copy selector function and should return a string that will be inserted into the clipboard:
 * <p>
 * var table = new Tabulator("#example-table", {
 * clipboardCopyFormatter:function(rowData){
 * return JSON.stringify(rowData);
 * }
 * });
 * <p>
 * The in-built formatter will create table formatted text string that can be pasted into any standard spreadsheet system like Excel or Google Sheets. Each column is separated by a tab and each row by a new line.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface ClipboardCopyFormatter {

    @JsOverlay
    static ClipboardCopyFormatter table() {
        return Js.cast("table");
    }

    @JsOverlay
    static ClipboardCopyFormatter custom(Custom customFormatter) {
        return Js.cast(customFormatter);
    }

    @JsFunction
    @FunctionalInterface
    interface Custom {
        String format(JsObject[] rawData);
    }

}
