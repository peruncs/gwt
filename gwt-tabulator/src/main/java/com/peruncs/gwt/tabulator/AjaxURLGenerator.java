package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.base.JsPropertyMap;

/**
 * return request url.
 * <p>
 * url - the url from the ajaxURL property or setData function
 * config - the request config object from the ajaxConfig property
 * params - the params object from the ajaxParams property, this will also include any pagination, filter and sorting properties based on table setup
 */
@JsFunction
@FunctionalInterface
public interface AjaxURLGenerator {
    String generateUrl(String url, AjaxConfig ajaxConfig, JsPropertyMap<Object> ajaxParams);
}