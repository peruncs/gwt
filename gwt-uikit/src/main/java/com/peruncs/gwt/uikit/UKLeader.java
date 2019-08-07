package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Leader component wrapper.
 */
@JsType(isNative = true)
public abstract class UKLeader extends UKComponent {


    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKLeader leader(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKLeader leader(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKLeader leader(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKLeader leader(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Optional fill character.
         */
        public String fill;

        /**
         * Condition for the space filling - a width as integer (e.g. 640) or a breakpoint (e.g. @s, @m, @l, @xl) or any valid media query (e.g. (min-width: 900px)).
         */
        public String media;

    }
}
