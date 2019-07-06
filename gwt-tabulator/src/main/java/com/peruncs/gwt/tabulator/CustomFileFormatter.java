package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
@JsFunction
@FunctionalInterface
public interface CustomFileFormatter<O> {

    @JsType(isNative = true)
    @JsFunction
    @FunctionalInterface
    interface FileContentSetter{
        void setFileContents(Any formattedData, String mimeType);
    }

    void format(ColumnOptions[] columns, Any[] data, O options, FileContentSetter setFileContetnts);
}
