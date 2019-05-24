package com.peruncs.gwt.tabulator;

import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative = true, name = "?", namespace = GLOBAL)
public interface StringOrNode {

    @JsOverlay
    static StringOrNode of(Object o) {
        return Js.cast(o);
    }

    @JsOverlay
    default Node asNode() {
        return Js.cast(this);
    }

    @JsOverlay
    default String asString() {
        return Js.cast(this);
    }


    @JsOverlay
    default boolean isString() {
        return (Object) this instanceof String;
    }

}
