package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes 2 inputs.
 */
@JsFunction
@FunctionalInterface

public interface Callback2RetBoolean<A, B> {
    boolean call(A param1, B param2);
}
