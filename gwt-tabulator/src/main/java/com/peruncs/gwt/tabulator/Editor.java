package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.Callback;
import elemental2.dom.Node;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * Column editor.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface Editor {

    /**
     * allows entering of a single line of plain text
     *
     * @return the union type
     */
    @JsOverlay
    static Editor input() {
        return Js.cast("input");
    }

    /**
     * allows entering of multiple lines of plain text
     *
     * @return the union type
     */
    @JsOverlay
    static Editor textarea() {
        return Js.cast("textarea");
    }

    /**
     * allows for numeric entry with a number type input element with increment and decrement buttons
     *
     * @return the union type
     */
    @JsOverlay
    static Editor number() {
        return Js.cast("number");
    }

    /**
     * allows for numeric entry with a range type input element.
     *
     * @return the union type
     */
    @JsOverlay
    static Editor range() {
        return Js.cast("range");
    }

    /**
     * allows users to search a list of predefined options passed into the values property of the editorParams option.
     *
     * @return the union type
     */
    @JsOverlay
    static Editor autocomplete() {
        return Js.cast("autocomplete");
    }

    /**
     * Passing a value of true to this option will result in Tabulator applying the editor that best matches the columns formatter, if present.
     *
     * @param bestMatchAttempt
     * @return the union type
     */
    @JsOverlay
    static Editor of(boolean bestMatchAttempt) {
        return Js.cast("autocomplete");
    }


    @JsOverlay
    static Editor custom(Custom customEditor) {
        return Js.cast(customEditor);
    }

    @FunctionalInterface
    @JsFunction
    interface Custom<P> {
        /**
         * @param cell        - the cell component for the editable cell.
         * @param onRendered  - function to call when the editor has been rendered.
         * @param onSuccess   - function to call to pass the successfuly updated value to Tabulator.
         * @param onCancel    - function to call to abort the edit and return to a normal cell.
         * @param editorPrams - params object passed into the editorParams column definition property.
         * @return DOM Node for the editor that will be inserted into the cell. or a value of false to abort the edit.
         */
        BooleanOr<Node> edit(CellComponent cell, Callback onRendered, Callback onSuccess, Callback onCancel, P editorPrams);
    }

}
