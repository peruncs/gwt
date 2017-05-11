package com.peruncs.gwt.utils;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes two inputs.
 */
@JsFunction
@FunctionalInterface
public interface Callback2<A, B> {
    void call(A param1, B param2);
}