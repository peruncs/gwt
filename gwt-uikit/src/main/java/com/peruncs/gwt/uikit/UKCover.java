package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * UIKit Cover wrapper.
 */
@JsType(isNative = true)
public abstract class UKCover extends UKComponent {


    /**
     * Component creation.
     *
     * @param element - the element for the  component.
     * @param options - the initialization options for the  component.
     * @return a component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKCover cover(String element, UKCover.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKCover cover(Element element, UKCover.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKCover cover(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKCover cover(Element element);


    /**
     * Initialization options.
     */
    @JsType
    public static class Options {

        /**
         * Tries to automute the iframe's video.
         */
        public boolean automute = true;

        /**
         * The element's width.
         */
        public int width;

        /**
         * The element's height.
         */
        public int height;

    }

}
