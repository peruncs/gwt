package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface Column {
    void show();
    void hide();
    void toggle();
}
