package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

@JsType
public class MovableRowsReceiver {
//todo

//    Can be a string:
//
//    insert - inserts row next to the row it was dropped on, if not dropped on a row it is added to the table (default)
//    add - adds row to the table
//    update - updates the row it is dropped on with the sent rows data
//    replace - replaces the row it is dropped on with the sent row
//
//
//    or custom callback:
//
//    //custom receiver function - update only one value of the toRow and only if the fromRow is dropped on a row
//    var customReceiver = function(fromRow, toRow, fromTable){
//        //fromRow - the row component from the sending table
//        //toRow - the row component from the receiving table (if available)
//        //fromTable - the Tabulator object for the sending table
//
//        if(toRow){
//            toRow.update({"name":fromRow.getData().name});
//            return true;
//        }
//
//        return false;
//    }

}
