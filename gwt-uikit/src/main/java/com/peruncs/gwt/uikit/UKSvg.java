package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import elemental2.dom.Node;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit SVG component wrapper.
 */
@JsType(isNative = true)
public abstract class UKSvg extends UKComponent {

    /**
     * A JavaScript Promise that will resolve with the added SVG Node.
     */
    public Promise<Node> svg;

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKSvg svg(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSvg svg(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSvg svg(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSvg svg(Element element);

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The icon to display.
         */
        public String src;

        /**
         * The icon size ratio.
         */
        public boolean strokeAnimation;

    }
}
