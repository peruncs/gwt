package com.peruncs.gwt.recaptcha;

import com.peruncs.gwt.utils.Callback;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = "grecapcha")
public abstract class GRecaptcha {

    @JsType
    public static class Action {

        @JsConstructor
        Action(String action) {
            this.action = action;
        }

        @JsProperty
        private String action;

    }

    public static native void ready(Callback c);
    public static native <T> Promise<T> execute(String siteKey, Action action);
    public static <T> Promise<T> execute(String siteKey, String action){
        return execute(siteKey,new Action(action));
    }

}
