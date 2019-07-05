package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

/**
 * Once the data has been parsed into row data, it will be passed to a paste action to be added to the table. There are three inbuilt paste actions:
 * <p>
 * insert - Inserts data into the table using the addRows function (default)
 * update - Updates data in the table using the updateOrAddData function
 * replace - replaces all data in the table using the setData function
 */
@JsType
public class ClipboardPasteAction {

//    You can also pass a custom action function into the clipboardPasteAction property, it should take one argument of the row data from the paste parse function and trigger an action on the table and where possible return the row objects that are created
//
//    var table = new Tabulator("#example-table", {
//            clipboardPasteAction:function(rowData){
//                   return this.table.updateData(rows);
//      }
//    });
}
