package com.peruncs.gwt.recaptcha;

import com.peruncs.gwt.utils.Callback;
import com.peruncs.gwt.utils.Callback1;
import elemental2.dom.HTMLElement;
import elemental2.promise.Promise;
import jsinterop.annotations.*;

@JsType(isNative = true)
public class GRecaptcha {

    @JsType
    public static class RenderOptions {

        /**
         * Your sitekey.
         */
        public String sitekey;

        /**
         * Optional. Reposition the reCAPTCHA badge. 'inline' lets you position it with CSS. Values: 'bottomright', 'bottomleft', 'inline', default value: 'bottomright'.
         */
        public String badge;

        /**
         * Optional. Used to create an invisible widget bound to a div and programatically executed. Values: 'invisible'.
         */
        public String size;

        /**
         * Optional. The tabindex of the challenge. If other elements in your page use tabindex, it should be set to make user navigation easier. Default value: 0.
         */
        public int tabindex;

        /**
         * Optional. The name of your callback function, executed when the user submits a successful response. The g-recaptcha-response token is passed to your callback.
         */
        public Callback1<String> callback;

//        /**
//         * Optional. The name of your callback function, executed when the reCAPTCHA response expires and the user needs to re-verify.
//         */
//        @JsProperty(name="expired-callback")
//        public Callback1<Any> expiredCallback;
//
//        /**
//         * Optional. The name of your callback function, executed when reCAPTCHA encounters an error (usually network connectivity) and cannot continue until connectivity is restored. If you specify a function here, you are responsible for informing the user that they should retry.
//         */
//        @JsProperty(name="error-callback")
//        public Callback1<Any> errorCallback;

        /**
         * Optional. For plugin owners to not interfere with existing reCAPTCHA installations on a page. If true, this reCAPTCHA instance will be part of a separate ID space. Default value: 'false'.
         */
        public boolean isolated;

    }

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

    /**
     * @param container  -  The HTML element to render the reCAPTCHA widget.  Specify either the ID of the container (string) or the DOM element itself.
     * @param parameters - An object containing parameters as key=value pairs.
     * @param inherit    - Use existing data-* attributes on the element if the coorsponding parameter is not specified. The values in parameter will take precedence over the attributes.
     */
    @JsMethod(namespace = "grecaptcha")
    public static native void render(String container, RenderOptions parameters, boolean inherit);

    @JsMethod(namespace = "grecaptcha")
    public static native void render(HTMLElement container, RenderOptions parameters, boolean inherit);

    @JsMethod(namespace = "grecaptcha")
    public static native void ready(Callback c);

    @JsMethod(namespace = "grecaptcha")
    public static native Promise<String> execute(String siteKey, Action action);

    @JsOverlay
    public static Promise<String> execute(String siteKey, String action) {
        return execute(siteKey, new Action(action));
    }

}
