package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface HeaderTooltip {
    /***
     * @param enableToolTip a value of false disables the tooltip, a value of true sets the tooltip of the column header to its title value
     * @return HeaderTooltip
     */
    @JsOverlay
    static HeaderTooltip of(boolean enableToolTip) {
        return Js.cast(enableToolTip);
    }

    /**
     * @param toolTip - a string that will be displayed for the tooltip.
     * @return HeaderTooltip
     */
    @JsOverlay
    static HeaderTooltip of(String toolTip) {
        return Js.cast(toolTip);
    }

    /**
     * @param customToolTip - a custom call back.
     * @return HeaderTooltip
     */
    @JsOverlay
    static HeaderTooltip of(Custom customToolTip) {
        return Js.cast(customToolTip);
    }

    /**
     * A callback function that returns the string for the column header. see below:
     * The function accepts one argument, the ColumnComponent for the column the tooltip is being generated for.
     */
    @JsFunction
    @FunctionalInterface
    interface Custom {
        String generateToolTip(ColumnComponent column);
    }

}
