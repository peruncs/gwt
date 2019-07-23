package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * String union type.
 *
 * @param <T> - - the alternative type.
 */

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface StringOr<T> {

    @JsOverlay
    static StringOr<String> of(String value) {
        return Js.cast(value);
    }

    @JsOverlay
    static StringOr<Integer> of(int t) {
        return Js.cast(t);
    }

    @JsOverlay
    static <T> StringOr<T> of(T t) {
        return Js.cast(t);
    }

    @JsOverlay
    static <T> StringOr<T[]> of(T[] t) {
        return Js.cast(t);
    }

    @JsOverlay
    default String asString() {
        return Js.asString(this);
    }

    @JsOverlay
    default int asInteger() {
        return Js.asInt(this);
    }

    @JsOverlay
    default T as() {
        return Js.cast(this);
    }

    @JsOverlay
    default boolean isString() {
        return (Object) this instanceof String;
    }

    @JsOverlay
    default boolean isInteger() {
        return Js.typeof(this).equalsIgnoreCase("int");
    }

}
