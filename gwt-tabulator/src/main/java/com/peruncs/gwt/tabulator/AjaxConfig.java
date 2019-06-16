package com.peruncs.gwt.tabulator;

import elemental2.core.JsMap;
import jsinterop.annotations.JsType;

@JsType
public class AjaxConfig {
    public String method;
    public JsMap<String, String> headers;
}
