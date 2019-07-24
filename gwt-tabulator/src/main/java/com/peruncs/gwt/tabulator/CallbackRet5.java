package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes 4 inputs.
 *
 * @param <A> input2
 * @param <B> input3
 * @param <D> input4
 * @param <E> input5
 */
@JsFunction
@FunctionalInterface
public interface CallbackRet5<R, A, B, C, D, E> {
    R call(A param1, B param2, C param3, D param4, E param5);
}