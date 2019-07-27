package com.peruncs.gwt.tabulator;


import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * To enable row selection, set the selectable option to true.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface Selectable {

    /**
     * @param enabled -true - selectable rows are enabled, and you can select as many as you want, false - selectable rows are disabled.
     * @return Selectable
     */
    @JsOverlay
    static Selectable of(boolean enabled) {
        return Js.cast(enabled);
    }

    /**
     * @param maxRowsSelect any integer value, this sets the maximum number of rows that can be selected (when the maximum number of selected rows is exeded, the first selected row will be deselected to allow the next row to be selected).
     * @return Selectable
     */
    @JsOverlay
    static Selectable of(int maxRowsSelect) {
        return Js.cast(maxRowsSelect);
    }

    /**
     * "highlight" (default) - rows have the same hover stylings as selectable rows but do not change state when clicked. This is great for when you want to show that a row is clickable but don't want it to be selectable.
     *
     * @return
     */
    @JsOverlay
    static Selectable of() {
        return Js.cast("highlight");
    }

}
