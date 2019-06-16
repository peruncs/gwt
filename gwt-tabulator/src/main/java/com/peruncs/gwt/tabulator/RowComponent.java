package com.peruncs.gwt.tabulator;

import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * The row component provides access to a specific row.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface RowComponent extends BaseComponent {


    /**
     * Returns the data object for the row.
     */
    Any getData();


    /**
     * Returns the Row Component for the next visible row in the table, if there is no next row it will return a value of false.
     */
    ComponentOrBoolean<RowComponent> getNextRow();


    /**
     * Returns the Row Component for the previous visible row in the table, if there is no previous row it will return a value of false.
     */
    ComponentOrBoolean<RowComponent> getPrevRow();


    /**
     * Returns an array of CellComponent objects, one for each cell in the row.
     */
    CellComponent[] getCells();

    /**
     * Returns the CellComponent for the specified column from this row.
     */
    CellComponent getCell(String column);

    /**
     * Returns the index value for the row. (this is the value from the defined index column, NOT the row's position in the table)
     */
    Any getIndex();


    /**
     * Retrieve the numerical position of a row in the table. By default this will return the position of the row in all data, including data currently filtered out of the table.
     * If you want to get the position of the row in the currently filtered/sorted data, you can pass a value of true to the optional first argument of the function.
     */
    int getPosition(boolean inFilteredSortedData);


    /**
     * When using grouped rows, you can retrieve the group component for the current row
     */

    GroupComponent getGroup();

    /**
     * Deletes the row, removing its data from the table.  By running them in the promise you ensure they are only run after the row has been deleted.
     */
    <T> Promise<T> delete();

    /**
     * Will scroll the table to the row if it passes the current filters.By running them in the promise you ensure they are only run after the row has been scrolled to.
     */
    <T> Promise<T> scrollTo();


    /**
     * Will load the page for the row if it passes the current filters. By running them in the promise you ensure they are only run after the page has been loaded. This functionality is only available on local pagination. when using remote pagination Tabulator has ow way to lookup which page the requested row is on.
     */
    <T> Promise<T> pageTo();

    /**
     * You can move a row next to another row using the move function.
     * The first argument should be the target row that you want to move to, and can be any of the standard row component look up options.
     * The second argument determines whether the row is moved to above or below the target row. A value of false will cause to the row to be placed below the target row, a value of true will result in the row being placed above the target
     *
     * @param target
     * @param aboveTarget
     */
    void move(BaseComponentOrInteger target, boolean aboveTarget);


    /**
     * You can update the data in the row using the update function. You should pass an object to the function containing any fields you wish to update.
     * This object will not replace the row data, only the fields included in the object will be updated.
     * By running them in the promise you ensure they are only run after the row has been updated.
     */
    <T> Promise<T> update(String[] fields);

    /**
     * select the current row.
     */
    void select();

    /**
     * deselect the current row.
     */
    void deselect();

    /**
     * will toggle the selected state the current row.
     */
    void toggleSelect();

    /**
     * If you are making manual adjustments to elements contained within the row, it may sometimes be necessary to recalculate the height of all the cells in the row to make sure they remain aligned. Call the normalizeHeight function to do this.
     */
    void normalizeHeight();

    /**
     * If you want to re-format a row once it has been rendered to re-trigger the cell formatters and the rowFormatter callback
     */
    void reformat();

    /**
     * You can freeze a row at the top of the table by calling the freeze function. This will insert the row above the scrolling portion of the table in the table header.
     */

    void freeze();

    /**
     * A frozen row can be unfrozen using the unfreeze function. This will remove the row from the table header and re-insert it back in the table.
     */
    void unfreeze();

    /**
     * When the tree structure is enabled the treeExpand function will expand current row and show its children.
     */
    void treeExpand();

    /**
     * When the tree structure is enabled the treeToggle function will toggle the collapsed state of the current row.
     */
    void treeToggle();

    /**
     * When the tree structure is enabled the treeCollapse function will collapse current row and hide its children.
     */
    void treeCollapse();


    /**
     * When the tree structure is enabled the getTreeParent function will return the Row Component for the parent of this row. If no parent exists, a value of false will be returned.
     */
    RowComponent getTreeParent();

    RowComponent[] getTreeChildren();

    /**
     * Any function that takes a component as an argument will also attempt to find that component based on the value provided if it is not a component itself. The following values can be used for each copmonent type:
     * Row
     * <p>
     * A RowComponent
     * The index value of the row
     * DOM node of the row
     */
    @JsType
    interface Lookup {
    }

}
