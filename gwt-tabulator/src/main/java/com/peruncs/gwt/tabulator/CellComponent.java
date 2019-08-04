package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import elemental2.dom.Node;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The cell component provides access to a specific cell.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface CellComponent extends BaseComponent {

    /**
     * @return current value for the cell.
     */
    JsObject getValue();

    /**
     * @return the previous value of the cell. Very usefull in the event of cell update callbacks.
     */
    JsObject getOldValue();

    /**
     * The restoreOldValue reverts the value of the cell back to its previous value, without triggering any of the cell edit callbacks.
     */
    void restoreOldValue();

    /**
     * returns the DOM node for the cell.
     */
    Node getElement();


    /**
     * returns the Tabulator object for the table containing the cell.
     */
    Tabulator getTable();


    /**
     * @return the RowComponent for the row that contains the cell.
     */
    RowComponent getRow();


    /**
     * @return the ColumnComponent for the column that contains the cell.
     */
    ColumnComponent getColumn();


    /**
     * @return the data for the row that contains the cell.
     */
    Any getData();


    /**
     * @return the field name for the column that contains the cell.
     */
    String getField();

    /**
     * You can change the value of the cell using the setValue function.
     *
     * @param value -the new value for the cell
     */
    void setValue(JsObject value);


    /**
     * You can change the value of the cell using the setValue function.
     *
     * @param value               -the new value for the cell
     * @param applyColumnMutators - apply the column mutators to the value when set to true (default = true).
     */
    void setValue(JsObject value, boolean applyColumnMutators);

    /**
     * If you are making manual adjustments to elements contained withing the cell, or the cell itself, it may sometimes be necessary to recalculate the height of all the cells in the row to make sure they remain aligned. Call the checkHeight function to check if the height of the cell has changed and normalize the row if it has.
     */
    void checkHeight();


    /**
     * You and programatically cause a cell to open its editor element using the edit function.
     */
    void edit();

    /**
     * @param forceEditor - force the editor to open even if editable is set to false.
     */
    void edit(boolean forceEditor);

    /**
     * cancel a cell edit that is currently in progress by calling the cancelEdit function.
     */
    void cancelEdit();


    Navigation nav();

    /**
     * When a cell is being edited it is possible to move the editor focus from the current cell to one if its neighbours. There are a number of functions that can be called on the nav function to move the focus in different directions.
     */
    @JsType(isNative = true)
    interface Navigation {

        /**
         * next editable cell on the left, if none available move to the right most editable cell on the row above.
         *
         * @return return false if none available.
         */
        boolean prev();

        /**
         * next editable cell on the right, if none available move to left most editable cell on the row below
         *
         * @return return false if none available.
         */
        boolean next();

        /**
         * next editable cell on the left, return false if none available on row)
         *
         * @return return false if none available.
         */
        boolean left();

        /**
         * next editable cell on the right, return false if none available on row.
         *
         * @return return false if none available.
         */
        boolean right();

        /**
         * move to the same cell in the row above
         */
        void up();

        /**
         * move to the same cell in the row below
         */
        void down();

    }


//    /**
//     * Any function that takes a component as an argument will also attempt to find that component based on the value provided
//     * if it is not a component itself. The following values can be used for each compmonent type.
//     */
//    @JsType
//    interface Lookup {
//        //todo
//    }

}
