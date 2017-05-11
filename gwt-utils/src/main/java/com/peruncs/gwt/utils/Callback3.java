package com.peruncs.gwt.utils;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes 3 inputs.
 */
@JsFunction
@FunctionalInterface
public interface Callback3<A, B, C> {
    void call(A param1, B param2, C param3);
}
