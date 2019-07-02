package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.CallbackRet1;
import com.peruncs.gwt.utils.CallbackRet2;
import elemental2.dom.Element;
import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Tabulator {

    public Tabulator(Element element, TabulatorOptions options) {/* no body!*/}

    public Tabulator(String element, TabulatorOptions options) {/* no body!*/}

    native public void redraw();

    native public void redraw(boolean b);

    /**
     * You can show a hidden column at any point using the showColumn function. Pass the field name of the column you wish to show as the first parameter of the function
     *
     * @param name
     */
    native public void showColumn(String name);

    /**
     * You can hide a visible column at any point using the hideColumn function. Pass the field name of the column you wish to hide as the first parameter of the function.
     *
     * @param name
     */
    native public void hideColumn(String name);


    /**
     * You can toggle the visibility of a column at any point using the toggleColumn function. Pass the field name of the column you wish to toggle as the first parameter of the function.
     */
    native public void toggleColumn(String name);


    /**
     * Define sort order
     */
    native public void setSort(SortOrder[] sortOrder);

    native public void setSort(String column, String dir);

    native public Sorter getSorters();

    /**
     * To remove all sorting from the table.
     */
    native public void clearSort();

    /**
     * The setPage function takes one parameter, which should be an integer representing the page you wish to see. There are also four strings that you can pass into the parameter for special functions.
     * By running them in the promise you ensure they are only run after the table has loaded the data.
     * <p>
     * "first" - show the first page
     * "prev" - show the previous page
     * "next" - show the next page
     * "last" - show the last page
     *
     * @param p
     * @param <T>
     * @return
     */
    native public <T> Promise<T> setPage(StringOrInteger p);

    /**
     * You can change to show the next page using the nextPage function.
     */
    native public <T> Promise<T> nextPage();

    /**
     * You can change to show the previous page using the nextPage function.
     */
    native public <T> Promise<T> previousPage();

    /**
     * You can load the page for a specific row using the setPageToRow function and passing in any of the standard row component look up options for the row you want to scroll to.
     */
    native public <T> Promise<T> setPageToRow(int row);

    /**
     * returns number of rows allowed per page
     */
    native public BooleanOrInt getPageSize();

    /**
     * You can change the page size at any point by using the setPageSize function. (this setting will be ignored if using remote pagination with the page size set by the server)
     */
    native public void setPageSize(int pageSize);

    /**
     * returns current page
     */
    native public BooleanOrInt getPage();

    /**
     * returns maximum page
     */
    native public BooleanOrInt getPageMax();


    /**
     * You can use the setGroupBy function to change the fields that rows are grouped by. This function has one argument and takes the same values as passed to the groupBy setup option.
     *
     * @param groupByUnion
     */
    native public void setGroupBy(GroupByUnion groupByUnion);

    /**
     * You can use the setGroupStartOpen function to change the default open state of groups. This function has one argument and takes the same values as passed to the groupStartOpen setup option.
     *
     * @param groupStartOpenUnion
     */
    native public void setGroupStartOpen(GroupStartOpenUnion groupStartOpenUnion);

    /**
     * You can use the getGroups function to retrieve an array of all the first level Group Components in the table.
     * <p>
     * Note: If you use the setGroupStartOpen or setGroupHeader before you have set any groups on the table, the table will not update until the setGroupBy function is called.
     *
     * @param ghu
     */
    native public void setGroupHeader(GroupHeaderUnion ghu);

    native public GroupComponent[] getGroups();

    //Localization

    /**
     * Set locale.
     *
     * @param locale
     */
    native public void setLocale(StringOrBoolean locale);

    native public String getLocale();

    native public Any getLangs();

    //Altering Data

    /**
     * The replaceData function lets you silently replace all data in the table without updating scroll position, sort or filtering, and without triggering the ajax loading popup. This is great if you have a table you want to periodically update with new/updated information without alerting the user to a change.
     *
     * @param newdata
     * @return
     */
    native public Promise<Void> replaceData(Any[] newdata);

    /**
     * Replace data from ajax request
     */
    native public Promise<Void> replaceData(String ajaxRequest);

    /**
     * Replace data from ajax request property
     */
    native public Promise<Void> replaceData();


    native public Promise<Void> setData(Any[] newdata);

    native public Promise<Void> setData(String ajaxRequest);

    native public Promise<Void> setData();

    /**
     * If you want to update an existing set of data in the table, without completely replacing the data as the setData method would do, you can use the updateData method.
     * <p>
     * This function takes an array of row objects and will update each row based on its index value. (the index defaults to the "id" parameter, this can be set using the index option in the tabulator constructor). Options without an index will be ignored, as will items with an index that is not already in the table data. The addRow function should be used to add new data to the table.
     * <p>
     * The function will not replace the rows with the provided data, it will only update any of the provided parameters.
     */
    native public Promise<Void> updateData(Any[] newdata);

    native public Promise<Void> updateData(String ajaxRequest);

    native public Promise<Void> updateData();

    /**
     * You can add a data to the existing table data using the addData function.
     * <p>
     * The first argument should be an array of row data objects. If you do not pass data for a column, it will be left empty.
     * <p>
     * The second argument is optional and determines whether the data is added to the top or bottom of the table. A value of true will add the data to the top of the table, a value of false will add the data to the bottom of the table. If the parameter is not set the data will be placed according to the addRowPos global option.
     * <p>
     * Data Mutation
     * if you have defined any mutator functions in your column definition array, these will be applied to the new data before the data is added.
     */
    native public Promise<RowComponent[]> addData(Any[] newdata, boolean addToTop);

    native public Promise<RowComponent[]> addData(String ajaxRequest, boolean addToTop);

    native public Promise<RowComponent[]> addData(boolean addToTop);


    /**
     * If the data you are passing to the table contains a mix of existing rows to be updated and new rows to be added then you can call the updateOrAddData function. This will check each row object provided and update the existing row if available, or else create a new row with the data.
     * <p>
     * Data Mutation
     * if you have defined any mutator functions in your column definition array, these will be applied to the new data before the table is updated.
     */
    native public Promise<RowComponent[]> updateOrAddData(Any[] newdata);

    native public Promise<RowComponent[]> updateOrAddData(String ajaxRequest);

    native public Promise<RowComponent[]> updateOrAddData();

    /**
     * You can remove all data from the table using the clearData function.
     */
    native public void clearData();


    //Retrieving Data

    /**
     * You can retrieve the data stored in the table using the getData function.  This will return an array containing the data objects for each row in the table.
     *
     * @return
     */
    native public Any[] getData();

    /**
     * By default getData will return an array containing all the data held in the Tabulator. If you only want to access the currently filtered/sorted elements, you can pass a value of true to the first argument of the function.
     *
     * @param filteredSortedOnly
     * @return
     */
    native public Any[] getData(boolean filteredSortedOnly);

    /**
     * You can retrieve the a count of the number of rows stored in the table using the getDataCount function.
     */
    native public int getDataCount();


    /**
     * If you only want to count the currently filtered/sorted elements, you can pass a value of true to the first argument of the function.
     */
    native public int getDataCount(boolean filteredSortedOnly);


    //Row Manipulation

    /**
     * To rereive the DOM Node of a specific row, you can retrieve the RowComponent with the getRow function, then use the getElement function on the component. The first argument is the row you are looking for, it will take any of the standard row component look up options.
     */
    native public RowComponent getRow(RowComponent.Lookup row);

    /**
     * You can delete any row in the table using the deleteRow function. The first argument is the row you want to delete, it will take any of the standard row component look up options.
     */
    native public Promise<Void> deleteRow(RowComponent.Lookup row);

    /**
     * You can retrieve all the row components in the table using the getRows function. This will return an array containing the Row Component for each row in the table.
     */
    native public RowComponent[] getRows();

    native public RowComponent[] getRows(boolean filteredSortedOnly);

    /**
     * The searchRows function allows you to retreive an array of row components that match any filters you pass in. it accepts the same arguments as the setFilter function.
     *
     * @param field
     * @param operator
     * @param value
     * @return
     */
    native public RowComponent[] searchRows(String field, String operator, Any value);

    native public RowComponent[] searchRows(Filter... filter);

    native public <P> RowComponent[] searchRows(CallbackRet1<Boolean, P> callback, P calbackParams);

    /**
     * The searchData function allows you to retrieve an array of table row data that match any filters you pass in. it accepts the same arguments as the setFilter function.
     */
    native public Any[] searchData(String field, String operator, Any value);

    native public Any[] searchData(Filter... filter);

    native public <P> Any[] searchData(CallbackRet1<Boolean, P> callback, P calbackParams);

    /**
     * Use the getRowPosition function to retrieve the numerical position of a row in the table. By default this will return the position of the row in all data, including data currently filtered out of the table.
     * <p>
     * The first argument is the row you are looking for, it will take any of the standard row component look up options. If you want to get the position of the row in the currently filtered/sorted data, you can pass a value of true to the optional second argument of the function.
     * If the row is not found, a value of -1 will be returned, row positions start at 0
     */

    native public int getRowPosition(RowComponent.Lookup row, boolean filteredSortedOnly);


    /**
     * You can retrieve the Row Component of a row at a given position in the table using getRowFromPosition function. By default this will return the row based in its position in all table data, including data currently filtered out of the table.
     * <p>
     * If you want to get a row based on its position in the currently filtered/sorted data, you can pass a value of true to the optional second argument of the function.
     */
    native public RowComponent getRowFromPosition(RowComponent.Lookup row, boolean filteredSortedOnly);

    /**
     * You can retrieve the table data as a simple HTML table. This will return a HTML encoded string of the table data..
     */
    native public String getHtml();

    /**
     * You can add a row to the table using the addRow function.
     * <p>
     * The first argument should be a row data object. If you do not pass data for a column, it will be left empty. To create a blank row (ie for a user to fill in), pass an empty object to the function.
     * <p>
     * The second argument is optional and determines whether the row is added to the top or bottom of the table. A value of true will add the row to the top of the table, a value of false will add the row to the bottom of the table. If the parameter is not set the row will be placed according to the addRowPos global option.
     */
    native public void addRow(Any data, boolean addToTop);

    /**
     * If you want to add the row next to an existing row you can pass an optional third argument to the function that will position the new row next to the specified row (above or below based on the value of the second argument). This argument will take any of the standard row component look up options:
     */
    native public Promise<RowComponent> addRow(Any data, boolean addToTop, RowComponent.Lookup row);


    /**
     * You can update any row in the table using the updateRow function.
     * <p>
     * The first argument is the row you want to update, it will take any of the standard row component look up options.
     * <p>
     * The second argument should be the updated data object for the row. As with the updateData function, this will not replace the existing row data object, it will only update any of the provided parameters.
     * <p>
     * Once complete, this function will trigger the rowUpdated and dataEdited events.
     * <p>
     * This function will return true if the update was successful or false if the requested row could not be found. If the new data matches the existing row data, no update will be performed.
     */
    //native public boolean updateRow(RowComponent.Lookup row, Any data);
    native public Promise<RowComponent> updateRow(RowComponent.Lookup row, Any data);

    /**
     * If you don't know whether a row already exists you can use the updateOrAddRow function. This will check if a row with a matching index exists, if it does it will update it, if not it will add a new row with that data. This takes the same arguments as the updateRow function.
     */
    native public Promise<RowComponent> updateOrAddRow(RowComponent.Lookup row, Any data);

    //Filters
    native public void setFilter(String field, String operator, Any values);

    native public void setFilter(String field, String operator, Any[] values);

    native public void setFilter(Filter... filters);

    native public void setFilter(Filter[][] filters);//Or filters

    native public void setFilter(CallbackRet2<Any, Any, Boolean> customFilter, Any filterParam);

    native public void addFilter(String field, String operator, Any values);

    native public void addFilter(Filter filter);

    native public void removeFilter(String field, String operator, Any values);

    native public void removeFilter(Filter filter);

    /**
     * To include header filters in the returend array pass an option argument of true to the getFilters function
     *
     * @return
     */
    native public Filter[][] getFilters(boolean includeHeaderFilters);

    /**
     * To remove all filters from the table, use the clearFilter function.
     */
    native public void clearFilter();

    /**
     * This will clear all programatically set filters, if you wisht to clear all header filters as well pass an argument of true to this function.
     */
    native public void clearFilter(boolean includeHeaderFilters);

    /**
     * To remove just the header filters, leaving the programatic filters in place, use the clearHeaderFilter function.
     */
    native public void clearHeaderFilter();


    /**
     * You can programatically set the header filter value of a column by calling the setHeaderFilterValue function, This function takes any of the standard column component look up options as its first parameter, with the value for the header filter as the second option
     */
    native public void setHeaderFilterValue(String columnName, Any value);

    /**
     * You can programatically set the focus on a header filter element by calling the setHeaderFilterFocus function, This function takes any of the standard column component look up options as its first parameter
     */
    native public void setHeaderFilterFocus(String column);


    /**You can retrieve the results of the column calculations at any point using the getCalcResults function.
     *
     * For a table without grouped rows, this will return an object with top and bottom properties, that contain a row data object for all the columns in the table for the top calculations and bottom calculations respectively.
     *
     * {
     *     top:{
     *         age:53,
     *         score:73
     *     },
     *     bottom:{
     *         age:27,
     *         score:66
     *     },
     * }
     * For tables with grouped rows, this will return an object, where each group is represented by a property in the object, with the key for the group being the key for the property. As above each of the grouped objects contains a top and bottom property as well as a groups property that contains the data for any sub groups.
     *
     * {
     *     old:{
     *         top:{
     *             age:53,
     *             score:73
     *         },
     *         bottom:{
     *             age:95,
     *             score:66
     *         },
     *         groups:{
     *             //data for any sub groups
     *         }
     *     }
     *     young:{
     *         top:{
     *             age:18,
     *             score:73
     *         },
     *         bottom:{
     *             age:12,
     *             score:66
     *         },
     *         groups:{
     *             //data for any sub groups
     *         }
     *     }
     * }
     * */

    native public Any getCalcResults();

}
