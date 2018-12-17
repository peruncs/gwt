package com.peruncs.gwt.recaptcha;

import com.peruncs.gwt.utils.Callback;
import com.peruncs.gwt.utils.Callback1;
import elemental2.promise.Promise;
import jsinterop.annotations.*;

@JsType(isNative = true)
public class GRecaptcha {

    @JsType
    public static class Action {

        @JsConstructor
        Action(String action) {
            this.action = action;
        }

        @JsProperty
        private String action;

    }

    private GRecaptcha() {
    }

    @JsMethod(namespace = "grecaptcha")
    public static native void ready(Callback c);

    @JsMethod(namespace = "grecaptcha")
    public static native  Promise<String> execute(String siteKey, Action action);

    @JsOverlay
    public static Promise<String> execute(String siteKey, String action) {
        return execute(siteKey, new Action(action));
    }

}
