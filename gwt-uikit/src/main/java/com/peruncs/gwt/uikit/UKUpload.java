package com.peruncs.gwt.uikit;

import com.peruncs.gwt.utils.Callback;
import elemental2.core.JsObject;
import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Upload component wrapper.
 */
@JsType(isNative = true)
public abstract class UKUpload extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKUpload upload(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKUpload upload(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKUpload upload(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKUpload upload(Element element);

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The request url.
         */
        public String url;

        /**
         * Allow multiple files to be uploaded.
         */
        public boolean multiple;

        /**
         * The name parameter.
         */
        public String name;


        /**
         * Additional parameters.
         */
        public JsObject params;

        /**
         * File name filter. (eg. *.png)
         */
        public String allow;

        /**
         * File MIME type filter. (eg. image/*)
         */
        public String mime;

        /**
         * Number of files that will be uploaded simultaneously.
         */
        public int concurrent = 1;

        /**
         * The expected response type
         */
        public String type;

        /**
         * The request method.
         */
        public String method;

        /**
         * Invalid MIME type message.
         */
        public String msgInvalidMime;

        /**
         * Invalid name message.
         */
        public String msgInvalidName;

        /**
         * File name filter.
         */
        public String clsDragover;


        /**
         * The abort callback.
         */
        public Callback abort;

        /**
         * The beforeAll callback.
         */
        public Callback beforeAll;

        /**
         * The beforeSend callback.
         */
        public Callback beforeSend;

        /**
         * The complete callback.
         */
        public Callback complete;

        /**
         * The completeAll callback.
         */
        public Callback completeAll;

        /**
         * The error callback.
         */
        public Callback error;

        /**
         * The load callback.
         */
        public Callback load;

        /**
         * TThe loadEnd callback.
         */
        public Callback loadEnd;

        /**
         * TThe loadStart callback.
         */
        public Callback loadStart;


        /**
         * TThe progress callback.
         */
        public Callback progress;

        /**
         * TThe fail callback.
         */
        public Callback fail;

    }
}
