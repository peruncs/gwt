package com.peruncs.gwt.tabulator;

public class EditorUnionType {
//todo
    // Can be string for standard editor

    // Can be boolean for default

    //Can be be

//    function(cell, onRendered, success, cancel, editorParams){
//        //cell - the cell component for the editable cell
//        //onRendered - function to call when the editor has been rendered
//        //success - function to call to pass the successfuly updated value to Tabulator
//        //cancel - function to call to abort the edit and return to a normal cell
//        //editorParams - params object passed into the editorParams column definition property
//
//        //create and style editor
//        var editor = document.createElement("input");
//
//        editor.setAttribute("type", "date");
//
//        //create and style input
//        editor.style.padding = "3px";
//        editor.style.width = "100%";
//        editor.style.boxSizing = "border-box";
//
//        //Set value of editor to the current value of the cell
//        editor.value = moment(cell.getValue(), "DD/MM/YYYY").format("YYYY-MM-DD")
//
//        //set focus on the select box when the editor is selected (timeout allows for editor to be added to DOM)
//        onRendered(function(){
//            editor.focus();
//            editor.style.css = "100%";
//        });
//
//        //when the value has been set, trigger the cell to update
//        function successFunc(){
//            success(moment(editor.value, "YYYY-MM-DD").format("DD/MM/YYYY"));
//        }
//
//        editor.addEventListener("change", successFunc);
//        editor.addEventListener("blur", successFunc);
//
//        //return the editor element
//        return editor;
//    };
}
