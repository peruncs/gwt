package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes 2 inputs.
 */
@JsFunction
@FunctionalInterface

public interface CallbackRet2<R, A, B> {
    R call(A param1, B param2);
}
