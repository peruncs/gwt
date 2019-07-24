package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsType;


@JsType
public class Filter {
    public String field;
    public String type;
    public JsObject value;

}
