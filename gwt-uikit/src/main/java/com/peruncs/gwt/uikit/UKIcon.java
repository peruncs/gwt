package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import elemental2.dom.Node;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Icon component wrapper.
 */
@JsType(isNative = true)
public abstract class UKIcon extends UKComponent {

    public Node svg;

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKIcon icon(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKIcon icon(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKIcon icon(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKIcon icon(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The icon to display.
         */
        public String icon;

        /**
         * The icon size ratio.
         */
        public int ratio = 1;

    }
}
