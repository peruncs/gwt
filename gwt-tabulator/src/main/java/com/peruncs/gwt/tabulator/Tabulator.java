package com.peruncs.gwt.tabulator;

import elemental2.dom.Element;
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
     * @param name
     */
    native public void showColumn(String name);

    /**
     * You can hide a visible column at any point using the hideColumn function. Pass the field name of the column you wish to hide as the first parameter of the function.
     * @param name
     */
    native public void hideColumn(String name);


    /**
     * You can toggle the visibility of a column at any point using the toggleColumn function. Pass the field name of the column you wish to toggle as the first parameter of the function.
     */
    native public void toggleColumn(String name);


    /** Define sort order */
    native public void setSort(SortOrder[] sortOrder);
    native public void setSort(String column, String dir);
    native public Sorter getSorters();

    /** To remove all sorting from the table.*/
    native public void clearSort();


}
