package com.peruncs.gwt.tabulator;

import com.peruncs.gwt.utils.CallbackRet1;
import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

@JsFunction
@FunctionalInterface
public interface DownloadDataFormatter {
    Any format(Any data);
}
