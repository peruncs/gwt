package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.CallbackRet1;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface Tooltip {

    @JsOverlay
    static Tooltip disable() {
        return Js.cast(false);
    }

    @JsOverlay
    static Tooltip of(String tooltip) {
        return Js.cast(tooltip);
    }

    /**
     * a callback function that returns the string for the cell
     * @param toolTipGenerator
     * @return tooltip
     */
    @JsOverlay
    static Tooltip of(CallbackRet1<String, CellComponent> toolTipGenerator) {
        return Js.cast(toolTipGenerator);
    }


}
