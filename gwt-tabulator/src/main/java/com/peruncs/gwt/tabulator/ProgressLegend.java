package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * A text value to display over the progress bar.
 * - string - any string
 * - boolean - if set to true this will show the value of the cell
 * - function - a callback that is passed the value of the cell and must return the legend contents (eg function(value){return value + "%"})
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface ProgressLegend {

    /**
     * Constructor.
     *
     * @param value - any value
     * @return ProgressLegend
     */
    @JsOverlay
    static ProgressLegend of(String value) {
        return Js.cast(value);
    }

    /**
     * Constructor.
     *
     * @param showCellValue - if set to true this will show the value of the cell
     * @return ProgressLegend
     */
    @JsOverlay
    static ProgressLegend of(boolean showCellValue) {
        return Js.cast(showCellValue);
    }

    /**
     * Constructor.
     *
     * @param customGenerator a callback that is passed the value of the cell and must return the legend contents (eg function(value){return value + "%"})
     * @return ProgressLegend
     */
    @JsOverlay
    static ProgressLegend of(CallbackRet1<String, CellComponent> customGenerator) {
        return Js.cast(customGenerator);
    }

}