package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

/**
 * The copy selector is a function that is used to choose which data is copied into the clipboard. Tabulator comes with a few different selectors built in:
 * <p>
 * active - Copy all table data currently displayed in the table to the clipboard (default)
 * table - Copy all table data to the clipboard, including data that is currently filtered out
 * selected - Copy the currently selected rows to the clipboard, including data that is currently filtered out
 * <p>
 * Tabulator will try to use the best selector to match your table setup. If any text is selected on the table, then it will be that text which is copied. If the table has selectable rows enabled, the it will be the currently selected rows copied to the clipboard in the order in which they were selected. Otherwise the currently visible data in the table will be copied.
 * <p>
 * These selectors can also be used when programatically triggering a copy event. in this case if the selector is not specified it will default to the value set in the clipboardCopySelector property (which is active by default).
 * <p>
 * You can also pass a custom selector function into the clipboardCopySelector property, it should take one argument of a boolean that if true means the column headers should be include in the data and return an array of row data objects:
 */
@JsType
public class ClipboardCopySelector {
    //Can be String or CallbackRet1<boolean showHeaders, Any[]>
}
