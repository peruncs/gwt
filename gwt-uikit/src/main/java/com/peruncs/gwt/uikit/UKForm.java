package com.peruncs.gwt.uikit;

import com.peruncs.gwt.utils.StringOr;
import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Form component wrapper.
 */
@JsType(isNative = true)
public abstract class UKForm extends UKComponent {

    /**
     * Alert creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKForm formCustom(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKForm formCustom(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKForm formCustom(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKForm formCustom(Element element);


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
         * Value display target.
         */
        public StringOr<Boolean> target;

    }
}
