package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.CallbackRet2;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class EditorParamsUnionType {
//todo
//    Can be Any
//
//       or
//If you want to generate the options when the select editor is triggered, then you can pass a function into the editorParams, that must return the option list in one of the two formats outlined above
//
//{title:"Name", field:"name", editor:"select", editorParams:function(cell){
//    //create a options list of all values from another column in the table
//    var rows = table.getRows();
//    var values = {};
//
//    rows.forEach(function(row){
//        var data = row.getData();
//
//        values[data.fullname] = data.fullname;
//    });
//
//    return {values:values};
//}
//
//    //define lookup function
//    function paramLookup(cell){
//        //cell - the cell component
//
//        //do some processing and return the param object
//        return {param1:"green"};
//    }

    /**
     * The number and range parameter allow optional properties for the editorParams object:
     * <p>
     * max - the maximum allowed value
     * min - the minimum allowed value
     * step - the step size when incrementing/decrementingthe value (default 1)
     */
    @JsType
    public static class NumericRange {
        public int min = 0;
        public int max = 100;
        public int step = 1;
    }

    /**
     * The tick editor allows for boolean values using a checkbox type input element.
     * <p>
     * tristate - allow tristate tickbox (default false)
     * indeterminateValue - when using tristate tickbox what value should the third indeterminate state have (default null)
     */
    @JsType
    public static class Checkbox {
        public boolean tristate;
        public String indeterminateValue;
    }


    /**
     * The star editor allows entering of numeric value using a star rating indicator.
     * <p>
     * This editor will automatically detect the correct number of stars to use if it is used on the same column as the star formatter.
     * <p>
     * Users can use left/right arrow keys and enter for selection as well as the mouse.
     */
    @JsType
    public static class StarRating {
        public boolean tristate;
        public String indeterminateValue;
    }




    /**
     * The select editor creates a dropdown select box to allow the user to select from some predefined options passed into the values property of the editorParams option.
     * <p>
     * The editor has one optional property for the editorParams object:
     * <p>
     * listItemFormatter - a function that should return the HTML contents for each item in the value list
     * sortValuesList - if values property is set to true this option can be used to set how the generated list should be sorted. if ommitted the list will be in the order of rows in the table, when used it can have a value of "asc" or "desc".
     * The editor has one mandatory property for the editorParams object:
     * <p>
     * values - a list of values to be displayed to the user
     * There are five ways you can define the values list depending on your needs.
     * <p>
     * If you pass the boolean value of true to the values property, Tabulator will automatically build the values list out of all unique values in this cells column.
     */
    @JsType
    public static class Select {
        public CallbackRet2<Any, String, Any> listItemFormatter;
        public String sortValuesList;
        public BooleanOrArray<Any> values;
    }


    /**
     * The editor has optional properties for the editorParams object:
     * <p>
     * showListOnEmpty - show all values in the list when the input element is empty (default false)
     * freetext - allow the user to press enter to save a value to the cell that is not in the list (default false)
     * allowEmpty - allow the user to save an empty value to the cell (default false)
     * searchFunc - function to search through array of value objects and return those that match the search term (by default this does a loose string comparison between values)
     * listItemFormatter - a function that should return the HTML contents for each item in the value list
     * sortValuesList - if values property is set to true this option can be used to set how the generated list should be sorted. if ommitted the list will be in the order of rows in the table, when used it can have a value of "asc" or "desc".
     * The editor has one mandatory property for the editorParams object:
     * <p>
     * values - a list of values to be displayed to the user
     * There are three ways you can define the values list depending on your needs.
     * <p>
     * If you pass the boolean value of true to the values property, Tabulator will automatically build the values list out of all unique values in this cells column.
     */
    @JsType
    public static class Autocomplete extends Select{
        public boolean showListOnEmpty;
        public boolean freetext;
        public boolean allowEmpty;
        //todo
        //        searchFunc:function(term, values){ //search for exact matches
        //            var matches = []
        //
        //            values.forEach(function(item){
        //                if(item.value === term){
        //                    matches.push(item);
        //                }
        //            });
        //
        //            return matches;
        //        }
        public CallbackRet2<String, Any[], Any> searchFunc;
    }

}
