package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.Callback1;
import com.peruncs.gwt.utils.Callback2;
import com.peruncs.gwt.utils.CallbackRet1;
import com.peruncs.gwt.utils.CallbackRet3;
import elemental2.core.JsMap;
import elemental2.core.JsObject;
import elemental2.dom.Node;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;


/**
 * Tabulator options.
 */
@JsType
public class TabulatorOptions {

    /**
     * See Table Layout documentation. Possible values:
     * "fitData"
     * "fitDataFill"
     * "fitColumns"
     */
    public String layout;
    /**
     * By default it is possible to manually resize columns by dragging the borders of the column in both the column headers and the cells of the column.
     * If you want to alter this behaviour you can use the resizableColumns to choose where the resize handles are available. It supports four possible options:
     * <p>
     * true - enable column resizing from both cells and headers
     * "header" - enable column resizing from headers only
     * "cell" - enable column resizing from cells only
     * false - disable column resizing
     */
    public StringOrBoolean resizableColumns;
    /**
     * Minimum column width in px
     */
    public int columnMinWidth = 40;

    /**
     * If you set the autoColumns option to true, every time data is loaded into the table through the data option or through the setData function, Tabulator will examine the first row of the data and build columns to match that data.
     */
    public boolean autoColumns;

    public CallbackRet1<String, ColumnTitleValue[]> responsiveLayoutCollapseFormatter;

    public boolean responsiveLayoutCollapseUseFormatters;

    public boolean responsiveLayoutCollapseStartOpen;

    public String formatter;

    boolean autoResize;

    boolean resizableRows;
    public boolean virtualDom = true;

    public boolean resizable;
    public Integer virtualDomBuffer;

    /**
     * You can use the placeholder option to display a message to your users when the table has no data set. The function can either take a string to display or, the HTML or DOM Node to display in the empty table
     */
    public StringOrNode placeholder;

    /**
     * The footer element that the tables uses for holding pagination elements etc, is automatically generated by Tabulator.
     * If you want to use your own element for any reason, for example you want to add additional elements to the footer, you can use the footerElement option to pass either a CSS selector, a DOM node, or the HTML for the contents of footer element into the table.
     */
    public StringOrNode footerElement;

    //Virtual DOM
    public StringOrInteger height;
    /**
     * Enable header tooltips
     */
    public HeaderTooltipUnion tooltipsHeader;
    /**
     * "remote" - enable remote pagination.
     * "local"  - enable local pagination.
     */
    public String pagination;


    public ColumnOptions[] columns;

    public boolean sortOrderReverse;

    /**
     * By default you can sort by multiple columns at the same time by holding the ctrl or shift key when you click on the column headers.
     * if you wish to disable this behaviour, so only once column can be sorted at a time, you can set the columnHeaderSortMulti option to false
     */
    public boolean columnHeaderSortMulti;

    /**
     * When the table is first created it can be defined with an initial set of sorters. These can be set using the initialSort option. This will take the same sorter array as the setSort function.
     */
    public SortOrder[] initialSort;

    /**
     * Send sort data to the server instead of processing locally.
     */
    public boolean ajaxSorting;

    /**
     * The dataSorting callback is triggered whenever a sort event occurs, before sorting happens.
     */
    public Callback1<Sorter[]> dataSorting;


    /**
     * The dataSorted callback is triggered after the table dataset is sorted.
     */
    public Callback2<Sorter[], RowComponent[]> dataSorted;


    /**
     * Tabulator also allows you to define a row level formatter using the rowFormatter option. this lets you alter each row of the table based on the data it contains.
     * The function accepts one argument, the RowComponent for the row being formatted.
     * The example below changes the background colour of a row to blue if the col value for that row is "blue".
     */

    public Callback1<RowComponent> rowFormatter;


    public TooltipUnion tooltips;

    /**
     * By default Tabulator regenerates tooltips whenever data in a cell changes, however if you use a tooltip generation function that is dependant on values outside the cell this may mean the tooltip does not update as expected.
     * To get round this, you can use the tooltipGenerationMode parameter to make tooltips regenerate whenever the users mouse enters the cell. The parameter can have one of two values
     * load - Generate tooltip when value is loaded into cell (default behaviour)
     * hover - Generate tooltip when users mouse enters the cell
     */
    public String tooltipGenerationMode;
    /**
     * optional parameter to request a certain number of rows per page
     */
    public int paginationSize = 5;

    //All Pagination
    /**
     * set url for ajax request
     */
    public String ajaxURL;
    /**
     * set any standard parameters to pass with the request
     */
    public Any ajaxParams;

    //Remote Pagination
    /**
     * By default a url will be generated using the provided ajaxURL and a number of system generated parameters:
     * <p>
     * page - the page number being requested
     * size - the number of rows to a page (if paginationSize is set)
     * sorters - the first current sorters(if any)
     * filter - an array of the current filters (if any)
     * <p>
     * If you need to change the names of any of these parameters to fit your existing system, you can use the paginationDataSent option to set alternative parameter names.
     */
    public JsMap<String, String> paginationDataSent;
    /**
     * If you need to change the names of any of these parameters to fit your
     * existing system, you can use the paginationDataReceived option to set
     * alternative parameter names.
     */
    public JsMap<String, String> paginationDataReceived;
    /**
     * build pagination controls in this element.
     * <p>
     * By default the pagination controls are added to the footer of the table. If you wish the controls to be created in another element pass a DOM node or a CSS selector for that element to the paginationElement option.
     */
    public Node paginationElement;
    /**
     * The number of pagination page buttons shown in the footer using the paginationButtonCount option. By default this has a value of 5
     */
    public int paginationButtonCount = 5;
    /**
     * Enable page size select element and generate list options.
     * <p>
     * If you would like the user to be able to set the number of rows on each page, you can use the paginationSizeSelector option, which will add a page size selection select element to the table footer.
     */
    public BooleanOrIntArray paginationSizeSelector;

    //Pagination Control Element
    /**
     * When using the addRow function on a paginated table, rows will be added relative to the current page (ie to the top or bottom of the current page), with overflowing rows being shifted onto the next page.
     * <p>
     * If you would prefer rows to be added relative to the table (firs/last page) then you can use the paginationAddRow option. it can take one of two values:
     * <p>
     * page - add rows relative to current page (default)
     * table - add rows relative to the table
     */
    public String paginationAddRow;
    public GroupByUnion groupBy;
    public GroupHeaderUnion groupHeader;
    public GroupStratOpenUnion groupStartOpen;

    //Grouping
    public JsObject[][] groupValues;
    /**
     * To keep the layout of the columns consistent, once the column widths have been set on the first data load (either from the data property in the constructor or the setData function) they will not be changed when new data is loaded.
     * If you would prefer that the column widths adjust to the data each time you load it into the table you can set the layoutColumnsOnNewData property to true.
     */
    boolean layoutColumnsOnNewData;
    /**
     * Responsive layout will automatically hide/show columns to fit the width of the Tabulator element. This allows for clean rendering of tables on smaller mobile devices, showing important data while avoiding horizontal scroll bars. You can enable responsive layouts using the responsiveLayout option.
     * There are two responsive layout modes available:
     * "hide" - hide columns that no longer fit in the table
     * "collapse" - collapse columns that no longer fit on the table into a list under the row
     * "collapse" - the values from hidden columns will be displayed in a title/value list under the row.
     * true - enable responsive layouts
     */
    StringOrBoolean responsiveLayout;
    /**
     * return request url.
     * <p>
     * url - the url from the ajaxURL property or setData function
     * config - the request config object from the ajaxConfig property
     * params - the params object from the ajaxParams property, this will also include any pagination, filter and sorting properties based on table setup
     */
    CallbackRet3<String, AjaxConfig, Any, String> ajaxURLGenerator;
}
