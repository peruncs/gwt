package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface EventHandler<E, C> {
    void handle(E event, C component);
}