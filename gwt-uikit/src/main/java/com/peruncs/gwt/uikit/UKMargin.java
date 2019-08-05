package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Margin component wrapper.
 */
@JsType(isNative = true)
public abstract class UKMargin extends UKComponent {

    /**
     * Alert creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKMargin margin(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKMargin margin(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKMargin margin(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKMargin margin(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * This class is added to items that break into the next row, typically to create margin to the previous row.
         */
        public String margin;


        /**
         * This class is added to the first element in each row.
         */
        public String firstColumn;

    }
}
