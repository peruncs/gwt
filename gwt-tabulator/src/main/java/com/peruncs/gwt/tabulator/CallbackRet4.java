package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes 4 inputs.
 *
 * @param <A> input2
 * @param <B> input3
 * @param <D> input4
 */
@JsFunction
@FunctionalInterface
public interface CallbackRet4<R, A, B, C, D> {
    R call(A param1, B param2, C param3, D param4);
}