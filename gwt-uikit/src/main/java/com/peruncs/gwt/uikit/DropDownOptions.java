package com.peruncs.gwt.uikit;

import com.peruncs.gwt.utils.StringOr;
import jsinterop.annotations.JsType;

/**
 * Options for Drop and Dropdown components initialization.
 */
@JsType
public class DropDownOptions {

    /**
     * CSS selector for the element to be used as toggle. By default, the preceding element is used.
     */
    public StringOr<Boolean> toggle;
    /**
     * The position of the drop.
     */
    public String pos = "bottom-left";
    /**
     * Comma separated list of drop trigger behaviour modes: hover, click
     */
    public String mode = "click, hover";
    /**
     * Delay time in milliseconds before a drop is displayed in hover mode.
     */
    public int delayShow = 0;
    /**
     * Delay time in milliseconds before a drop is hidden in hover mode.
     */
    public int delayHide = 800;
    /**
     * CSS selector of the element to maintain the drop's visibility.
     */
    public String boundary = "window";
    /**
     * Align the drop to its boundary.
     */
    public boolean boundaryAlign;

    /**
     * Automatically flip the drop. Possible values are false, true, x or y.
     */
    public StringOr<Boolean> flip;

    /**
     * The offset of the drop's container.
     */
    public int offset;

    /**
     * Space separated names of animations to apply.
     */
    public String animation;


    /**
     * Animation duration in milliseconds.
     */
    public int duration = 200;

}
