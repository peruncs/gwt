package com.peruncs.gwt.tabulator;


import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface ScrollCallback {
    void onScroll(int position);
}
