package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import elemental2.dom.MouseEvent;
import elemental2.dom.TouchEvent;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;

@JsType
public class ColumnOptions extends CellEvent {


    /**
     * Column groups
     */
    public ColumnOptions[] columns;


    /**
     * Initial data.
     */
    public Any[] data;

    /**
     * Required. This is the title that will be displayed in the header for this column
     */
    public String title;

    /**
     * Required (not required in icon/button columns) this is the key for this column in the data array
     */
    public String field;

    /**
     * determines if the column is visible.
     */
    boolean visible = true;

    /**
     * Sets the width of this column, this can be set in pixels or as a percentage of total table width (if not set the system will determine the best)
     */
    public StringOr<Integer> width;

    /**
     * sets the minimum width of this column, this should be set in pixels (this takes priority over the global option of columnMinWidth)
     */
    public int minWidth;

    /**
     * when using fitColumns layout mode, determines how much the column should grow to fill available space
     */
    public int widthGrow = 1;

    /**
     * when using fitColumns layout mode, determines how much the column should shrink to fit available space
     */
    public int widthShrink = 0;

    /**
     * set whether column can be resized by user dragging its edges.
     */
    public boolean resizable;

    /**
     * Freezes the column in place when scrolling. Frozen columns are locked in place and cannot be reordered by dragging and dropping the column header. It is also not possible to freeze a column that is part of a column group. At lease one column must not be frozen for the table to render correctly. If you want to freeze all your columns then you will achieve the same effect by not freezing any
     */
    public boolean frozen;

    /**
     * An integer to determine when the column should be hidden in responsive mode .When responsive layout is enabled, all columns are given a default responsive value of 1. The higher you set this value the sooner that column will be hidden as the table width decreases. If two columns have the same responsive value then they are hidden from right to left (as defined in the column definition array, ignoring user moving of the columns). If you set the value to 0 then the column will never be hidden regardless of how narrow the table gets
     */
    public int responsive;


    /**
     * css classes on header and cells in this column. (value should be a string containing space separated class names)
     */
    public String cssClass;

    /**
     * Sets the column as a row handle, allowing it to be used to drag movable rows. If you would prefer the user only be able to move a column around by one particular cell, the you can set the rowHandle property to true in the column definition object for that column to restrict the trigger for row movement to that cell only.
     */
    public boolean rowHandle;

    /**
     * When the getHtml function is called, hide the column from the output
     */
    public boolean hideInHtml;

    /**
     * If you don't want to show a particular column in the HTML output you can set the htmlOutput property in its column definition object to false.
     * You can also force a hidden column to be visibile in the HTML output by setting the htmlOutput property in its column definition object to true.
     */
    public boolean htmlOutput;

    public SorterType sorter;

    /**
     * Additional parameters you can pass to the sorter.
     */
    public SorterTypeParams sorterParams;

    /**
     * By default all columns in a table are sortable by clicking on the column header, if you want to disable this behaviour, set the headerSort property to false.
     */
    boolean headerSort;

    /**
     * By default Tabulator will sort a column in ascending order when a user first clicks on the column header.
     * The headerSortStartingDir property in the column definition can be used to set the starting sort direction when a user clicks on an unsorted column, it can either be set to "asc" or "desc".
     */
    public String headerSortStartingDir;

    /**
     * By default once you click on a header to sort it the header will then toggle between sorting in ascending and descending order.
     * If you would prefer a third option of returing the column to its original unsorted order, the you can set the headerSortTristate option to true in the column definition. The sort will the toggle beween the original order, ascending and descending order
     */
    public boolean headerSortTristate;


    /**
     * Additional parameters you can pass to the formatter.
     */
    public FormatterParams formatterParams;

    /**
     * By default formatters will keep their contents within the height of the current row, hiding any overflow. The only exception to this is the textarea formatter which will automatically vary its height when the column is resized so its contents does not overflow.
     * If you would like this functionally to appear in another type of formatter you can set the variableHeight property to true in the column definition and it will will behave in a similar way to the textarea formatter
     */
    public boolean variableHeight;

    /**
     * Determines how to format data in this column.
     * Possible values:
     * - "plaintext" - is the default formatter for all cells and will simply dispay the value of the cell as text.
     * - "textarea" - shows text with carriage returns intact (great for multiline text), this formatter will also adjust the height of rows to fit the cells contents when columns are resized.
     * - "html"  - displays un-sanitized html. Dangerous!
     * - "money" -  formats a number into currency notation. has optional properties for the formatterParams, see FormatterParamsMoney.
     * - "image" - creates an img element with the src set as the value. (triggers the normalizeHeight function on the row on image load). The formatter has optional properties for the formatterParams object, see FormatterParamsImage.
     * - "link -  renders data as an anchor with a link to the given value (by default the value will be used as both the url and the label of the tag). has optional properties for the formatterParams object, see FormatterParamsLink.
     * - "datetime" - transforms on format of date or time into another. You will need to include the moment.js library to use this. has optional properties for the formatterParams object, see FormatterParamsDateTime.
     * - "datetimediff" -  show difference between two datetimes. You will need to include the moment.js library to use this. has optional properties for the formatterParams object, see FormatterParamsDateTimeDiff.
     * - "tickCross" -  displays a green tick if the value is (true|'true'|'True'|1) and a red cross if not. has optional properties for the formatterParams object, see FormatterParamsTickCross.
     * - "color" - sets the background colour of the cell to the value. The cell's value can be any valid CSS color eg. #ff0000, #f00, rgb(255,0,0), red, rgba(255,0,0,0), hsl(0, 100%, 50%).
     * - "star" displays a graphical star rating based on integer values. has optional properties for the formatterParams object, see FormatterParamsStar.
     * - "traffic" - displays a coloured circle that changes colour depending on the numeric value of the cell. No image will be displayed if the cells value is undefined or not a valid number. has optional properties for the formatterParams object, see FormatterParamsTraffic.
     * - "progress" - displays a progress bar that fills the cell from left to right, using values 0-100 as a percentage of width. has optional properties for the formatterParams object, see FormatterParamsProgress.
     * - "lookup" -looks up the value to display from a object passed into the formatterParams property, if not present it displays the current cell value. To use this formatter you need to pass an object to formatterParams where the initial value of the cell is the property key and the value to be displayed is the property value (eg {"blue":"black", "red":"green"}, would change the value "blue" to "black", and the value "red" to green)
     * - "buttonTick" - displays a tick icon on each row (for use as a button).
     * - "buttonCross" - displays a cross icon on each row (for use as a button).
     * - "rownum" - shows an incrementing row number for each row as it is displayed.
     * - "handle" - fills the cell with hamburger bars, to be used as a row handle.
     */
    public Formatter formatter;

    public Formatter TitleFormatter;

    public FormatterParams TitleFormatterParams;

    /**
     * The tooltip parameter can take three different types of value:
     * <p>
     * boolean - a value of false disables the tooltip, a value of true sets the tooltip of the cell to its value
     * string - a string that will be displayed for all cells in the matching column/table.
     * function - a callback function that returns the string for the cell. see below:
     * The function accepts one argument, the CellComponent for the cell the tooltip is being generated for.
     */
    public Tooltip tooltip;

    /**
     * setting a headerTooltip value on a column will override the global setting
     */
    public HeaderTooltip headerTooltip;

    // Mutators
    //      Mutators are used to alter data as it is parsed into Tabulator. For example if you wanted to convert a numeric column into a boolean based on its value, before the data is used to build the table.
    //      You can set mutators on a per column basis using the mutator option in the column definition object.
    //      You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator.
    //      Data can be mutated whenever it enters the table, either through a command or through a user editing the table. To allow you to have more control over how your data is mutated, there are a variety of different mutation options you can pass your callback to instead of just the mutator callback.

    /**
     * Only called when data is loaded via a command {eg. setData).
     */
    public MutatorAccessor mutatorData;
    public MutatorAccessorParams mutatorDataParams;

    /**
     * Only called when data is changed via a user editing a cell.
     */
    public MutatorAccessor mutatorEdit;
    public MutatorAccessorParams mutatorEditParams;

    /**
     * Only called when data is pasted into the table.
     */
    public MutatorAccessor mutatorClipboard;
    public MutatorAccessorParams mutatorClipboardParams;

    /**
     *  Called if the matching mutator from the above list is not set.
     */
    public MutatorAccessor mutator;
    public MutatorAccessorParams mutatorParams;

    //Accessors
    //  Accessors are used to alter data as it is extracted from the table, through commands, the clipboard, or download.
    //  You can set accessors on a per column basis using the accessor option in the column definition object.
    //  You can pass an optional additional parameter with accessor, accessorParams that should contain an object with additional information for configuring the accessor.
    //  Data can be altered whenever it enters the table, either through a command or through a clipboard copy event or through a download of the table. To allow you to have more control over how your data is altered, there are a variety of different accessor options you can pass your callback to instead of just the accessor callback.


    /**
     * only called when data is extracted via a command {eg. getData).
     */
    public MutatorAccessor accessorData;
    public MutatorAccessorParams accessorDataParams;

    /**
     * only called when data is being converted into a downloadable file.
     */
    public MutatorAccessor accessorDownload;
    public MutatorAccessorParams accessorDownloadParams;

    /**
     * only called when data is being copied into the clipboard.
     */
    public MutatorAccessor accessorClipboard;
    public MutatorAccessorParams accessorClipboardParams;

    /**
     * called if the matching accessor from the above list is not set.
     */
    public MutatorAccessor accessor;
    public MutatorAccessorParams accessorParams;


    //Editing

    /**
     * set the editor to be used when editing the data. (see Manipulating Data for more details)
     * <p>
     * Columns of the table can be set as editable using the editor property in the column definition. (see Define Columns for more details).
     * <p>
     * When a user clicks on an editable column the will be able to edit the value for that cell.
     * <p>
     * By default Tabulator will use an editor that matches the current formatter for that cell. if you wish to specify a specific editor, you can set them per column using the editor option in the column definition. Passing a value of true to this option will result in Tabulator applying the editor that best matches the columns formatter, if present.
     * <p>
     * You can pass an optional additional parameter with the editor, editorParams that should contain an object with additional information for configuring the editor.
     * <p>
     * Tabulator comes with a number of built-in editors:
     * - "input"    - allows entering of a single line of plain text
     * - "textarea" - allows entering of multiple lines of plain text
     * - "number"   - allows for numeric entry with a number type input element with increment and decrement buttons
     * - "range"    - allows for numeric entry with a range type input element
     * - "autocomplete" - allows users to search a list of predefined options passed into the values property of the editorParams option.
     */

    public Editor editor;
    public EditorParams editorParams;

    /**
     * There are some circumstances where you may want to block editibility of a cell for one reason or another. To meet this need you can use the editable option. This lets you set a callback that is executed before the editor is built, if this callback returns true the editor is added, if it returns false the edit is aborted and the cell remains a non editable cell. The function is passed one parameter, the CellComponent of the cell about to be edited. You can also pass a boolean value instead of a function to this property.
     */
    public CallbackRet1<CellComponent, Boolean> editable;


    public Validator validator;

    /**
     * Setting this parameter to true will cause an editor element matching the columns editor type to be displayed in the header below the column title, and will allow the user to filter data in the table by values in that column. The editor will be chosen using the same rules as the editor parameter, for more information on this see the Manipulating Data section.
     * <p>
     * Alternatively you can pass a string to this parameter containing any of the standard editors listed in the Manipulating Data section
     */
    public Editor headerFilter;

    /**
     * You can pass an optional additional parameter with the header filter, headerFilterParams that should contain an object with additional information for configuring the header filter element. This will be passed to the editor in the column header instead of the editorParams property.
     * If you want to dynamically generate the headerFilterParams at the time the header filter is created, you can pass a function into the property that should return the params object.
     */

    public EditorParams headerFilterParams;

    /**
     * If an input element is used as the filter element, the table will be filtered in real time as the user types in the input element. To prevent exessive redrawing of the table Tabulator will wait 300 miliseconds after the user has finished typing before tirggering the filter, this ensures that the table is not redrawn for every character typed by the user.
     * <p>
     * Note: If the input has a type attribute value of text it will be automatically changed to search to give the user the option to clear the input text.
     * <p>
     * If you would prefer that the input element behave like a standard editor without live updating the table, you can set the headerFilterLiveFilter column definition property to false
     */
    public boolean headerFilterLiveFilter;


    /**
     * By default Tabulator will clear the filter when it considers the header filter value to be empty, in the case of most filters that is if the value is undefined, null, or "", or in the case of check boxes that is if the value is not either true or false.
     * <p>
     * If you are using a custom filter or want to alter what an existing filter considers empty, you can pass a function to the headerFilterEmptyCheck column definition property.
     * This function will be passed in the value of the filter as an argument and should return a boolean where true represents an empty filter.
     */
    public Callback1RetBoolean<JsObject /*filter*/> headerFilterEmptyCheck;

    /**
     * By default Tabulator will try and match the comparison type to the type of element used for the header filter.
     * <p>
     * Standard input elements will use the "like" filter, this allows for the matches to be displayed as the user types.
     * <p>
     * For all other element types (select boxes, check boxes, input elements of type number) an "=" filter type is used.
     * <p>
     * If you want to specify the type of filter used you can pass it to the headerFilterFunc option in the column definition object. This will take any of the standard filters outlined above or a custom function:
     */
    public HeaderFilterFunc headerFilterFunct;

    /**
     * It is possible to pass additional parameters to the custom filter function by passing an object to the headerFilterFuncParams option in the column definition.
     */
    public JsPropertyMap<String> headerFilterFuncParams;

    /**
     * The default placeholder text used for input elements can be set using the headerFilterPlaceholder option in the table definition
     */
    public String headerFilterPlaceholder;

    /**
     * force (true) or hide(false) data in download.
     */
    public boolean download;

    /**
     * Override column title  in download, instead of using title.
     *
     * The downloadTitle property is now available in the column definition property for column groups to help with customization of table downloads.
     *
     */
    public String downloadTitle;


    /**
     * If you want to make any bulk changes to the table data before it is parsed into the download file you can pass a mutator function to the downloadDataFormatter option in the table definition.
     */
    public CallbackRet1<Any, Any[]> downloadDataFormatter;

    /**
     * custom title for use in downloads.
     * The downloadTitle property is now available in the column definition property for column groups to help with customization of table downloads.
     */
    public DownloadReady downloadReady;

    //Callbacks

    /**
     * Column Header Click.
     * <p>
     * The headerClick callback is triggered when a user left clicks on a column or group header, it can be set on a per column basis using the option in the columns definition object
     */
    public Callback2<MouseEvent, ColumnComponent> headerClick;

    /**
     * Column Header Double Click.
     * <p>
     * The headerDblClick callback is triggered when a user double clicks on a column or group header, it can be set on a per column basis using the option in the columns definition object
     */
    public Callback2<MouseEvent, ColumnComponent> headerDblClick;


    /**
     * Column Header Right Click.
     * <p>
     * The headerContext callback is triggered when a user right clicks on a column or group header, it can be set on a per column basis using the option in the columns definition object.
     */
    public Callback2<MouseEvent, ColumnComponent> headerContext;


    /**
     * Column Header Tap.
     * <p>
     * The headerTap callback is triggered when a user taps on the column header on a touch display, it can be set on a per column basis using the option in the columns definition object.
     */
    public Callback2<TouchEvent, ColumnComponent> headerTap;

    /**
     * Column Header Double Tap
     * <p>
     * The headerDblTap callback is triggered when a user taps on the column header on a touch display twice in under 300ms, it can be set on a per column basis using the option in the columns definition object.
     */
    public Callback2<TouchEvent, ColumnComponent> headerDblTap;


    /**
     * Column Header Tap Hold
     * <p>
     * The headerTapHold callback is triggered when a user taps on the column header on a touch display and holds their finger down for over 1 second, it can be set on a per column basis using the option in the columns definition object.
     */
    public Callback2<TouchEvent, ColumnComponent> headerTapHold;


    /**
     * Column Moved.
     * <p>
     * column - column component of the moved column.
     * columns- array of columns in new order.
     * The columnMoved callback will be triggered when a column has been successfuly moved.
     */
    public Callback2<ColumnComponent, ColumnComponent[]> columnMoved;

    /**
     * Column Resized.
     * <p>
     * The columnResized callback will be triggered when a column has been resized by the user.
     */
    public Callback1<ColumnComponent> columnResized;


    //Column visibility

    /**
     * Column Visibility Changed.
     * <p>
     * The columnVisibilityChanged callback is triggered whenever a column changes between hidden and visible states.
     */
    @FunctionalInterface
    @JsFunction
    public interface ColumnVisibilityHandler {
        /**
         * @param column  -  column component
         * @param visible - is column visible (true = visible, false = hidden)
         */
        void chnaged(ColumnComponent column, boolean visible);
    }

    /**
     * Hide data in print data.
     * <p>
     * If you don't want to show a particular column in the print table you can set the print property in its column definition object to false.
     * <p>
     * You can also force a hidden column to be visibile in the print by setting the print property in its column definition object to true.
     */
    public ColumnVisibilityHandler columnVisibilityChanged;

    public boolean print;



    /**
     * Column Title Changed
     * <p>
     * The columnTitleChanged callback is triggered whenever a user edits a column title when the editableTitle parameter has been enabled in the column definition array.
     */
    public Callback1<ColumnComponent> columnTitleChanged;


    //Column calculation functions

    public Calculator topCalc;
    public CalculatorParams topCalcParams;
    public Calculator bottomCalc;
    public CalculatorParams bottomCalcParams;


}
