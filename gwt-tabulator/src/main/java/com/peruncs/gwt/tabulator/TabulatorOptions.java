package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.*;
import elemental2.core.JsMap;
import elemental2.core.JsObject;
import elemental2.dom.Element;
import elemental2.dom.MouseEvent;
import elemental2.dom.Node;
import elemental2.dom.TouchEvent;
import elemental2.promise.Promise;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;


/**
 * Tabulator options.
 */
@JsType
public class TabulatorOptions extends CellEvent {

    /**
     * Initial data.
     */
    public Any[] data;

    /**
     * hide the column headers and present the table as a simple list if needed.
     */
    public boolean headerVisible;


    /**
     * The output getHtml function will now contain column header groups, row groups, and column calculations.
     * <p>
     * You can choose to remove column headers groups and row groups in the output data by setting the values in the htmlOutputConfig option in the table definition:
     */
    public HtmlOutputConfig htmlOutputConfig;


    /**
     * Copy Tabulator styling to HTML table.
     * <p>
     * The HTML table will contain column header groups, row groups, and column calculations.
     * <p>
     * You can choose to remove any of these from the output data by setting the values in the printConfig option in the table definition.
     */
    public HtmlOutputConfig printConfig;


    /**
     * If you want your printed table to be styled to match your Tabulator you can set the printCopyStyle to true, this will copy key layout styling to the printed table.
     */
    public boolean printCopyStyle;


    /**
     * By deafault, only the rows currently visible in the Tabulator will be added to the HTML table, If you want to inclued all the active data (all currently filted/sorted rows)
     * in the table you can set the printVisibleRows option to false.
     * <p>
     * Render Time
     * Because generating a table containing a lot of rows takes a lot of time and consumes a lot of memory, it is not advised to show all rows in your table if there are more than 1000 rows.
     */
    public boolean printVisibleRows;


    /**
     * You can use the printHeader table setup option to define a header to be displayed when the table is printed.
     * <p>
     * This option can take one of three types of value:
     * <p>
     * string - you can pass an HTML string to be set as the contents header
     * DOM Node - you can pass DOM Node to be used as the header
     * function - a function that will be called when the table is printed, it should return either a string or DOM Node
     * The header contents will be placed inside a div with a class of tabulator-print-header to allow you to style your header with CSS
     * <p>
     * Print Header Placement
     * The print header will be inserted above the table on the printout, this will only occur on the first page of the print out, this should not be used as a page header.
     */
    public StringOrNodeOr<CallbackRet<StringOr<Node>>> printHeader;

    /**
     * You can use the printFooter table setup option to define a footer to be displayed when the table is printed.
     * <p>
     * This option can take one of three types of value:
     * <p>
     * string - you can pass an HTML string to be set as the contents footer
     * DOM Node - you can pass DOM Node to be used as the footer
     * function - a function that will be called when the table is printed, it should return either a string or DOM Node
     * The footer contents will be placed inside a div with a class of tabulator-print-footer to allow you to style your footer with CSS
     * <p>
     * Print Footer Placement
     * The print footer will be inserted below the table on the printout, this will only occur on the last page of the print out, this should not be used as a page footer.
     */
    public StringOrNodeOr<CallbackRet<StringOr<Node>>> printFooter;

    /**
     * The printFormatter table setup option allows you to carry out any manipulation of the print output before it is
     * displayed to the user for printing.
     * <p>
     * Callback arguments:
     * - tableHolderElement - The element that holds the header, footer and table elements
     * - tableElement - The table
     */
    public Callback2<Element /*tableHolderElement*/, Element /*tableElement */> printFormatter;

    /**
     * See Table Layout documentation. Possible values:
     * <p>
     * "fitData"
     * "fitDataFill"
     * "fitColumns"
     * "fitDataStrech"
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
    public BooleanOr<String> resizableColumns;
    /**
     * Minimum column width in px
     */
    public int columnMinWidth = 40;

    /**
     * If you set the autoColumns option to true, every time data is loaded into the table through the data option or through the setData function,
     * Tabulator will examine the first row of the data and build columns to match that data.
     */
    public boolean autoColumns;

    /**
     * The inbuilt collapse formatter creates a table to neatly display the hidden columns. If you would like to format the data in your own way you can use the responsiveLayoutCollapseFormatter, it takes an array of objects of the column titles and values as an argument and must return the HTML content of the div.
     * <p>
     * This function should return an empty string if there is no data to display.
     */


    public CallbackRet1<String, ColumnTitleValue[]> responsiveLayoutCollapseFormatter;


    /**
     * By default any formatter set on the column is applied to the value that will appear in the list. while this works for most formatters it can cause issues with the progress formatter which relies on being inside a cell.
     * <p>
     * If you would like to disable column formatting in the collapsed list, you can use the responsiveLayoutCollapseUseFormatters option
     */
    public boolean responsiveLayoutCollapseUseFormatters;

    /**
     * Collapsed lists are displayed to the user by default, if you would prefer they start closed so the user can open them you can use the responsiveLayoutCollapseStartOpen option
     */
    public boolean responsiveLayoutCollapseStartOpen;

    public String formatter;

    /**
     * Tabulator will automatically attempt to redraw the data contained in the table if the containing element for the table is resized. To disable this functionality, set the autoResize property to false.
     * <p>
     * Note: Tabulator uses the ResizeObserver JavaScript API to watch for resizing of the table, at present this is only available on the Chrome browser in versions 64 and above. In browsers without this functionality, Tabulator will fallback to using the window resize event which will only be able to detect changes on the window size, not on the table element itself.
     */
    boolean autoResize;

    /**
     * You can allow the user to manually resize rows by dragging the top or bottom border of a row. To enable this functionality, set the resizableRows property to true.
     */
    boolean resizableRows;

    /**
     * f you need to disable virtual rendering for any reason you can set the virtualDom option to false to force standard rendering.
     */
    public boolean virtualDom = true;

    public boolean resizable;

    public int virtualDomBuffer;

    /**
     * You can use the placeholder option to display a message to your users when the table has no data set. The function can either take a string to display or, the HTML or DOM Node to display in the empty table
     */
    public StringOr<Node> placeholder;

    /**
     * The footer element that the tables uses for holding pagination elements etc, is automatically generated by Tabulator.
     * If you want to use your own element for any reason, for example you want to add additional elements to the footer, you can use the footerElement option to pass either a CSS selector, a DOM node, or the HTML for the contents of footer element into the table.
     */
    public StringOr<Node> footerElement;

    //Virtual DOM
    public StringOr<Integer> height;
    /**
     * Enable header tooltips
     */
    public HeaderTooltip tooltipsHeader;
    /**
     * "remote" - enable remote pagination.
     * "local"  - enable local pagination.
     */
    public String pagination;

    /**
     * By default, Tabulator will load the first page of data when the table is initially loaded. You can use the paginationInitialPage option to specify that a specific page should be loaded when the table first loads.
     * This option can take any positive integer value (default = 1)
     */
    public int paginationInitialPage;


    /**
     * Column definitions
     */
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
     * Tabulator also allows you to define a row level formatter using the rowFormatter option. this lets you alter each row of the table based on the data it contains.
     * The function accepts one argument, the RowComponent for the row being formatted.
     */

    public Callback1<RowComponent> rowFormatter;


    public Tooltip tooltips;

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
    public JsPropertyMap<Object> ajaxParams;


    /**
     * By default Tabulator will make all ajax requests using the HTTP GET request method. If you need to use a different request method you can pass this into the ajaxConfig option
     */
    public AjaxConfig ajaxConfig;

    /**
     * Response processor.
     */
    public AjaxResponse ajaxResponse;

    /**
     * Aborting an Ajax Request.
     * <p>
     * The ajaxRequesting callback is called just before an AJAX request is made, if you want to abort the request for any reason you can return a value of false from the function
     */
    public Callback2RetBoolean<String /*url*/, JsPropertyMap<String> /*params*/> ajaxRequesting;

    /**
     * When using a request method other than "GET" Tabulator will send any parameters with a content type of form data. You can change the content type with the ajaxContentType option. This will ensure parameters are sent in the format you expect, with the correct headers.
     */

    public AjaxContentType ajaxContentType;

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
    public BooleanOr<Integer[]> paginationSizeSelector;

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

    /**
     * Rows can be grouped by a common field value by setting the groupBy option to the name of the field to be grouped
     */
    public GroupBy groupBy;

    /**
     * You can set the contents of the group headers with the groupHeader option. This should return the contents of the group header.
     */
    public GroupHeader groupHeader;

    /**
     * You can set the default open state of groups using the groupStartOpen property.
     */
    public GroupStartOpen groupStartOpen;

    /**
     * By default Tabulator allows users to toggle a group open or closed by clicking on the arrow icon in the left of the group header. If you would prefer a different behaviour you can use the groupToggleElement option to choose a different option:
     * <p>
     * The option can take one of three values:
     * <p>
     * "arrow" - togggle group on arrow element click
     * "header" - toggle group on click anywhere on the group header element
     * false - prevent clicking anywhere in the group toggling the group
     */
    public BooleanOr groupToggleElement;

    /**
     * By default Tabulator will create groups for rows based on the values contained in the row data. if you want to explicitly define which field values groups should be created for at each level, you can use the groupValues option.
     * <p>
     * This option takes an array of value arrays, each item in the first array should be a list of acceptable field values for groups at that level
     * <p>
     * Rows with values not in the arrays will not be show in the table. In this mode empty groups will remain visible in the table.
     * <p>
     * If you want to only specify groups for some of the levels, you can pass a value of false into the levels where you want Tabulator to decide on the grouping.
     */
    public Object[][] groupValues;
    /**
     * To keep the layout of the columns consistent, once the column widths have been set on the first data load (either from the data property in the constructor or the setData function) they will not be changed when new data is loaded.
     * If you would prefer that the column widths adjust to the data each time you load it into the table you can set the layoutColumnsOnNewData property to true.
     */
    public boolean layoutColumnsOnNewData;
    /**
     * Responsive layout will automatically hide/show columns to fit the width of the Tabulator element. This allows for clean rendering of tables on smaller mobile devices, showing important data while avoiding horizontal scroll bars. You can enable responsive layouts using the responsiveLayout option.
     * There are two responsive layout modes available:
     * "hide" - hide columns that no longer fit in the table
     * "collapse" - collapse columns that no longer fit on the table into a list under the row
     * "collapse" - the values from hidden columns will be displayed in a title/value list under the row.
     * true - enable responsive layouts
     */
    public BooleanOr<String> responsiveLayout;

    public AjaxURLGenerator ajaxURLGenerator;

    public CallbackRet<Promise<Any>> ajaxRequestFunc;


    /**
     * If you are loading a lot of data from a remote source into your table in one go, it can sometimes take a long time for the server to return the request, which can slow down the user experience.
     * <p>
     * To speed things up in this situation Tabulator has a progressive load mode, this uses the pagination module to make a series of requests for part of the data set, one at a time, appending it to the table as the data arrives. This mode can be enable using the ajaxProgressiveLoad option. No pagination controls will be visible on screen, it just reusues the functionality of the pagination module to sequentially load the data.
     * <p>
     * With this mode enabled, all of the settings outlined in the Ajax Documentation are still available
     * <p>
     * There are two different progressive loading modes, to give you a choice of how data is loaded into the table.
     * <p>
     * "load" - In load mode the table will sequentially add each page of data into the table untill all data is loaded.
     * <p>
     * "scroll" - In scroll mode Tabulator will initially load enough data into the table to fill the visible area of the table plus the scroll margin.
     * <p>
     * Whenever the user scrolls down vertically, if they are with the the scroll margin of the bottom of the table an ajax request will be triggered for the next page worth of data.
     */
    public String ajaxProgressiveLoad;


    /**
     * wait  milliseconds between each request.
     */
    public int ajaxProgressiveLoadDelay;

    /**
     * Trigger next ajax load when scroll bar is X pixels or less from the bottom of the table.
     * To ensure a good user experience, you should make sure you have a reasonably large scroll margin, to give your users room to scroll while the data is being loaded from the server.
     */
    public int ajaxProgressiveLoadScrollMargin;


    //Tree Structure and Nested Data

    /**
     * To enable data trees in your table, set the dataTree property to true in your table constructor:
     */
    public boolean dataTree;

    /**
     * By default Tabulator will look for child rows in the _children field of a row data object. You can change this to look in a different field using the dataTreeChildField property in your table constructor:
     */
    public String dataTreeChildField;


    /**
     * The toggle button that allows users to collapse and expand the column can be customised to meet your needs. There are two options, dataTreeExpandElement and dataTreeCollapseElement, that can be set to replace the default toggle elements with your own.
     * <p>
     * Both options can take either an html string representing the contents of the toggle element Or a DOM element representing the toggle.
     */

    public StringOrNodeOr<Boolean> dataTreeCollapseElement;

    public StringOrNodeOr<Boolean> dataTreeExpandElement;

    /**
     * By default the toggle element will be inserted into the first column on the table. If you want the toggle element to be inserted in a different column you can pass the feild name of the column to the dataTreeElementColumn setup option
     */
    public String dataTreeElementColumn;


    /**
     * The branch element can be turned off by setting the dataTreeBranchElement propety to false in the table constructor. Alternatively the branch element can be replaced with one of your choosing. As with the other tree elements this can be provided either as HTML or as a DOM element.
     */

    public StringOrNodeOr<Boolean> dataTreeBranchElement;

    /**
     * When a child row is displayed under its parent it is indented to make the distinction clearer. The size of the indent can be set by passing an integer representing the number of pixels for the indent to the dataTreeChildIndent property in the table constructor.
     */
    public int dataTreeChildIndent;

    /**
     * By default all nodes on the tree will start collapsed, you can customize the initial expansion state of the tree using the dataTreeStartExpanded option.
     * <p>
     * This option can take one of three possible value types, either a boolean to indicate whether all nodes should start expanded or collapsed:
     */
    public TreeStartExpandedUnion dataTreeStartExpanded;


    //Localization

    /**
     * You can either pass in a string matching one of the language options you have defined, or pass in the boolean true which will cause Tabulator to auto-detect the browsers language settings from the navigator.language object
     */
    public BooleanOr<String> locale;

    /**
     * You can store as many languages as you like, creating an object inside the langs object with a property of the locale code for that language. A list of locale codes can be found here.  if Tabulator cant find a match, it will try and find the next best thing
     */
    public Any langs;


    /**
     * By default any new rows will be added to the bottom of the table, to change this to the top set the addRowPos option to "top";
     */
    public String addRowPos;

    /**
     * When the table is first created it can be defined with an initial set of filters. These can be set using the initialFilter option. This will take the same filter array as the setFilter function.
     */
    public Filter[][] initialFilter;

    //Header filtering

    /**
     * When the table is first created it can be defined with an initial set of header filter values. These can be set using the initialHeaderFilter option. This will take an array of objects with the value for the filter and the column header it should be set on.
     */
    public HeaderFilter[] initialHeaderFilter;


    /**
     * The default placeholder text used for input elements can be set using the headerFilterPlaceholder option in the table definition
     */
    public String headerFilterPlaceholder;


    /**
     * If you would prefer to filter your data server side rather than in Tabulator, you can use the ajaxFiltering option to send the filter data to the server instead of processing it client side
     * An array of filters objects will then be passed in the filters parameter of the request, the name of this parameter can be set in the paginationDataSent option, in the pagination module.
     * <p>
     * The array of filter objects will take the same form as those returned from the getFilters function:
     * <p>
     * <p>
     * {@literal
     * [
     * {field:"age", type:">", value:52}, //filter by age greater than 52
     * {field:"height", type:"<", value:142}, //and by height less than 142
     * ]
     * }
     *
     * <p>
     * If a custom filter function is being used then the type parameter will have a value of "function".
     * If the table is not currently filtered then the array will be empty.
     */
    public boolean ajaxFiltering;


    /**
     * By default column calculations are shown at the top and bottom of the table, unless row grouping is enabled, in which case they are shown at the top and bottom of each group.
     * The columnCalcs option lets you decided where the calculations should be displayed, it can take one of four values:
     * true - show calcs at top and bottom of the table, unless grouped, then show in groups (boolean, default)
     * both - show calcs at top and bottom of the table and show in groups
     * table - show calcs at top and bottom of the table only
     * group - show calcs in groups only
     */
    public BooleanOr<String> columnCalcs;


    /**
     * By default Tabulator will hide column calculations in groups when the group is toggled closed. If you would like column calculations to display when a group is closed, set the groupClosedShowCalcs option to true.
     */
    public boolean groupClosedShowCalcs;

    /**
     * You can apply formatters (see Formatting Data for more information) to any calculation cells, using the topCalcFormatter and bottomCalcFormatter options in a columns definition object. you can also pass in additional parameters to the formatter functions using the topCalcFormatterParams and bottomCalcFormatterParams options:
     */
    public Formatter topCalcFormatter;
    public Formatter bottomCalcFormatter;
    public FormatterParams topCalcFormatterParams;
    public FormatterParams bottomCalcFormatterParams;


    /**
     * The default ScrollTo position can be set using the scrollToColumnPosition option. It can take one of three possible values:
     * <p>
     * left - position column with its left edge at the left of the table (default)
     * center - position column with its left edge in the center of the table
     * right - position column with its right edge at the right of the table
     */
    public String scrollToColumnPosition;

    /**
     * The default option for triggering a ScrollTo on a visible element can be set using the scrollToColumnIfVisible option. It can take a boolean value:
     * <p>
     * true - scroll to column, even if it is visible (default)
     * false - scroll to column, unless it is currently visible, then don't move
     */
    public boolean scrollToColumnIfVisible;


    /**
     * The default ScrollTo position can be set using the scrollToRowPosition option. It can take one of four possible values:
     * <p>
     * top - position row with its top edge at the top of the table (default)
     * center - position row with its top edge in the center of the table
     * bottom - position row with its bottom edge at the bottom of the table
     * nearest - position row on the edge of the table it is closest to
     */
    public String scrollToRowPosition;

    /**
     * The default option for triggering a ScrollTo on a visible element can be set using the scrollToRowIfVisible option. It can take a boolean value:
     * true - scroll to row, even if it is visible (default)
     * false - scroll to row, unless it is currently visible, then don't move
     */
    public boolean scrollToRowIfVisible;

    //Key Bindings


    /**
     * If you would prefer to use different key combinations then that is no problem, you can use the keybindings option to change any of the above bindings.
     * <p>
     * The keybindings option takes an object that should consist of properties with the name of the action you wish to bind and a value of the key code string.
     * <p>
     * The key code should consist of the keycodes for the keys to be pressed, separated by the + symbol. The exceptions to this are ctrl and shift which should be used to check that the ctrl or shift keys are pressed as well.
     * <p>
     * To disable any of the default keybindings, pass a value of false to is property in the keybindings option.
     * <p>
     * To disable all key bindings set the keybindings option to false.
     */
    public BooleanOr<JsPropertyMap<String>> keybindings;


    //Movable Rows and Columns

    /**
     * Enable user movable rows.
     */
    public boolean movableRows;

    /**
     * The rowMoved callback will be triggered when a row has been successfuly moved.
     */
    public Callback1<RowComponent> rowMoved;

    /**
     * Tabulator also allows you to move rows between tables. To enable this you should supply either a valid CSS selector string a DOM node for the table or the Tabuator object for the table to the movableRowsConnectedTables option. if you want to connect to multple tables then you can pass in an array of values to this option.
     */
    public StringOrNodeOr<Tabulator>[] movableRowsConnectedTables;

    /**
     * The movableRowsReceiver option should be set on the receiving tables, and sets the action that should be taken when the row is dropped into the table.
     */
    public MovableRowsReceiver movableRowsReceiver;


    /**
     * The movableRowsSender option should be set on the sending table, and sets the action that should be taken after the row has been successfuly dropped into the receiving table.
     * There are several inbuilt sender functions:
     * <p>
     * false - do nothing(default).
     * "delete" - deletes the row from the table.
     * <p>
     * You can also pass a callback to the movableRowsSender option for custom sender functionality.
     */
    public MovableRowsSender movableRowsSender;


    /**
     * To allow the user to move columns along the table, set the movableColumns parameter in the options.
     */
    public boolean movableColumns;


    //Row Selection

    /**
     * To enable row selection, set the selectable option to true
     * <p>
     * The selectable option can take one of a several values:
     * <p>
     * false - selectable rows are disabled
     * true - selectable rows are enabled, and you can select as many as you want
     * integer - any integer value, this sets the maximum number of rows that can be selected (when the maximum number of selected rows is exeded, the first selected row will be deselected to allow the next row to be selected).
     * "highlight" (default) - rows have the same hover stylings as selectable rows but do not change state when clicked. This is great for when you want to show that a row is clickable but don't want it to be selectable.
     * <p>
     * Note: using the setData function will clear the currently selected rows.
     */
    public Selectable selectable;

    //Range Selection
    /**
     * By default you can select a range of rows by holding down the shift key and click dragging over a number of rows to toggle the selected state state of all rows the cursor passes over.
     * <p>
     * If you would prefere to select a range of row by clicking on the first row then holding down shift and clicking on the end row then you can acheive this by setting the selectableRangeMode to click
     * In this mode, in order to select multiple non-continuous rows, you need to hold down the ctrl key and click on each row in turn.
     */
    public String selectableRangeMode;

    //Rolling Selection
    /**
     * By default, row selection works on a rolling basis,
     * if you set the selectable option to a numeric value then
     * when you select past this number of rows, the first row
     * to be selected will be deselected. If you want to disable
     * this behaviour and instead prevent selection of new rows
     * once the limit is reached you can set the selectableRollingSelection option to false.
     */
    public boolean selectableRollingSelection;


    //Persistent Selection

    /**
     * By default Tabulator will maintain selected rows when the table is filtered, sorted or paginated (but NOT when the setData function is used). If you want the selected rows to be cleared whenever the table view is updated then set the selectablePersistence option to false.
     */
    public boolean selectablePersistence;


    //Selection Eligibility

    public Callback1RetBoolean<RowComponent> selectableCheck;

    //Interaction History
    /**
     * To enable the history functionality, set the history option to true, in the table constructor object.
     * <p>
     * The history module tracks the following actions:
     * <p>
     * Cell Edits
     * Row Added
     * Row Deleted
     * Row Moved
     */
    public boolean history;

    //Persistence Mode

    /**
     * Persistence information can either be stored in a cookie or in the localSotrage object, you can use the persistenceMode to choose which. It can take three possible values:
     * <p>
     * local - (string) Store the persistence information in the localStorage object
     * cookie - (string) Store the persistence information in a cookie
     * true - (boolean) check if localStorage is available and store persistence information, otherwise store in cookie (Default option)
     */
    public BooleanOr<String> persistenceMode;


    /**
     * Persistence ID - id string, can only be numbers, letters, hyphens and underscores.
     * <p>
     * ou are planning on having multiple tables on the same page using persistence then Tabulator needs a way to uniquely identify each table. There are two ways to do this either set the id attribute on the element that will hold the table, Tabulator will automatically use this id as a reference for the persistence id.
     *
     * <div id="example-table"></div>
     * <p>
     * Alternatively if you do not want to give an id to the table holding element you can set the tabulator options parameter persistenceID to a unique persistence id for that table.
     */
    public String persistenceID;

    /**
     * Persitence configuration.
     */
    public BooleanOr<Persitence> persitence;


    /**
     * A custom persistence reader.
     */
    public Persitence.ReaderFunc persistenceReaderFunc;

    /**
     * A custom persitence writer.
     */
    public Persitence.WriterFunc persistenceWriterFunc;

    //Clipboard
    /**
     * Enable clipboard functionality - You can enable clipboard functionality using the clipboard config option. It can take one of four possible values:
     * <p>
     * true - enable clipboard copy and paste
     * "copy" - enable only copy functionality
     * "paste" - enable only paste functionality
     * false - disable all clipboard functionality (default)
     */
    public BooleanOr<String> clipboard;


    /**
     * Default copy selector
     */
    public ClipboardCopySelector clipboardCopySelector;

    /**
     * Default copy configuration.
     */
    public ClipboardCopyConfig clipboardCopyConfig;

    /**
     * By default Tabulator will include the column header titles in any clipboard data, this can be turned off by passing a value of false to the clipboardCopyHeader property:
     */
    public boolean clipboardCopyHeader;

    /**
     * Default clipboard copy formatter
     */
    public ClipboardCopyFormatter clipboardCopyFormatter;

    /**
     * Copy Style.
     * By default Tabulator will copy some of the tables styling along with the data to give a better visual appearance when pasted into other documents.
     * <p>
     * If you want to only copy the unstyled data then you should set the clipboardCopyStyled option to false in the table options object:
     */
    public boolean clipboardCopyStyled;


    /**
     * Custom paste parser.
     * <p>
     * Tabulator has one built in paste parser, that is designed to take a table formatted text string from the clipboard and turn it into row data. it breaks the tada into rows on a newline character \n and breaks the rows down to columns on a tab character \t.
     * <p>
     * It will then attempt to work out which columns in the data correspond to columns in the table. It tries three different ways to achieve this. First it checks the values of all columns in the first row of data to see if they match the titles of columns in the table. If any of the columns don't match it then tries the same approach but with the column fields. If either of those options match, Tabulator will map those columns to the incoming data and import it into rows. If there is no match then Tabulator will assume the columns in the data are in the same order as the visible columns in the table and import them that way.
     * <p>
     * The inbuilt parser will reject any clipboard data that does not contain at least one row and two columns, in that case the clipboardPasteError will be triggered.
     * <p>
     * You can also pass a custom parser function into the clipboardPasteParser property, it should take one argument of the string of clipboard data and return an array of row data objects that will be passed to the paste action. If the clipboard data isn't valid it should return false.
     */
    public CallbackRet1<BooleanOr<JsObject[]>, String> clipboardPasteParser;

    public ClipboardPasteAction clipboardPasteAction;

    /**
     * By default Tabulator includes column headers, row groups and column calculations in the download output.
     * <p>
     * You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the downloadConfig option in the table definition.
     * <p>
     * Availabilitity.
     * Not all downloaders support column header groups, row groups and column calculations, see the documentation for each downloader for full information.
     */
    public DownloadConfig downloadConfig;

    //Callback

    /**
     * Table Building
     * <p>
     * When a the tabulator constructor is called, the tableBuilding callback will triggered
     */
    public Callback tableBuilding;

    /**
     * Table Built
     * When a the tabulator constructor is called and the table has finished being rendered, the tableBuilt callback will triggered
     */
    public Callback tableBuilt;

    /**
     * Row Click.
     * <p>
     * The rowClick callback is triggered when a user clicks on a row.
     */
    public Callback2<MouseEvent, RowComponent> rowClick;


    /**
     * Row Double Click.
     * <p>
     * The rowDblClick callback is triggered when a user double clicks on a row.
     */
    public Callback2<MouseEvent, RowComponent> rowDblClick;


    /**
     * Row Context Menu.
     * <p>
     * The rowContext callback is triggered when a user right clicks on a row.
     * <p>
     * If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback.
     */
    public Callback2<MouseEvent, RowComponent> rowContext;


    /**
     * Row Tap.
     * <p>
     * The rowTap callback is triggered when a user taps on a row on a touch display.
     */
    public Callback2<TouchEvent, RowComponent> rowTap;

    /**
     * Row Double Tap
     * <p>
     * The rowDblTap callback is triggered when a user taps on a row on a touch display twice in under 300ms.
     */
    public Callback2<TouchEvent, RowComponent> rowDblTap;

    /**
     * Row Tap Hold
     * <p>
     * The rowTapHold callback is triggered when a user taps on a row on a touch display and holds their finger down for over 1 second.
     */
    public Callback2<TouchEvent, RowComponent> rowTapHold;

    /**
     * Row Mouse Enter.
     * <p>
     * The rowMouseEnter callback is triggered when the mouse pointer enters a row
     */
    public Callback2<MouseEvent, RowComponent> rowMouseEnter;

    /**
     * Row Mouse Leave.
     * <p>
     * The rowMouseLeave callback is triggered when the mouse pointer leaves a row.
     */
    public Callback2<MouseEvent, RowComponent> rowMouseLeave;

    /**
     * Row Mouse Over.
     * <p>
     * The rowMouseOver callback is triggered when the mouse pointer enters a row or any of its child elements.
     */
    public Callback2<MouseEvent, RowComponent> rowMouseOver;

    /**
     * Row Mouse Out.
     * <p>
     * The rowMouseOut callback is triggered when the mouse pointer leaves a row or any of its child elements
     */
    public Callback2<MouseEvent, RowComponent> rowMouseOut;

    /**
     * Row Mouse Move.
     * <p>
     * The rowMouseMove callback is triggered when the mouse pointer moves over a row.
     */
    public Callback2<MouseEvent, RowComponent> rowMouseMove;

    /**
     * Row Added
     * <p>
     * The rowAdded callback is triggered when a row is added to the table by the addRow and updateOrAddRow functions.
     */
    public Callback1<RowComponent> rowAdded;

    /**
     * Row Updated.
     * <p>
     * The rowUpdated callback is triggered when a row is updated by the updateRow, updateOrAddRow, updateData or updateOrAddData, functions.
     */
    public Callback1<RowComponent> rowUpdated;

    /**
     * Row Deleted.
     * <p>
     * The rowDeleted callback is triggered when a row is deleted from the table by the deleteRow function.
     */
    public Callback1<RowComponent> rowDeleted;

    /**
     * Row Resized.
     * <p>
     * The rowResized callback will be triggered when a row has been resized by the user.
     */
    public Callback1<RowComponent> rowResized;

    //Data Callbacks

    /**
     * Data Loading.
     * <p>
     * The dataLoading callback is triggered whenever new data is loaded into the table.
     */
    public Callback1<Any> dataLoading;

    /**
     * Data Loaded.
     * <p>
     * The dataLoaded callback is triggered when a new set of data is loaded into the table.
     */
    public Callback1<Any> dataLoaded;

    /**
     * Data Edited.
     * <p>
     * The dataEdited callback is triggered whenever the table data is changed by the user. Triggers for this include editing any cell in the table, adding a row and deleting a row.
     */
    public Callback1<Any> dataEdited;

    /**
     * HTML Importing.
     * <p>
     * The htmlImporting callback is triggered when Tabulator starts importing data from an HTML table.
     */
    public Callback htmlImporting;


    //Ajax Callbacks


    /**
     * Ajax Error.
     * <p>
     * xhr - the XHR object
     * textStatus - error type
     * errorThrown - text portion of the HTTP status
     * <p>
     * The ajaxError callback is triggered there is an error response to an ajax request.
     */


    public Callback1RetBoolean<JsObject/*response*/> ajaxError;

    //Filter Callbacks

    /**
     * Data Filtering.
     * <p>
     * filters - array of filters currently applied.
     * <p>
     * The dataFiltering callback is triggered whenever a filter event occurs, before the filter happens.
     */
    Callback1<Filter[]> dataFiltering;


    /**
     * Data Filtered.
     * <p>
     * filters - array of filters currently applied
     * rows - array of row components that pass the filters
     * <p>
     * The dataFiltered callback is triggered after the table dataset is filtered.
     */
    public Callback2<Filter[], RowComponent[]> dataFiltered;

    //Sorting Callbacks

    /**
     * Data Sorting
     * sorters - an array of the sorters currently applied
     * The dataSorting callback is triggered whenever a sort event occurs, before sorting happens.
     */
    public Callback1<Sorter[]> dataSorting;

    /**
     * Data Sorted
     * <p>
     * sorters - array of the sorters currently applied
     * rows - array of row components in their new order
     * <p>
     * The dataSorted callback is triggered after the table dataset is sorted.
     */
    public Callback2<Sorter[], RowComponent[]> dataSorted;


    // Layout Callbacks

    /**
     * Render Started
     * <p>
     * The renderStarted callback is triggered whenever all the rows in the table are about to be rendered. This can include:
     * <p>
     * - Data is loaded into the table when setData is called
     * - A page is loaded through any form of pagination
     * - Rows are added to the table during progressive rendering
     * - Columns are changed by setColumns
     * - The data is filtered
     * - The data is sorted
     * - The redraw function is called
     */
    public Callback renderStarted;

    /**
     * Render Complete.
     * <p>
     * The renderComplete callback is triggered after the table has been rendered.
     */
    public Callback renderComplete;


    //Pagination Callbacks

    public PaginationCallback pageLoaded;

    //Localization
    /**
     * Table Localized.
     * <p>
     * locale - a string representing the current locale
     * lang - the language object for the current locale
     * <p>
     * When a localization event has occurred , the localized callback will triggered, passing the current locale code and language object.
     */
    public Callback2<String /*locale*/, JsObject /*lang*/> localized;

    //Group Callbacks

    /**
     * Data Grouping.
     * <p>
     * The dataGrouping callback is triggered whenever a data grouping event occurs, before grouping happens.
     */


    public Callback dataGrouping;

    /**
     * Data Grouped.
     * <p>
     * groups - array of top level group components
     * <p>
     * The dataGrouped callback is triggered whenever a data grouping event occurs, after grouping happens.
     */
    public Callback1<GroupComponent[]> dataGrouped;

    public GroupedVisibilityChangedCallback groupVisibilityChanged;

    /**
     * Group Click is triggered when a user clicks on a group header.
     */
    public Callback2<MouseEvent, GroupComponent> groupClick;

    /**
     * Group double-click is triggered when a user double clicks on a group header.
     */
    public Callback2<MouseEvent, GroupComponent> groupDblClick;


    /**
     * The groupContext callback is triggered when a user right clicks on a group header.
     * If you want to prevent the browsers context menu being triggered in this event you will need to include the e.preventDefault() function in your callback.
     */
    public Callback2<MouseEvent, GroupComponent> groupContext;

    /**
     * Group tap is triggered when a user taps on a group header on a touch display.
     */
    public Callback2<TouchEvent, GroupComponent> groupTap;

    /**
     * Group double-tap is triggered when a user taps on a group header on a touch display twice in under 300ms.
     */
    public Callback2<TouchEvent, GroupComponent> groupDblTap;

    /**
     * Group tap hold is triggered when a user taps on a group header on a touch display and holds their finger down for over 1 second.
     */
    public Callback2<TouchEvent, GroupComponent> groupTapHold;


    // Selection Callbacks

    /**
     * Row Selected.
     * <p>
     * row - row component for the selected row
     * <p>
     * The rowSelected event is triggered when a row is selected, either by the user or programatically.
     */
    public Callback1<RowComponent> rowSelected;

    /**
     * Row deselected is triggered when a row is deselected, either by the user or programatically.
     */
    public Callback1<RowComponent> rowDeselected;

    /**
     * Row Selection Changed.
     * <p>
     * rows - array of row components for the selected rows in order of selection
     * data - array of data objects for the selected rows in order of selection
     * <p>
     * Whenever the number of selected rows changes, through selection or deselection, the rowSelectionChanged event is triggered. This passes an array of the data objects for each row in the order they were selected as the first argument, and an array of row components for each of the rows in order of selection as the second argument.
     */
    public Callback2<RowComponent[], JsObject[]> rowSelectionChanged;


    // Row Movement Callbacks
    /**
     * Sending Start.
     * <p>
     * toTables - array of receiving table elements
     * <p>
     * The movableRowsSendingStart callback is triggered on the sending table when a row is picked up from a sending table.
     */
    public Callback1<Tabulator[]> movableRowsSendingStart;


    /**
     * Row Sent.
     * <p>
     * fromRow - the row component from the sending table
     * toRow - the row component from the receiving table (if available)
     * toTable - the Tabulator object for the receiving table
     * <p>
     * The movableRowsSent callback is triggered on the sending table when a row has been successfuly received by a receiving table.
     */
    public Callback3<RowComponent /*fromRow*/, RowComponent/*toRow*/, Tabulator/*toTable*/> movableRowsSent;


    /**
     * Row Sent Failed.
     * <p>
     * fromRow - the row component from the sending table
     * toRow - the row component from the receiving table (if available)
     * toTable - the Tabulator object for the receiving table
     * <p>
     * The movableRowsSentFailed callback is triggered on the sending table when a row has failed to be received by the receiving table.
     */
    public Callback3<RowComponent, RowComponent, Tabulator> movableRowsSentFailed;

    /**
     * Sending Stop
     * <p>
     * toTables - array of receiving table elements
     * <p>
     * The movableRowsSendingStop callback is triggered on the sending table after a row has been dropped and any senders and receivers have been handled.
     */
    public Callback1<Tabulator[]> movableRowsSendingStop;

    /**
     * Receiving Start.
     * fromRow - the row component from the sending table
     * fromTable - the Tabulator object for the sending table
     * The movableRowsReceivingStart callback is triggered on a receiving table when a connection is established with a sending table.
     */
    public Callback2<RowComponent, Tabulator> movableRowsReceivingStart;

    /**
     * Row Received.
     * <p>
     * fromRow - the row component from the sending table
     * toRow - the row component from the receiving table (if available)
     * fromTable - the Tabulator object for the sending table
     * <p>
     * The movableRowsReceived callback is triggered on a receiving table when a row has been successfuly received.
     */
    public Callback3<RowComponent, RowComponent, Tabulator> movableRowsReceived;


    /**
     * Row Received Failed
     * <p>
     * fromRow - the row component from the sending table
     * toRow - the row component from the receiving table (if available)
     * fromTable - the Tabulator object for the sending table
     * <p>
     * The movableRowsReceivedFailed callback is triggered on a receiving table when a row receiver has returned false.
     */
    public Callback3<RowComponent, RowComponent, Tabulator> movableRowsReceivedFailed;

    /**
     * Receiving Stop.
     * <p>
     * fromTable - the Tabulator object for the sending table
     * <p>
     * The movableRowsReceivingStop callback is triggered on a receiving table after a row has been dropped and any senders and receivers have been handled.
     */
    public Callback1<Tabulator> movableRowsReceivingStop;

    //Validation Callbacks

    /**
     * Validation Failed.
     * <p>
     * cell - cell component for the edited cell
     * value - the value that failed validation
     * validators - an array of validator objects that failed
     * <p>
     * The validationFailed event is triggered when the value entered into a cell during an edit fails to pass validation.
     */
    public Callback3<CellComponent /*cell*/, JsObject/*value*/, Validator[]/*validators*/> validationFailed;

    //History Callbacks

    /**
     * Undo Occurred.
     * <p>
     * action - the action that has been undone, "cellEdit", "rowAdd", "rowDelete", "rowMoved".
     * component - the Component object affected by the action (could be a row or cell component)
     * data - the data being changed
     * <p>
     * The historyUndo event is triggered when the undo action is triggered.
     */
    public Callback3<String /*action*/, BaseComponent /*component*/, Any /*data*/> historyUndo;

    public Callback3<String, BaseComponent, Any> historyRedo;

    //Clipboard Callbacks

    /**
     * Data Copied to Clipboard.
     * <p>
     * clipboard - the string that has been copied into the clipboard.
     * <p>
     * The clipboardCopied event is triggered whenever data is copied to the clipboard.
     */
    public Callback1<String> clipboardCopied;

    /**
     * Data Pasted into Table.
     * <p>
     * clipboard - the clipboard string
     * rowData - the row data from the paste parser
     * rows - the row components from the paste action (this will be empty if the "replace" action is used)
     * <p>
     * The clipboardPasted event is triggered whenever data is successfuly pasted into the table.
     */
    public Callback3<String, Any, RowComponent[]> clipboardPasted;

    /**
     * Data Paste into Table Failed.
     * <p>
     * clipboard - the string that has been copied into the clipboard.
     * <p>
     * The clipboardPasteError event is triggered whenever an attempt to paste data into the table has failed because it was rejected by the paste parser.
     */
    public Callback1<String> clipboardPasteError;


    //Download Callbacks

    /**
     * Mutate Data Before Download.
     * <p>
     * If you want to make any changes to the table data before it is parsed into the download file,
     * you can pass a mutator function to the downloadDataFormatter callback.
     */
    public CallbackRet1<Any, Any> downloadDataFormatter;

    public DownloadReadyCallback downloadReady;

    /**
     * Download Complete.
     * <p>
     * The downloadComplete callback is triggered when the user has been prompted to download the file.
     */
    public Callback downloadComplete;

    //Data Tree Callbacks

    /**
     * Row Expanded.
     * The dataTreeRowExpanded callback is triggered when a row with child rows is expanded to reveal the children.
     */
    public DataTreeCallback dataTreeRowExpanded;


    /**
     * Row Collapsed.
     * The dataTreeRowCollapsed callback is triggered when a row with child rows is collapsed to hide its children.
     */
    public DataTreeCallback dataTreeRowCollapsed;

    //Printing

    /**
     * Enable html table printing.
     * <p>
     * By Default when a page is printed that includes a Tabulator it will be rendered on the page exactly as the table is drawn.
     * While this ise useful in most cases, some users prefer tohave more controll over the print output, for example showing all
     * rows of the table, instead of just those visible with the current position of the scroll bar.
     * <p>
     * Tabulator provides a print styling mode that will replace the Tabulator with an HTML table for the printout giving you much
     * more control over the look and feel of the table for the print out., to enable this mode, set the printAsHtml option to true in the table constructor.
     * This will replace the table (in print outs only) with a simple HTML table with the class tabulator-print-table that you can use to style the table in any way you like.
     * <p>
     * It also has the benifit that because it is an HTML table, if it corsses a page break your browser will uatomatically add the column
     * headers in at the top of the next page.
     */
    public boolean printAsHtml;


    /**
     * Applies to all columns.
     * By default all columns in a table are sortable by clicking on the column header, if you want to disable this behaviour, set the headerSort property to false.
     */
    boolean headerSort;


    /**
     * Applies to all columns.
     * By default once you click on a header to sort it the header will then toggle between sorting in ascending and descending order.
     * If you would prefer a third option of returing the column to its original unsorted order, the you can set the headerSortTristate option to true in the column definition. The sort will the toggle beween the original order, ascending and descending order
     */
    public boolean headerSortTristate;


    /**
     * Disable console warnings for invalid table properties in the constructor and column definition objects.
     */
    public boolean invalidOptionWarnings;

}
