package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

/**
 * Once the data has been parsed into row data, it will be passed to a paste action to be added to the table. There are three inbuilt paste actions:
 * <p>
 * - "insert" - Inserts data into the table using the addRows function (default)
 * - "update" - Updates data in the table using the updateOrAddData function
 * - "replace" - replaces all data in the table using the setData function
 * <p>
 * You can also pass a custom action function into the clipboardPasteAction property,
 * it should take one argument of the row data from the paste parse function and
 * trigger an action on the table and where possible return the row objects that are created
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface ClipboardPasteAction {

    @JsOverlay
    static ClipboardPasteAction insert() {
        return Js.cast("insert");
    }

    @JsOverlay
    static ClipboardPasteAction update() {
        return Js.cast("update");
    }

    @JsOverlay
    static ClipboardPasteAction replace() {
        return Js.cast("replace");
    }

    @JsOverlay
    static ClipboardPasteAction custom(Custom customPasteAction) {
        return Js.cast(customPasteAction);
    }

    @JsFunction
    @FunctionalInterface
    interface Custom {
        JsObject[] format(Any rawData);
    }

}
