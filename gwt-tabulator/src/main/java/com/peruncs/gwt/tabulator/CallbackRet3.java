package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes 3 inputs.
 */
@JsFunction
@FunctionalInterface
public interface CallbackRet3<R, A, B, C> {
    R call(A param1, B param2, C param3);
}