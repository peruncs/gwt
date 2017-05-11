package com.peruncs.gwt.utils;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes 4 inputs.
 */
@JsFunction
@FunctionalInterface
public interface Callback4<A, B, C, D> {
    void call(A param1, B param2, C param3, D param4);
}
