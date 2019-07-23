package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface ComponenCallback<C> {
    void handleComponent(C component);
}
