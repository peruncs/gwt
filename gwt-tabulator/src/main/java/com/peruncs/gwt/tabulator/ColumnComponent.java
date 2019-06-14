package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface ColumnComponent {
    void show();
    void hide();
    void toggle();
}
