package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.base.JsPropertyMap;

/**
 * Custom header filter
 */
@JsFunction
@FunctionalInterface
public interface CustomHeaderFilter {
    /**
     * @param headerValue- the value of the header filter element.
     * @param rowValue     - the value of the column in this row.
     * @param filterParams - params object passed to the headerFilterFuncParams property.
     * @return true if it passes the filter.
     */
    boolean filter(JsObject headerValue, JsObject rowValue, JsPropertyMap<String> filterParams);

}
