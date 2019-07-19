package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;


/**
 * Boolean binary union type.
 *
 * @param <T> - the alternative type.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface BooleanOr<T> {

    @JsOverlay
    static BooleanOr<Boolean> of(boolean value) {
        return Js.cast(Boolean.valueOf(value));
    }

    @JsOverlay
    static <T> BooleanOr<T> of(T t) {
        return Js.cast(t);
    }

    @JsOverlay
    static <T> BooleanOr<T[]> of(T[] t) {
        return Js.cast(t);
    }

    @JsOverlay
    default boolean asBoolean() {
        return Js.asBoolean(this);
    }

    @JsOverlay
    default T as() {
        return Js.cast(this);
    }

    @JsOverlay
    default boolean isBoolean() {
        return Js.typeof(this).equalsIgnoreCase("boolean");
    }


}
