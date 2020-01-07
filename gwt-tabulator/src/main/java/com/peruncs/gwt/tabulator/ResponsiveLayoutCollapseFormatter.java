package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ResponsiveLayoutCollapseFormatter {
    String format(ColumnTitleValue[] data);
}
