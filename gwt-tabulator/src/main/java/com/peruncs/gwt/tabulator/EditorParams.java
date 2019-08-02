package com.peruncs.gwt.tabulator;


import com.peruncs.gwt.utils.CallbackRet1;
import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface EditorParams {

    /**
     * If you want to dynamically generate the editorParams at the time the editor is called you can pass a function into the property that should return the params object.
     *
     * @param customParamLookup - a param lookup function.
     * @return the union type.
     */
    @JsOverlay
    static EditorParams of(CallbackRet1<JsObject, CellComponent> customParamLookup) {
        return Js.cast(customParamLookup);
    }

    @JsType
    class Input {
        public boolean search;
    }

    @JsOverlay
    static EditorParams of(Input input) {
        return Js.cast(input);
    }

    /**
     * The number and range parameter allow optional properties for the editorParams object:
     * <p>
     * max - the maximum allowed value
     * min - the minimum allowed value
     * step - the step size when incrementing/decrementing the value (default 1)
     */
    @JsType
    class NumericRange {
        public int min = 0;
        public int max = 100;
        public int step = 1;
    }

    @JsOverlay
    static EditorParams of(NumericRange numericRange) {
        return Js.cast(numericRange);
    }


    /**
     * The tick editor allows for boolean values using a checkbox type input element.
     * <p>
     * tristate - allow tristate tickbox (default false)
     * indeterminateValue - when using tristate tickbox what value should the third indeterminate state have (default null)
     */
    @JsType
    class Checkbox {
        public boolean tristate;
        public String indeterminateValue;
    }

    @JsOverlay
    static EditorParams of(Checkbox checkbox) {
        return Js.cast(checkbox);
    }

    /**
     * The select editor creates a dropdown select box to allow the user to select from some predefined options passed into the values property of the editorParams option.
     * <p>
     * The editor has one optional property for the editorParams object:
     * <p>
     * listItemFormatter - a function that should return the HTML contents for each item in the value list
     * sortValuesList - if values property is set to true this option can be used to set how the generated list should be sorted. if ommitted the list will be in the order of rows in the table, when used it can have a value of "asc" or "desc".
     * The editor has one mandatory property for the editorParams object:
     * <p>
     * values - a list of values to be displayed to the user
     * There are five ways you can define the values list depending on your needs.
     * <p>
     * If you pass the boolean value of true to the values property, Tabulator will automatically build the values list out of all unique values in this cells column.
     */
    @JsType
    class Select {

        @JsFunction
        @FunctionalInterface
        public interface ListItemFormatter {
            /**
             * return the HTML contents for each item in the value list.
             *
             * @param value
             * @param title
             * @return html content
             */
            String format(JsObject value, String title);
        }

        public String sortValuesList;
        public Any values;
    }

    @JsOverlay
    static EditorParams of(Select select) {
        return Js.cast(select);
    }


    /**
     * The editor has optional properties for the editorParams object:
     *
     * showListOnEmpty - show all values in the list when the input element is empty (default false)
     * freetext - allow the user to press enter to save a value to the cell that is not in the list (default false)
     * allowEmpty - allow the user to save an empty value to the cell (default false)
     * searchFunc - function to search through array of value objects and return those that match the search term (by default this does a loose string comparison between values)
     * listItemFormatter - a function that should return the HTML contents for each item in the value list
     * sortValuesList - if values property is set to true this option can be used to set how the generated list should be sorted. if ommitted the list will be in the order of rows in the table, when used it can have a value of "asc" or "desc".
     * The editor has one mandatory property for the editorParams object:
     *
     * values - a list of values to be displayed to the user
     * There are three ways you can define the values list depending on your needs.
     *
     * If you pass the boolean value of true to the values property, Tabulator will automatically build the values list out of all unique values in this cells column.
     */
    @JsType
    class Autocomplete extends Select {
        public boolean showListOnEmpty;
        public boolean freetext;
        public boolean allowEmpty;

        /**
         * function to search through array of value objects and return those that match the search term (by default this does a loose string comparison between values)
         */
        @JsFunction
        @FunctionalInterface
        interface SearchFunc {
            JsObject[] search(String term, JsObject[] values);
        }

        public SearchFunc searchFunc;
    }

    @JsOverlay
    static EditorParams of(Autocomplete autocomplete) {
        return Js.cast(autocomplete);
    }

}
