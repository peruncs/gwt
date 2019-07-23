package com.peruncs.gwt.tabulator;


import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface DataHandler<T> {
    void handle(T data);
}
