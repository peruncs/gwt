package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

/**
 * If you want to perform a more complicated filter then you can pass a callback function
 * to the setFilter method, you can also pass an optional second argument, an object
 * with parameters to be passed to the filter function.
 */
@FunctionalInterface
@JsFunction
public interface CustomFilter {
    /**
     * @param data - the data for the row being filtered
     * @param filterParams - params object passed to the filter
     * @return true if the the filter accepts the data
     */
    boolean filter(Any data, JsObject filterParams);
}
