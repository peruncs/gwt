package com.peruncs.gwt.jwt.auth0;


import jsinterop.annotations.JsFunction;


@JsFunction
@FunctionalInterface
public interface Auth0Callback<T> {
    void call(Auth0Error e, T t);
}
