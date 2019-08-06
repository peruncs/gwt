package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Parallax component wrapper.
 */
@JsType(isNative = true)
public abstract class UKParallax extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this  component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKParallax parallax(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKParallax parallax(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKParallax parallax(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKParallax parallax(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Animation easing during scrolling.
         */
        public int easing = 1;

        /**
         * Element dimension reference for animation duration.
         */
        public String target;

        /**
         * Animation range depending on the viewport.
         */
        public int viewport;


        /**
         * Condition for the active status - a width as integer (e.g. 640) or a breakpoint (e.g. @s, @m, @l, @xl) or any valid media query (e.g. (min-width: 900px)).
         */
        public String media = "uk-alert-close";
    }

}
