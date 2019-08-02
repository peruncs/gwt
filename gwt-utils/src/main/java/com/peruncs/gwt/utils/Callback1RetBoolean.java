package com.peruncs.gwt.utils;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes 2 inputs.
 */
@JsFunction
@FunctionalInterface
public interface Callback1RetBoolean<A> {
    boolean call(A param1);
}
