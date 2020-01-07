package com.peruncs.gwt.tabulator;


import com.peruncs.gwt.utils.CallbackRet1;
import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType
public interface EditorParams {

    @JsType
    interface VerticalNavigation {

        @JsOverlay
        static VerticalNavigation hybrid() {
            return Js.cast("hybrid");
        }

        @JsOverlay
        static VerticalNavigation editor() {
            return Js.cast("editor");
        }

        @JsOverlay
        static VerticalNavigation table() {
            return Js.cast("table");
        }

    }

    @JsFunction
    @FunctionalInterface
    interface CustomParamLookup {
        JsObject lookup(CellComponent cell);
    }

    /**
     * If you want to dynamically generate the editorParams at the time the editor is called you can pass a function into the property that should return the params object.
     *
     * @param customParamLookup - a param lookup function.
     * @return the union type.
     */
    static EditorParams ofCustomLookup(CustomParamLookup customParamLookup) {
        return Js.cast(customParamLookup);
    }

    @JsType
    class Input {
        public boolean search;
        public JsPropertyMap<String> elementAttributes;
    }

    static EditorParams ofInput(Input input) {
        return Js.cast(input);
    }

    @JsType
    class TextArea {
        public JsPropertyMap<String> elementAttributes;
        public VerticalNavigation verticalNavigation;
    }

    static EditorParams ofTextarea(TextArea textarea) {
        return Js.cast(textarea);
    }


    /**
     * The number and range parameter allow optional properties for the editorParams object:
     * <p>
     * max - the maximum allowed value
     * min - the minimum allowed value
     * step - the step size when incrementing/decrementing the value (default 1)
     */
    @JsType
    class Range {
        public int min = 0;
        public int max = 100;
        public int step = 1;
        public JsPropertyMap<String> elementAttributes;
    }

    static EditorParams ofRange(Range range) {
        return Js.cast(range);
    }

    /**
     * The number and range parameter allow optional properties for the editorParams object:
     * <p>
     * max - the maximum allowed value
     * min - the minimum allowed value
     * step - the step size when incrementing/decrementing the value (default 1)
     */
    @JsType
    class Numeric {
        public int min = 0;
        public int max = 100;
        public int step = 1;
        public JsPropertyMap<String> elementAttributes;
        public VerticalNavigation verticalNavigation;
    }

    static EditorParams ofNumeric(Numeric numeric) {
        return Js.cast(numeric);
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
        public JsPropertyMap<String> elementAttributes;
    }

    static EditorParams ofCheckbox(Checkbox checkbox) {
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
             * @param value - value to display
             * @param title - a column title
             * @return html content
             */
            String format(JsObject value, String title);
        }

        public String sortValuesList;
        public Any values;
        public JsPropertyMap<String> elementAttributes;
        public Any defaultValue;
        public VerticalNavigation verticalNavigation;
    }

    static EditorParams ofSelect(Select select) {
        return Js.cast(select);
    }

    /**
     * The editor has optional properties for the editorParams object:
     * <p>
     * showListOnEmpty - show all values in the list when the input element is empty (default false)
     * freetext - allow the user to press enter to save a value to the cell that is not in the list (default false)
     * allowEmpty - allow the user to save an empty value to the cell (default false)
     * searchFunc - function to search through array of value objects and return those that match the search term (by default this does a loose string comparison between values)
     * listItemFormatter - a function that should return the HTML contents for each item in the value list
     * sortValuesList - if values property is set to true this option can be used to set how the generated list should be sorted. if ommitted the list will be in the order of rows in the table, when used it can have a value of "asc" or "desc".
     * The editor has one mandatory property for the editorParams object:
     * <p>
     * values - a list of values to be displayed to the user
     * There are three ways you can define the values list depending on your needs.
     * <p>
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

    static EditorParams ofAutocomplete(Autocomplete autocomplete) {
        return Js.cast(autocomplete);
    }

}
