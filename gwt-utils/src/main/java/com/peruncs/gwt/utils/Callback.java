package com.peruncs.gwt.utils;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes no arguments.
 */
@JsFunction
@FunctionalInterface
public interface Callback {
    void call();
}
