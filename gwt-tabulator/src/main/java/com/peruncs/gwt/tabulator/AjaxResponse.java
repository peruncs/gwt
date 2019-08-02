package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;


/**
 * process the returned data before it is passed to the table.
 * <p>
 * Tabulator expects a JSON encoded array of row objects as the response from an ajax request:
 * <pre>
 * [
 *     {"id":1, "name":"bob", "age":"23"},
 *     {"id":2, "name":"jim", "age":"45"},
 *     {"id":3, "name":"steve", "age":"32"}
 * ]
 * 55555555<pre/>
 */
@JsFunction
@FunctionalInterface
public interface AjaxResponse {
    /**
     * @param url              the URL of the request
     * @param params           - the parameters passed with the request
     * @param originalResponse - the JSON object returned in the body of the response
     * @return return value of this callback should be an array of row data objects
     */
    Any[] process(String url, JsPropertyMap<String> params, Any[] originalResponse);
}
