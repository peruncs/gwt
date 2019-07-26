package com.peruncs.gwt.tabulator;

import elemental2.dom.Node;


public interface BaseComponent {

    //todo - extract common methods

    /**
     * returns the DOM node for the column.
     */
    Node getElement();

    /**
     * returns the Tabulator object for the table containing the column.
     */
    Tabulator getTable();


//    /**
//     * shows the group if it is hidden.
//     */
//    void show();
//
//
//    /**
//     * hides the group if it is visible.
//     */
//    void hide();
//
//
//    /** toggles the visibility of the group, switching between hidden and visible.*/
//
//    void toggle();

}
