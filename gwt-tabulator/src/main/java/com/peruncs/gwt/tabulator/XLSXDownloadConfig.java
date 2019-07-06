package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType
public class XLSXDownloadConfig {
    public String sheetName;
    public JsPropertyMap<String> sheets;
}
