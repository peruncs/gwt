package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes one input.
 */
@JsFunction
@FunctionalInterface
public interface Callback1<A> {
    void call(A param1);
}
