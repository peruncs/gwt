package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class ColumnOptions {
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
     * an integer to determine when the column should be hidden in responsive mode .When responsive layout is enabled, all columns are given a default responsive value of 1. The higher you set this value the sooner that column will be hidden as the table width decreases. If two columns have the same responsive value then they are hidden from right to left (as defined in the column definition array, ignoring user moving of the columns). If you set the value to 0 then the column will never be hidden regardless of how narrow the table gets
     */
    public int responsive;

    /**
     * The tooltip parameter can take three different types of value:
     * <p>
     * boolean - a value of false disables the tooltip, a value of true sets the tooltip of the cell to its value
     * string - a string that will be displayed for all cells in the matching column/table.
     * function - a callback function that returns the string for the cell. see below:
     * The function accepts one argument, the CellComponent for the cell the tooltip is being generated for.
     */
    public StringOrBooleanOrCallback1 tooltip;

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

    /** Setting a tooltip value on a column will override the global setting*/
    public TooltipUnion tooltip;

    /** setting a headerTooltip value on a column will override the global setting*/
    public HeaderTooltipUnion headerTooltip;

}
