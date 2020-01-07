package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.Callback;
import com.peruncs.gwt.utils.StringOr;
import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * Determines how to format data in this column.
 */
@JsType
public interface Formatter {

    /**
     * The default formatter for all cells and will simply dispay the value of the cell as text.
     *
     * @return the union type
     */
    static Formatter plaintext() {
        return Js.cast("plaintext");
    }


    /**
     * allows you to add a column of tickboxes down one side of your table to handle row selection.
     *
     * @return the union type
     */
    static Formatter rowSelection() {
        return Js.cast("rowSelection");
    }

    /**
     * Shows text with carriage returns intact (great for multiline text), this formatter will also adjust the height of rows to fit the cells contents when columns are resized.
     *
     * @return the union type
     */
    static Formatter textarea() {
        return Js.cast("textarea");
    }

    /**
     * Displays un-sanitized html. Dangerous!
     *
     * @return the union type
     */
    static Formatter html() {
        return Js.cast("html");
    }

    /**
     * Formats a number into currency notation. has optional properties for the formatterParams, see FormatterParamsMoney.
     *
     * @return the union type
     */
    static Formatter money() {
        return Js.cast("money");
    }


    /**
     * Creates an img element with the src set as the value. (triggers the normalizeHeight function on the row on image load). The formatter has optional properties for the formatterParams object, see FormatterParamsImage.
     *
     * @return the union type
     */
    static Formatter image() {
        return Js.cast("image");
    }


    /**
     * Renders data as an anchor with a link to the given value (by default the value will be used as both the url and the label of the tag). has optional properties for the formatterParams object, see FormatterParamsLink. @return the union type.
     *
     * @return formatter
     */
    static Formatter link() {
        return Js.cast("link");
    }

    /**
     * Transforms on format of date or time into another. You will need to include the moment.js library to use this. has optional properties for the formatterParams object, see FormatterParamsDateTime.
     *
     * @return formatter
     */
    static Formatter datetime() {
        return Js.cast("datetime");
    }

    /**
     * Show difference between two datetimes. You will need to include the moment.js library to use this. has optional properties for the formatterParams object, see FormatterParamsDateTimeDiff.
     *
     * @return formatter
     */
    static Formatter datetimediff() {
        return Js.cast("datetimediff");
    }

    /**
     * Displays a green tick if the value is (true|'true'|'True'|1) and a red cross if not. has optional properties for the formatterParams object, see FormatterParamsTickCross.
     *
     * @return formatter
     */
    static Formatter tickCross() {
        return Js.cast("tickCross");
    }

    /**
     * sets the background colour of the cell to the value. The cell's value can be any valid CSS color eg. #ff0000, #f00, rgb(255,0,0), red, rgba(255,0,0,0), hsl(0, 100%, 50%).
     *
     * @return formatter
     */
    static Formatter color() {
        return Js.cast("color");
    }

    /**
     * Displays a graphical star rating based on integer values. has optional properties for the formatterParams object, see FormatterParamsStar.
     *
     * @return formatter
     */
    static Formatter star() {
        return Js.cast("star");
    }

    /**
     * Displays a coloured circle that changes colour depending on the numeric value of the cell. No image will be displayed if the cells value is undefined or not a valid number. has optional properties for the formatterParams object, see FormatterParamsTraffic.
     *
     * @return formatter
     */
    static Formatter traffic() {
        return Js.cast("traffic");
    }

    /**
     * Displays a progress bar that fills the cell from left to right, using values 0-100 as a percentage of width. has optional properties for the formatterParams object, see FormatterParamsProgress.
     *
     * @return formatter
     */
    static Formatter progress() {
        return Js.cast("progress");
    }


    /**
     * Looks up the value to display from a object passed into the formatterParams property, if not present it displays the current cell value. To use this formatter you need to pass an object to formatterParams where the initial value of the cell is the property key and the value to be displayed is the property value (eg {"blue":"black", "red":"green"}, would change the value "blue" to "black", and the value "red" to green).
     *
     * @return formatter
     */
    static Formatter lookup() {
        return Js.cast("lookup");
    }

    /**
     * Displays a tick icon on each row (for use as a button).
     *
     * @return formatter
     */
    static Formatter buttonTick() {
        return Js.cast("buttonTick");
    }


    /**
     * Displays a cross icon on each row (for use as a button).
     *
     * @return formatter
     */
    static Formatter buttonCross() {
        return Js.cast("buttonCross");
    }

    /**
     * Shows an incrementing row number for each row as it is displayed.
     *
     * @return formatter
     */
    static Formatter rownum() {
        return Js.cast("rownum");
    }


    /**
     * Fills the cell with hamburger bars, to be used as a row handle.
     *
     * @return formatter
     */
    static Formatter handle() {
        return Js.cast("handle");
    }

    //todo - String or Function


    /**
     * As well as the built-in formatters you can define a formatter using a custom formatter function.
     * <p>
     * The formatter function accepts two arguments, the CellComponent for the cell being formatted and the formatterParams option from the column definition.
     * <p>
     * The function must return the contents of the cell, either the text value of the cell, valid HTML or a DOM node.
     *
     * @param <F>
     */
    @JsType
    interface Custom<F> {
        /**
         * @param cell     - the cell component
         * @param onRender -  function to call when the formatter has been rendered.
         * @return the contents of the cell, either the text value of the cell, valid HTML or a DOM node.
         */
        StringOr<Node> format(CellComponent cell, F FormatParams, Callback onRender);
    }

    /**
     * Install a custom formatter.
     */
    static <F> Formatter custom(Custom<F> customFormatter) {
        return Js.cast(customFormatter);
    }

}
