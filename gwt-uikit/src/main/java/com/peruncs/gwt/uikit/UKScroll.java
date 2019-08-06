package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Scroll component wrapper.
 */
@JsType(isNative = true)
public abstract class UKScroll extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this  component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKScroll scroll(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKScroll scroll(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKScroll scroll(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKScroll scroll(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Animation duration in milliseconds.
         */
        public int duration = 1000;

        /**
         * Pixel offset added to scroll top.
         */
        public int offset;

    }

}
