package com.peruncs.gwt.tabulator;

import elemental2.dom.Node;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * String/Node union type.
 *
 * @param <T>
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface StringOrNodeOr<T> {

    @JsOverlay
    static StringOrNodeOr<String> of(String value) {
        return Js.cast(value);
    }

    @JsOverlay
    static StringOrNodeOr<Node> of(Node t) {
        return Js.cast(t);
    }

    @JsOverlay
    static <T> StringOrNodeOr<T> of(T t) {
        return Js.cast(t);
    }

    @JsOverlay
    static <T> StringOrNodeOr<T[]> of(T[] t) {
        return Js.cast(t);
    }

//    @JsOverlay
//    default String asString() {
//        return Js.asString(this);
//    }
//
//    @JsOverlay
//    default Node asNode() {
//        return Js.cast(this);
//    }
//
//    @JsOverlay
//    default T as() {
//        return Js.cast(this);
//    }

}
