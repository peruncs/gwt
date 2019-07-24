package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;


/**
 * Colour of traffic bar.
 */
@JsType
public interface Color {

    @JsFunction
    @FunctionalInterface
    interface Custom {
        String getColor(Any cellValue);
    }

    /**
     * Produce traffic bar from an array of strings.
     *
     * @param colors -an array of color strings, that will divide the background colour across the min-max range of values(eg ["green", "orange", "#ff0000"])
     * @return
     */
    static Color of(String... colors) {
        return Js.cast(colors);
    }

    /**
     * Custom the color.
     *
     * @param customCustom - a callback that is passed the value of the cell and must return the color (eg function(value){return "red"}).
     * @return
     */
    static Color of(Custom customCustom) {
        return Js.cast(customCustom);
    }
}
