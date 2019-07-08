package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.Callback1;
import com.peruncs.gwt.utils.Callback2;
import com.peruncs.gwt.utils.CallbackRet1;
import com.peruncs.gwt.utils.CallbackRet5;
import elemental2.dom.MouseEvent;
import elemental2.dom.TouchEvent;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class ColumnOptions extends CellEventHandler {
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
    public StringOrInteger width;

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
     * Additional parameters you can pass to the sorter.
     * Additional parameters you can pass to the sorter.
     */
    public SorterParamsUnion sorterParams;

    /**
     * Determines how to sort data in this column. Possible values:
     * "string" - will sort columns as strings of characters. sorterParams has optional parameter in SorterParamsString.
     * "number" - will sort column as numbers (integer or float, will also handle numbers using "," separators). sorterParams has optional parameter in NumberParamsBase.
     * "alphanum" - will sort column as alpha numeric code. sorterParams has optional parameter in SorterParamsBase.
     * "boolean" - will sort column as booleans.
     * "exists" - will sort column ordering if value has a type of "undefined" or not.
     * "date" - will sort columns as dates. sorterParams has optional parameter in SorterParamsFormat.
     */
    public String sorter;

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
    public FormatterParamsUnion formatterParams;

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
    public FormatterUnion formatter;

    public FormatterUnion TitleFormatter;

    public FormatterParamsUnion TitleFormatterParams;

    /**
     * The tooltip parameter can take three different types of value:
     * <p>
     * boolean - a value of false disables the tooltip, a value of true sets the tooltip of the cell to its value
     * string - a string that will be displayed for all cells in the matching column/table.
     * function - a callback function that returns the string for the cell. see below:
     * The function accepts one argument, the CellComponent for the cell the tooltip is being generated for.
     */
    public TooltipUnion tooltip;

    /**
     * setting a headerTooltip value on a column will override the global setting
     */
    public HeaderTooltipUnion headerTooltip;

    //Mutators

    //
    //      Mutators are used to alter data as it is parsed into Tabulator. For example if you wanted to convert a numeric column into a boolean based on its value, before the data is used to build the table.
    //      <p>
    //      You can set mutators on a per column basis using the mutator option in the column definition object.
    //      <p>
    //      You can pass an optional additional parameter with mutator, mutatorParams that should contain an object with additional information for configuring the mutator.
    //
    //       //value - original value of the cell
    //      	//data - the data for the row
    //      	//type - the type of mutation occurring  (data|edit)
    //      	//params - the mutatorParams object from the column definition
    //      	//component - when the "type" argument is "edit", this contains the cell component for the edited cell, otherwise it is the column component for the column
    //
    //      Data can be mutated whenever it enters the table, either through a command or through a user editing the table. To allow you to have more control over how your data is mutated, there are a variety of different mutation options you can pass your callback to instead of just the mutator callback.
    //
    //      There are four options for mutator callbacks
    //
    //      mutatorData - only called when data is loaded via a command {eg. setData).
    //      mutatorEdit - only called when data is changed via a user editing a cell.
    //      mutatorClipboard - only called when data is pasted into the table.
    //      mutator - called if the matching mutator from the above list is not set.
    //

    public CallbackRet5<Any, Any[], String, MutatorAccessorUnionType, BaseComponent, Any> mutator;
    public MutatorAccessorUnionType mutatorParams;

    public CallbackRet5<Any, Any[], String, MutatorAccessorUnionType, BaseComponent, Any> mutatorData;
    public MutatorAccessorUnionType mutatorDataParams;

    public CallbackRet5<Any, Any[], String, MutatorAccessorUnionType, BaseComponent, Any> mutatorEdit;
    public MutatorAccessorUnionType mutatorEditParams;

    /**
     * Clipboard Mutators
     * You can use the mutatorClipboard and mutatorClipboardParams options on a column definition to alter the value of data in a column as it is pasted into the table.
     * Note: The mutateClipboard is called before the paste action is triggered, which may result in a different mutator being triggered after mutateClipboard.
     */
    public CallbackRet5<Any, Any[], String, MutatorAccessorUnionType, BaseComponent, Any> mutatorClipboard;
    public MutatorAccessorUnionType mutatorClipboardParams;

    //Accessors
    //
    //  Accessors are used to alter data as it is extracted from the table, through commands, the clipboard, or download.
    //
    //  You can set accessors on a per column basis using the accessor option in the column definition object.
    //
    //  You can pass an optional additional parameter with accessor, accessorParams that should contain an object with additional information for configuring the accessor.
    //
    //
    //    Data can be altered whenever it enters the table, either through a command or through a clipboard copy event or through a download of the table. To allow you to have more control over how your data is altered, there are a variety of different accessor options you can pass your callback to instead of just the accessor callback.
    //
    //    There are four options for accessor callbacks
    //
    //    accessorData - only called when data is extracted via a command {eg. getData).
    //        accessorDownload - only called when data is being converted into a downloadable file.
    //        accessorClipboard - only called when data is being copied into the clipboard.
    //                accessor - called if the matching accessor from the above list is not set.
    //        Each accessor function has its own matching params option, for example accessorDownload has accessorDownloadParams.

    public CallbackRet5<Integer, Any[], String, MutatorAccessorUnionType, ColumnComponent, Any> accessor;
    public MutatorAccessorUnionType accessorParams;

    public CallbackRet5<Integer, Any[], String, MutatorAccessorUnionType, ColumnComponent, Any> accessorData;
    public MutatorAccessorUnionType accessorDataParams;

    public CallbackRet5<Integer, Any[], String, MutatorAccessorUnionType, ColumnComponent, Any> accessorDownload;
    public MutatorAccessorUnionType accessorDownloadParams;

    /**
     * Clipboard Accessors.
     * You can use the accessorClipboard and accessorClipboardParams options on a column definition to alter the value of data in a column before it is added to the clipboard.
     */
    public CallbackRet5<Integer, Any[], String, MutatorAccessorUnionType, ColumnComponent, Any> accessorClipboard;
    public MutatorAccessorUnionType accessorClipboardParams;


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

    public EditorUnionType editor;
    public EditorParamsUnionType editorParams;

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
    public StringOrBoolean headerFilter;

    /**
     * You can pass an optional additional parameter with the header filter, headerFilterParams that should contain an object with additional information for configuring the header filter element. This will be passed to the editor in the column header instead of the editorParams property.
     * If you want to dynamically generate the headerFilterParams at the time the header filter is created, you can pass a function into the property that should return the params object.
     */

    public EditorParamsUnionType headerFilterParams;

    /**
     * force (true) or hide(false) data in download.
     */
    public boolean download;

    /**
     * Override column title  in download, instead of using title.
     */
    public String downloadTitle;

    /**
     * If you want to make any bulk changes to the table data before it is parsed into the download file you can pass a mutator function to the downloadDataFormatter option in the table definition.
     */
    public DownloadDataFormatter downloadDataFormatter;

    /**
     * The downloadReady callback allows you to intercept the download file data before the users is prompted to save the file.
     * In order for the download to proceed the downloadReady callback is expected to return a blob of file to be downloaded.
     * If you would prefer to abort the download you can return false from this callback. This could be useful for example if you want to send the created file to a server via ajax rather than allowing the user to download the file.
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

    /**
     * Column Visibility Changed.
     * <p>
     * The columnVisibilityChanged callback is triggered whenever a column changes between hidden and visible states.
     */
    public Callback1<ColumnComponent, boolean> columnVisibilityChanged;

    /**
     * Column Title Changed
     * <p>
     * The columnTitleChanged callback is triggered whenever a user edits a column title when the editableTitle parameter has been enabled in the column definition array.
     */
    public Callback1<ColumnComponent> columnTitleChanged;
}
