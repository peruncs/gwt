package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes no inputs.
 */
@JsFunction
@FunctionalInterface
public interface CallbackRet<R> {
    R call();
}
