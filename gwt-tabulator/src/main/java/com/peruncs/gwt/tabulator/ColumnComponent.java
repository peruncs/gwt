package com.peruncs.gwt.tabulator;

import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The column component provides access to a specific column.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface ColumnComponent extends BaseComponent, Showable {


    /**
     * returns the column definition object for the column.
     */
    ColumnOptions getDefinition();


    /**
     * returns the field name for the column.
     */
    String getField();

    /**
     * returns an array of CellComponent objects, one for each cell in the column.
     */
    CellComponent[] getCells();


    /**
     * returns the Column Component for the next visible column in the table, if there is no next column it will return a value of false.
     */
    ComponentOrBoolean<ColumnComponent> getNextColumn();


    /**
     * returns the Column Component for the previous visible column in the table, if there is no previous column it will return a value of false.
     */
    ComponentOrBoolean<ColumnComponent> getPrevColumn();


    /**
     * deletes the column, removing it from the table.
     */
    void delete();


    /**
     * scroll the table to the column if it is visible. By running them in the promise you ensure they are only run after the column has been scrolled to.
     */
    <T> Promise<T> scrollTo();


    /**
     * returns an array of ColumnComponent objects, one for each sub column of this column.
     */
    ColumnComponent[] getSubColumns();


    /**
     * returns the ColumnComponent for the parent column of this column. if no parent exists, this function will return false.
     */

    ColumnComponent getParentColumn();

    /**
     * place focus on the header filter element for this column if it exists.
     */

    void headerFilterFocus();


    /**
     * set the value of the columns header filter element to the value provided in the first argument.
     */
    void setHeaderFilterValue(String value);


    /**
     * rebuilds the header filter element, updating any params passed into the editor used to generate the filter.
     */
    void reloadHeaderFilter();


    /**
     * Any function that takes a component as an argument will also attempt to find that component based on the value provided if it is not a component itself. The following values can be used for each copmonent type:
     * Row
     * <p>
     * A ColumnComponent
     * The field name of the column
     * DOM node of the column
     */
    @JsType
    interface Lookup {
    }
}
