package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface AjaxContentType {
    @JsOverlay
    static AjaxContentType form() {
        return Js.cast("form");
    }

    @JsOverlay
    static AjaxContentType json() {
        return Js.cast("json");
    }

    @JsOverlay
    static AjaxContentType complex(Complex complex) {
        return Js.cast(complex);
    }

    @JsType
    class Complex {
        /**
         * contain all headers that should be sent with the request
         */
        public JsPropertyMap<String> headers;


        /**
         * a function that returns the body content of the request.
         */
        @JsType
        @JsFunction
        @FunctionalInterface
        interface Body {
            /**
             * Gnerate body ;
             *
             * @param url    - the url of the request
             * @param config - the fetch config object
             * @param params - the request parameters
             * @return body
             */
            Any generate(String url, Any config, Any params);
        }


        public Body body;
    }
}
