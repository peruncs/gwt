package com.peruncs.gwt.tabulator;


import elemental2.dom.Node;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface RowComponent {

    /**
     * You can freeze a row at the top of the table by calling the freeze function on the RowComponent Component of any row. This will insert the row above the scrolling portion of the table in the table header.
     */
    void freeze();

    /**
     * A frozen row can be unfrozen using the unfreeze function on the RowComponent Component of any row. This will remove the row from the table header and re-insert it back in the table.
     */
    void unfreeze();


    void reformat();

    /**
     * Returns the data object for the row.
     */
    Any getData();

    /**
     * Returns the DOM node for the row.
     */
    Node getElement();

    /**
     * Returns the Tabulator object for the table containing the row.
     */
    Tabulator getTable();

    /**
     * Returns the Row Component for the next visible row in the table, if there is no next row it will return a value of false.
     */
    RowComponentOrBoolean getNextRow();


    /**
     * Returns the Row Component for the previous visible row in the table, if there is no previous row it will return a value of false.
     */
    RowComponentOrBoolean getPrevRow();


    /** Returns an array of CellComponent objects, one for each cell in the row.*/
    CellComponent[] getCells();

    @JsType
    class RowComponentOrBoolean {
        //TODO
    }

}
