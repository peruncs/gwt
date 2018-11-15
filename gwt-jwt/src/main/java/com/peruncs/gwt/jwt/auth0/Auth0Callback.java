package com.peruncs.gwt.jwt.auth0;


import jsinterop.annotations.JsFunction;


@JsFunction
@FunctionalInterface
public interface Auth0Callback<E extends Auth0Error, T> {
    void call( E e,T t);
}
