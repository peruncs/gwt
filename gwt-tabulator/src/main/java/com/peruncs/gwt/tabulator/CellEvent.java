package com.peruncs.gwt.tabulator;


import elemental2.dom.MouseEvent;
import elemental2.dom.TouchEvent;
import elemental2.dom.UIEvent;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

/**
 * Provide cell event handling.
 */
@JsType
abstract public class CellEvent {

    @JsFunction
    @FunctionalInterface
    interface Handler<E extends UIEvent> {
        void handle(E event, CellComponent cell);
    }

    @JsFunction
    @FunctionalInterface
    interface Callback {
        void call(CellComponent cell);
    }

    /**
     * Cell Click.
     * <p>
     * The cellClick callback is triggered when a user left clicks on a cell, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<MouseEvent> cellClick;

    /**
     * Cell Double Click.
     * <p>
     * The cellDblClick callback is triggered when a user double clicks on a cell, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<MouseEvent> cellDblClick;

    /**
     * Cell Right Click.
     * <p>
     * The cellContext callback is triggered when a user right clicks on a cell, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<MouseEvent> cellContext;

    /**
     * Cell Tap.
     * <p>
     * The cellTap callback is triggered when a user taps on a cell in this column on a touch display, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<TouchEvent> cellTap;


    /**
     * Cell Double Tap.
     * <p>
     * The cellDblTap callback is triggered when a user taps on a cell in this column on a touch display twice in under 300ms, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<TouchEvent> cellDblTap;

    /**
     * Cell Tap Hold.
     * <p>
     * The cellTapHold callback is triggered when a user taps on a cell in this column on a touch display and holds their finger down for over 1 second, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<TouchEvent> cellTapHold;

    /**
     * Cell Mouse Enter.
     * <p>
     * The cellMouseEnter callback is triggered when the mouse pointer enters a cell, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<MouseEvent> cellMouseEnter;

    /**
     * Cell Mouse Leave.
     * <p>
     * The cellMouseLeave callback is triggered when the mouse pointer leaves a cell, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<MouseEvent> cellMouseLeave;

    /**
     * Cell Mouse Over.
     * <p>
     * The cellMouseOver callback is triggered when the mouse pointer enters a cell or one of its child element, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<MouseEvent> cellMouseOver;

    /**
     * Cell Mouse Out.
     * <p>
     * The cellMouseOut callback is triggered when the mouse pointer leaves a cell or one of its child element, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<MouseEvent> cellMouseOut;

    /**
     * Cell Mouse Move.
     * <p>
     * The cellMouseMove callback is triggered when the mouse pointer moves over a cell, it can be set on a per column basis using the option in the columns definition object.
     */
    public Handler<MouseEvent> cellMouseMove;


    /**
     * Cell Editing.
     * <p>
     * The cellEditing callback is triggered when a user starts editing a cell.
     */
    public Callback cellEditing;

    /**
     * Cell Edit Cancelled.
     * <p>
     * The cellEditCancelled callback is triggered when a user aborts a cell edit and the cancel function is called.
     */
    public Callback cellEditCancelled;


    /**
     * Cell Edited.
     * <p>
     * The cellEdited callback is triggered when data in an editable cell is changed.
     */
    public Callback cellEdited;

}
