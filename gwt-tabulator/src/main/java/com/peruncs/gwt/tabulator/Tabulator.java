package com.peruncs.gwt.tabulator;


import com.peruncs.gwt.utils.Callback1;
import com.peruncs.gwt.utils.CallbackRet;
import com.peruncs.gwt.utils.CallbackRet1;
import com.peruncs.gwt.utils.StringOr;
import elemental2.core.JsObject;
import elemental2.dom.Node;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Tabulator {

    @JsConstructor
    public Tabulator(StringOr<Node> element, TabulatorOptions options) {/* no body!*/}

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
     * @param p - the page number.
     * @return a promise.
     */
    native public Promise<Void> setPage(StringOr<Integer> p);

    /**
     * You can change to show the next page using the nextPage function.
     */
    native public Promise<Void> nextPage();

    /**
     * You can change to show the previous page using the nextPage function.
     */
    native public Promise<Void> previousPage();

    /**
     * You can load the page for a specific row using the setPageToRow function and passing in any of the standard row component look up options for the row you want to scroll to.
     */
    native public Promise<Void> setPageToRow(int row);

    /**
     * returns number of rows allowed per page
     */
    native public BooleanOr<Integer> getPageSize();

    /**
     * You can change the page size at any point by using the setPageSize function. (this setting will be ignored if using remote pagination with the page size set by the server)
     */
    native public void setPageSize(int pageSize);

    /**
     * returns current page
     */
    native public BooleanOr<Integer> getPage();

    /**
     * returns maximum page
     */
    native public BooleanOr<Integer> getPageMax();


    /**
     * You can use the setGroupBy function to change the fields that rows are grouped by. This function has one argument and takes the same values as passed to the groupBy setup option.
     *
     * @param groupBy
     */
    native public void setGroupBy(GroupBy groupBy);

    /**
     * You can use the setGroupStartOpen function to change the default open state of groups. This function has one argument and takes the same values as passed to the groupStartOpen setup option.
     *
     * @param groupStartOpen
     */
    native public void setGroupStartOpen(GroupStartOpen groupStartOpen);

    /**
     * You can use the getGroups function to retrieve an array of all the first level Group Components in the table.
     * <p>
     * Note: If you use the setGroupStartOpen or setGroupHeader before you have set any groups on the table, the table will not update until the setGroupBy function is called.
     *
     * @param ghu
     */
    native public void setGroupHeader(GroupHeader ghu);

    native public GroupComponent[] getGroups();

    //Localization

    /**
     * Set locale.
     *
     * @param locale
     */
    native public void setLocale(BooleanOr<String> locale);

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

    native public Promise<Void> setData(String ajaxRequest, JsPropertyMap<String> additionalParams);

    native public Promise<Void> setData(String ajaxRequest, JsPropertyMap<String> additionalParams, AjaxConfig ajaxConfig);

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
     * @param restricted "active" - only return rows that pass the current filters. "visible" - only return rows currently visible in the table viewport.
     * @return any
     */
    native public Any[] getData(String restricted);


    /**
     * You can retrieve the a count of the number of rows stored in the table using the getDataCount function.
     */
    native public int getDataCount();


    /**
     * If you only want to count the currently filtered/sorted elements, you can pass a value of true to the first argument of the function.
     *
     * @param restricted "active" - only return rows that pass the current filters. "visible" - only return rows currently visible in the table viewport.
     * @return count.
     */
    native public int getDataCount(String restricted);


    //Row Manipulation

    /**
     * To rereive the DOM Node of a specific row, you can retrieve the RowComponent with the getRow function, then use the getElement function on the component. The first argument is the row you are looking for, it will take any of the standard row component look up options.
     */
    native public RowComponent getRow(RowComponent.Lookup row);

    /**
     * You can delete any row in the table using the deleteRow function. The first argument is the row you want to delete, it will take any of the standard row component look up options.
     */
    native public Promise<Void> deleteRow(RowComponent.Lookup row);

    native public Promise<Void> deleteRow(RowComponent.Lookup[] rows);

    /**
     * You can retrieve all the row components in the table using the getRows function. This will return an array containing the Row Component for each row in the table.
     */
    native public RowComponent[] getRows();

    /**
     * @param restricted "active" - only return rows that pass the current filters
     *                   "visible" - only return rows currently visible in the table viewport
     * @return
     */
    native public RowComponent[] getRows(String restricted);

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
     * You can retrieve the table data as a simple HTML table. This will return a HTML encoded string of the table data.
     * Also @see TabulatorOptions#htmlOutputConfig.
     */
    native public String getHtml();

    /**
     * Export as html with options.
     *
     * @param includeAllActiveRows     - whether the output table contains all active rows (false), or just those currently visible (true). By default this is false.
     * @param stayledToMatchTable      - output of the function should be styled to match the table (true) or be a blank html table (false), by defualt this is false
     * @param htmlOutputConfigOverride - can be used to override the object set on the htmlOutputConfig option. @see Tabulator#htmlOutputConfig .
     * @return
     */
    native public String getHtml(boolean includeAllActiveRows, boolean stayledToMatchTable, HtmlOutputConfig htmlOutputConfigOverride);


    /**
     * You can use the print function to trigger a full page printing of the contents of the table without any other elements from the page.
     *
     * @param activeOrVisible     - whether the output table contains all active rows (false), or just those currently visible (true). By default this is false.
     * @param stayledToMatchTable - output of the function should be styled to match the table (true) or be a blank html table (false), if you leave this argument out it will take the value of the printCopyStyle option.
     * @param printConfigOverride - override the object set on the printConfig option, @see TabulatorOptions#printConfig .
     */
    native public void print(boolean activeOrVisible, boolean stayledToMatchTable, HtmlOutputConfig printConfigOverride);

    native public void print();


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


    native public void setFilter(CustomFilter customFilter);

    native public void setFilter(CustomFilter customFilter, JsObject filterParam);

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


    /**
     * You can retrieve the results of the column calculations at any point using the getCalcResults function.
     * <p>
     * For a table without grouped rows, this will return an object with top and bottom properties, that contain a row data object for all the columns in the table for the top calculations and bottom calculations respectively.
     * <p>
     * {
     * top:{
     * age:53,
     * score:73
     * },
     * bottom:{
     * age:27,
     * score:66
     * },
     * }
     * For tables with grouped rows, this will return an object, where each group is represented by a property in the object, with the key for the group being the key for the property. As above each of the grouped objects contains a top and bottom property as well as a groups property that contains the data for any sub groups.
     * <p>
     * {
     * old:{
     * top:{
     * age:53,
     * score:73
     * },
     * bottom:{
     * age:95,
     * score:66
     * },
     * groups:{
     * //data for any sub groups
     * }
     * }
     * young:{
     * top:{
     * age:18,
     * score:73
     * },
     * bottom:{
     * age:12,
     * score:66
     * },
     * groups:{
     * //data for any sub groups
     * }
     * }
     * }
     */

    native public Any getCalcResults();

    //Cell Navigation

    /**
     * Use the navigatePrev function to shift focus to the next editable cell on the left, if none available move to the right most editable cell on the row above.
     * <p>
     * If the keybindings module is installed, this action can also be triggered with the shift + tab key combination.
     */
    native public void navigatePrev();


    /**
     * Use the navigateNext function to shift focus to the next editable cell on the right, if none available move to left most editable cell on the row below.
     * <p>
     * If the keybindings module is installed, this action can also be triggered with the tab key combination.
     */
    native public void navigateNext();

    /**
     * Use the navigateLeft function to shift focus to next editable cell on the left, return false if none available on row.
     */
    native public boolean navigateLeft();


    /**
     * Use the navigateRight function to shift focus to next editable cell on the right, return false if none available on row.
     */
    native public boolean navigateRight();


    /**
     * Use the navigateUp function to shift focus to the same cell in the row above.
     * If the keybindings module is installed, this action can also be triggered with the up arrow key combination.
     */
    native public void navigateUp();

    /**
     * Use the navigateDown function to shift focus to the same cell in the row below.
     * If the keybindings module is installed, this action can also be triggered with the down arrow key combination.
     */
    native public void navigateDown();


    //Scrolling

    /**
     * Triggered when the table is vertically scrolled
     */
    public ScrollCallback scrollVertical;

    /**
     * Triggered when the table is horizontally scrolled.
     */
    public ScrollCallback scrollHorizontal;

    /**
     * If you want to trigger an animated scroll to a column then you can use the scrollToColumn function.
     * The first argument should be any of the standard column component look up options for the column you want to scroll to.
     * <p>
     * The second argument is optional, and is used to set the position of the column, it should be a string with a value of either left, middle or right, if omitted it will be set to the value of the scrollToColumnPosition option which has a default value of left.
     * <p>
     * The third argument is optional, and is a boolean used to set if the table should scroll if the column is already visible, true to scroll, false to not, if omitted it will be set to the value of the scrollToColumnIfVisible option, which defaults to true
     * <p>
     * The function will return a promise, this can be used to run any other commands that have to be run after the column has been scrolled to
     */
    native public Promise<Void> scrollToColumn(ColumnComponent.Lookup column, String columnPosition, boolean scrollToColumnIfVisible);

    native public Promise<Void> scrollToColumn(ColumnComponent.Lookup column, String columnPosition);

    native public Promise<Void> scrollToColumn(ColumnComponent.Lookup column);

    /**
     * If you want to trigger an animated scroll to a row then you can use the scrollToRow function.
     * The first argument should be any of the standard row component look up options for the row you want to scroll to.
     * The second argument is optional, and is used to set the position of the row, it should be a string with a value of either top, center, bottom or nearest, if omitted it will be set to the value of the scrollToRowPosition option which has a default value of top.
     * The third argument is optional, and is a boolean used to set if the table should scroll if the row is already visible, true to scroll, false to not, if omitted it will be set to the value of the scrollToRowIfVisible option, which defaults to true.
     * The function will return a promise, this can be used to run any other commands that have to be run after the row has been scrolled to
     */
    native public Promise<Void> scrollToRow(RowComponent.Lookup row, String rowPosition, boolean scrollToRowIfVisible);

    native public Promise<Void> scrollToRow(RowComponent.Lookup row, String rowPosition);

    native public Promise<Void> scrollToRow(RowComponent.Lookup row);

    /**
     * If you want to programmatically move a row to a new position you can use the moveRow function.
     * <p>
     * The first argument should be the row you want to move, and can be any of the standard row component look up options.
     * <p>
     * The second argument should be the target row that you want to move to, and can be any of the standard row component look up options.
     * <p>
     * The third argument determines whether the row is moved to above or below the target row. A value of false will cause to the row to be placed below the target row, a value of true will result in the row being placed above the target
     */
    native public void moveRow(RowComponent.Lookup rowToMove, RowComponent.Lookup targetRow, boolean placeAboveTarget);

    //Select Row

    /**
     * To programmatically select a row you can use the selectRow function.
     * To select a specific row you can pass the any of the standard row component look up options into the first argument of the function. If you leave the argument blank you will select all rows (if you have set the selectable option to a numeric value, it will be ignored when selecting all rows).
     * If you want to select multiple rows you can pass an array of row component look up options into the first parameter
     * If you do not pass any arguments to the selectRow function, all rows will be selected. To select only rows that have been filtered pass true as the first argument.
     */

    native public void selectRow(RowComponent.Lookup row);

    native public void selectRow(RowComponent.Lookup[] rows);

    /**
     * select rows.
     * @param arg - "all", "active", "visible".
     */
    native public void selectRow(String arg);

    native public void selectRow();


    //Deselect Row

    /**
     * To programmatically deselect a row you can use the deselectRow function.
     * <p>
     * To deselect a specific row you can pass any of the standard row component look up options into the first argument of the function. If you leave the argument blank you will deselect all rows.
     * <p>
     * If you want to deselect multiple rows you can pass an array of row component look up options into the first parameter
     */

    native public void deselectRow(RowComponent.Lookup row);

    native public void deselectRow(RowComponent.Lookup[] rows);

    native public void deselectRow();


    //Get Selected Data

    /**
     * To get the data objects for the selected rows you can use the getSelectedData function.
     * <p>
     * This will return an array of the selected rows data objects in the order in which they were selected.
     */
    native public Any[] getSelectedData();


    //Get Selected Row Components

    /**
     * To get the RowComponent's for the selected rows at any time you can use the getSelectedRows function.
     * <p>
     * This will return an array of RowComponent's for the selected rows in the order in which they were selected.
     */
    native public RowComponent[] getSelectedRows();


    /**
     * With history enabled you can use the undo function to automatically undo a user action, the more times you call the function, the further up the history log you go.
     * If the keybindings module is installed, this action can also be triggered with the ctrl + z key combination.
     */
    native public void undo();

    /**
     * You can use the getHistoryUndoSize function to get a count of the number of history undo actions available.
     */
    native public int getHistoryUndoSize();

    /**
     * With history enabled you can use the redo function to automatically redo user action that has been undone, the more times you call the function, the further up the history log you go. once a user interacts with the table then can no longer redo any further actions until an undo is performed.
     */
    native public void redo();

    /**
     * You can use the getHistoryRedoSize function to get a count of the number of history redo actions available.
     */
    native public int getHistoryRedoSize();


    /**
     * If you want to handle column layout persistence manually, for example storing it in a database to use elsewhere, you can use the getColumnLayout function to retrieve a layout object for the current table.
     */
    native public Any getColumnLayout();

    /**
     * If you have previously used the getColumnLayout function to retrieve a tables layout, you can use the setColumnLayout function to apply it to a table.
     */
    native void setColumnLayout(Any columnLayout);


    // Trigger Copy Programmatically

    /**
     * Copy the currently selected rows to the clipboard - The copyToClipboard function allows you to copy the current table data to the clipboard.
     * <p>
     * The first argument is the copy selector, you can choose from any of the built in options ("selection","table","active") or pass a function in to the argument, that must return the selected row components.
     * <p>
     * If you leave this argument undefined, Tabulator will use the value of the clipboardCopySelector property, which has a default value of table.
     */

    native void copyToClipboard(ClipboardCopySelector copySelector);

    native void copyToClipboard(CallbackRet<RowComponent> copySelector);

//    /**
//     * You have a choice of four file types to choose from:
//     * <p>
//     * csv - Comma separated value file
//     * json - JSON formatted text file
//     * xlsx - Excel File (Requires the SheetJS Library)
//     * pdf - PDF File (Requires the jsPDF Library and jsPDF-AutoTable Plugin)
//     *
//     *
//     */

    /**
     *
     * @param fileType - "csv","json","xlsx","pdf" or "html". PDF requires the jsPDF Library and jsPDF-AutoTable Plugin. For "html: , By default the HTML output is a simple unstyled table. if you would like to match the current table styling you can set the style property to true in the options object.
     * @param fileName (Optional) second argument of the file name for the download (if this is left out it will be "Tabulator.ext".
     * @param config - (Optional) third argument is an object containing any setup options for the formatter, such as the delimiter choice for CSV's.
     * @param arg - (Optional) "active" - include the active (filtered) rows only in the download output (default). "all" - include all rows in the download output reguardless of whether they are filtered or not. "visible" - include only rows currently visible in the table viewport.
     * @param <C>
     */
    native <C> void download(String fileType, String fileName, C config, String arg);
    native <C> void download(String fileType, String fileName, C config);
    native  void download(String fileType, String fileName);
    native  void download(String fileType);

    /**
     * If you want to create a custom file type from the table data then you can pass a function to the type argument,
     * instead of a string value. At the end of this function you must call the setFileContents function, passing the formatted data and the mime type.
     */
//    native void download(CustomFileFormatter<?> customFileFormatter);
//
//    native void download(CustomFileFormatter<?> customFileFormatter, String fileNames);
    native <O> void download(CustomFileFormatter<O> customFileFormatter, String fileName, O options);

    /**
     * If you want to open the generated file in a new browser tab rather than downloading it straight away, you can use the downloadToTab function. This is particularly useful with the PDF downloader, as it allows you to preview the resulting PDF in a new browser tab
     */
    native void downloadToTab(String fileType);


    //CSV
    @JsOverlay
    final public void downloadCSV(String fileName, CSVDownloadConfig csvDownloadConfig) {
        download("csv", fileName, csvDownloadConfig);
    }

    @JsOverlay
    final public void downloadCSV(String fileName) {
        download("csv", fileName);
    }

    @JsOverlay
    final public void downloadCSV() {
        download("csv");
    }

    @JsOverlay
    final public void downloadToTabCSV() {
        downloadToTab("csv");
    }

    //XLSX - Excel
    @JsOverlay
    final public void downloadXLSX(String fileName, XLSXDownloadConfig xlsxDownloadConfig) {
        download("xlsx", fileName, xlsxDownloadConfig);
    }

    @JsOverlay
   final  public void downloadXLSX(String fileName) {
        download("xlsx", fileName);
    }

    @JsOverlay
    final public void downloadXLSX() {
        download("xlsx");
    }

    @JsOverlay
   final  public void downloadToTabXLSX() {
        downloadToTab("xlsx");
    }

    //PDF
    @JsOverlay
    final public void downloadPDF(String fileName, PDFDownloadConfig pdfDownloadConfig) {
        download("pdf", fileName, pdfDownloadConfig);
    }

    @JsOverlay
    final public void downloadPDF(String fileName) {
        download("pdf", fileName);
    }

    @JsOverlay
    final public void downloadPDF() {
        download("pdf");
    }

    @JsOverlay
    final public void downloadToTabPDF() {
        downloadToTab("pdf");
    }

    /**
     * Get Current Ajax URL.
     * <p>
     * <p>
     * Note: This function will return the url set on the ajaxURL property or the latest url set with the setData function, it will not include any pagination, filter or sorter parameters
     */
    native public String getAjaxUrl();


    /**
     * You can let the user choose a JSON file on their local machine to load data from by using the setDataFromLocalFile function.
     * It will present the user with a standard file open dialog where they can then choose the file to load into the table.
     * <p>
     * Data Format.
     * <p>
     * The data must be stored as a valid json string matching the the structure of an array of objects as defined in the Load Data from Array section.
     */
    native void setDataFromLocalFile();


    /**
     * Valid File Types.
     * <p>
     * By default Tabulator will only allow files with a .json extension to be loaded into the table.
     * <p>
     * You can allow any other type of file into the file picker by passing the extension or mime type into the first argument of the setDataFromLocalFile function as a comma separated list. This argument will accept any of the values valid for the accept field of an input element
     *
     * @param ext - the allowed file extension to showin the picker.
     */

    public native void setDataFromLocalFile(String ext);


    /**
     * Move column to a new position.
     *
     * @param columnToMove      the column you want to move.
     * @param targetColumn      the target column that you want to move to
     * @param placeBeforeTarget - A value of false will cause to the column to be placed after the target column, a value of true will result in the column being placed before the target.
     */
    public native void moeColumn(ColumnComponent.Lookup columnToMove, ColumnComponent.Lookup targetColumn, boolean placeBeforeTarget);

    /**
     * Block table redrawing
     */
    public native void blockRedraw();

    /**
     * Restore table redrawing.
     */
    public native void restoreRedraw();

    /**
     * Update the definition of a column with the updateColumnDefinition function. The first argument can be any any of the standard column component look up options. The second argument should be an object containing the properties of the column that you want to change.
     *
     * @param columnId
     * @param changedProperties
     * @return promise
     */
    public native Promise<ColumnComponent> updateColumnDefinition(String columnId, JsPropertyMap changedProperties);

    public native ColumnOptions[] getColumnDefinitions();

    public native ColumnComponent[] getColumns();

    /**
     * To get a structured array of Column Components that includes column groups, pass a value of true as an argument.
     * @param structured
     * @return an array . This will return an array of Column Components for the top level columns, whether they are columns or column groups. You can then use the getSubColumns and getParentColumn functions on each component to navigate through the column hierarchy.
     */
    public native ColumnComponent[] getColumns(boolean structured);

    /**
     *  Retrieve the Column Component using the field of the column.
     * @param id
     * @return column component
     */
    public native ColumnComponent getColumn(String id);

    /**
     *  Retrieve the Column Component using the DOM node of its header element.
     * @param headerElement
     * @return column component
     */
    public native ColumnComponent getColumn(Node headerElement);

    /**
     * Add a single column.
     *
     * @param columnDefinition - The column definition object for the column you want to add.
     * @param before - Determines how to position the new column. A value of true will insert the column to the left of existing columns, a value of false will insert it to the right. If a Position argument is supplied then this will determine whether the new colum is inserted before or after this column.
     * @param position - - The field to insert the new column next to, this can be any of the standard column component look up options.
     *
     * @return promise
     */
    public native Promise<ColumnComponent> addColumn(ColumnOptions columnDefinition, boolean before, ColumnComponent.Lookup position);
    public native Promise<ColumnComponent> addColumn(ColumnOptions columnDefinition);


    public native Promise<ColumnComponent> deleteColumn(ColumnComponent.Lookup lookup);

    /**
     * Tabulator keeps track of all tables that it creates, and you can use the findTable function on the Tabulator prototype
     * to lookup the table object for any existing table using the element they were created on.
     *
     * @param element - The findTable function will accept a valid CSS selector string or a DOM node for the table as its first argument.
     * @return - If no match is found it will return false, if one table is found it will return the Tabulator object for that table. If multiple tables are found it will return an array of all matching Tabulator objects.
     */
    native static public BooleanOr<Tabulator> findTable(StringOr<Node> element);


}
