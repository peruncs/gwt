package com.peruncs.gwt.uikit;

import com.peruncs.gwt.utils.StringOr;
import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Filter component wrapper.
 */
@JsType(isNative = true)
public abstract class UKFilter extends UKComponent {

    /**
     * Alert creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKFilter filter(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKFilter filter(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKFilter filter(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKFilter filter(Element element);


    /**
     * Closes and removes the Alert.
     */
    public native void close();

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The targeted list on which to apply the filter to. target is the Primary option and its key may be omitted, if it's the only option in the attribute value.
         */
        public String target = "";


        /**
         * Animation duration in milliseconds.
         */

        public StringOr<Boolean> selActive;

    }
}
