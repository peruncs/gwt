package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public interface Showable {

    /**
     * shows the column if it is hidden.
     */
    void show();

    /**
     * hides the column if it is visible.
     */
    void hide();

    /**
     * toggles the visibility of the column, switching between hidden and visible.
     */
    void toggle();

    /**
     * returns a boolean to show if the group is visible, a value of true means it is visible.
     */
    boolean getVisibility();

}
