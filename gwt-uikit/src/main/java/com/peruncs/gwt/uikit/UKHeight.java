package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Height component wrapper.
 */
@JsType(isNative = true)
public abstract class UKHeight extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKHeight heightMatch(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKHeight heightMatch(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKHeight heightMatch(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKHeight heightMatch(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Elements that should match. By default, direct children will match.
         */
        public String target;

        /**
         * If your targets wrap into multiple rows, only grid columns within the same row are matched.
         */
        public boolean row = true;

    }
}
