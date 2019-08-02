package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface FormatterParams {

    @JsType
    class TimeBase {
        /**
         * The format of the date/time in the row data(default: YYY-MM-DD hh:mm:ss).
         */
        public String inputFormat;

        /**
         * The value to be displayed if an invalid input date/time is provided (default:""), this can take three different types of value:
         * true - a boolean of true will display the cells original value
         * function - a function passed into this will be called with the original value of the cell passed into its first argument
         * string/number - a string on number will be displayed instead of the cells value
         */
        public InvalidPlaceHolder invalidPlaceholder;
    }

    @JsType
    class DateTime extends TimeBase {

        /**
         * The format of the date/time to be displayed (default: DD/MM/YYYY hh:mm:ss)
         */
        public String outputFormat;
    }

    @JsType
    class DateTimeDiff extends TimeBase {

        /**
         * A moment object of the data to compare against (defaults to the current date time)
         */
        public Any date;

        /**
         * If set to true diff will be displayed in a human readable fashion (eg "10 days") (default: false).
         */
        boolean humanize;

        /**
         * The time using for the difference ("years", "months", "weeks", "days", "hours", "minutes", "seconds"). This property will be ignored if humanize is used (default is "seconds").
         */
        public String unit;

        /**
         * If humanize is used setting this to true will make times relative (eg "10 days ago"). if humanize is not used the string passed to this will be appended after the difference value (default:false)"
         */
        public boolean suffix;
    }

    @JsType
    class Image {
        /**
         * a CSS value for the height of the image
         */
        public StringOr<Integer> height;

        /**
         * a CSS value for the width  of the image
         */
        public StringOr<Integer> width;

    }

    @JsType
    class Link {
        /**
         * The field in the row data that should be used for the link lable
         */
        public String labelField;

        /**
         * Representing the lable, or a function which must return the string for the label, the function is passed the Cell Component as its first argument.
         */
        public String label;

        /**
         * A prefix to put before the url value (eg. to turn a emaill address into a clickable mailto link you should set this to "mailto:").
         */
        public String urlPrefix;

        /**
         * -The field in the row data that should be used for the link url.
         */
        public String urlField;

        /**
         * Representing the url, or a function which must return the string for the url, the function is passed the Cell Component as its first argument.
         */

        @JsFunction
        @FunctionalInterface
        public interface URLProvider {
            String provideURL(CellComponent cell);
        }

        public StringOr<URLProvider> url;

        /**
         * Representing the value of the anchor tags target artibute (eg. set to "_blank" to open link in new tab).
         */
        public String target;

    }

    @JsType
    class Money {

        /**
         * Symbol to represent the decimal point (default ".")
         */
        public String decimal;

        /**
         * Symbol to represent the thousands seperator (default ",")
         */
        public String thousand;

        /**
         * Currency symbol (no default)
         */
        public String symbol;

        /**
         * Position the symbol after the number (default false)
         */
        public boolean symbolAfter;
        /**
         * The number of decimals to display (default is 2), setting this value to false will display however many decimals are provided with the number
         */
        public boolean precision;
    }


    @JsType
    class Traffic {

        /**
         * Minimum value for progress bar (default 0).
         */
        public int min;

        /**
         * Maximum value for progress bar (default 100).
         */
        public int max;

        /**
         * Color.
         */
        public Color color;
    }

    @JsType
    class Progress extends Traffic {

        /**
         * A text value to display over the progress bar, this can be:
         * - string - any string
         * - boolean - if set to true this will show the value of the cell
         * - function - a callback that is passed the value of the cell and must return the legend contents (eg function(value){return value + "%"})
         */
        public ProgressLegend legend;

        /**
         * The text colour for the legend, has the same range of value options as the color property.
         */
        public Color legendColor;


        /**
         * The text alignment for the legend, this can be:
         * "center" - center align text (default)
         * "left" - left align text
         * "right" - right align text
         * "justify" - stretch out text to fit line
         */
        public String legendAlign;

    }

    @JsType
    class Star {

        /**
         * maximum number of stars to be displayed (default 5)
         */
        public int stars = 5;
    }

    @JsType
    class TickCross {

        /**
         * Set to true to cause empty values (undefined, null, "") to display an empty cell instead of a cross (default false).
         */
        public boolean allowEmpty;

        /**
         * Set to true to allow any truthy value to show a tick (default false).
         */
        public boolean allowTruthy;

        /**
         * Custom HTML for the tick element, if set to false the tick element will not be shown (it will only show crosses).
         */
        public boolean tickElement;

        /**
         * Custom HTML for the cross element, if set to false the cross element will not be shown (it will only show ticks)
         */
        public boolean crossElement;

    }

    /**
     * If you want to dynamically generate the formatterParams at the time the formatter is called
     * you can pass a function into the property that should return the params object
     *
     * @param <F>
     */
    @FunctionalInterface
    @JsFunction
    interface Lookup<F> {
        /**
         * Lookup function.
         *
         * @param cell - the cell component
         * @return the params object
         */
        F paramLookup(CellComponent cell);
    }

    @JsOverlay
    static FormatterParams of(DateTime dateTime) {
        return Js.cast(dateTime);
    }

    @JsOverlay
    static FormatterParams of(DateTimeDiff dateTimeDiff) {
        return Js.cast(dateTimeDiff);
    }

    @JsOverlay
    static FormatterParams of(Image image) {
        return Js.cast(image);
    }

    @JsOverlay
    static FormatterParams of(Link link) {
        return Js.cast(link);
    }

    @JsOverlay
    static FormatterParams of(Money money) {
        return Js.cast(money);
    }

    @JsOverlay
    static FormatterParams of(Traffic traffic) {
        return Js.cast(traffic);
    }

    @JsOverlay
    static FormatterParams of(Progress progress) {
        return Js.cast(progress);
    }

    @JsOverlay
    static FormatterParams of(Star star) {
        return Js.cast(star);
    }

    @JsOverlay
    static FormatterParams of(TickCross tickCross) {
        return Js.cast(tickCross);
    }

    @JsOverlay
    static <F> FormatterParams of(Lookup lookup) {
        return Js.cast(lookup);
    }
}