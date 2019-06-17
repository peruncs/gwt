package com.peruncs.gwt.tabulator;

import elemental2.dom.Element;
import elemental2.promise.Promise;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

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
    native public <T> Promise<T> setPage(StringOrInt p);

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


    //Grouping
    native public void setGroupBy(GroupByUnion groupByUnion);

    native public void setGroupStartOpen(GroupStratOpenUnion groupStratOpenUnion);

    native public GroupComponent[] getGroups();
}
