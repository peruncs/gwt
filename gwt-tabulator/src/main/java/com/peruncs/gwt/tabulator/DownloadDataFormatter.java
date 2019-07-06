package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
@JsFunction
@FunctionalInterface
public interface DownloadDataFormatter {
    /**
     * @param data - active table data array
     * @return data for download
     */
    Any format(Any[] data);
}
