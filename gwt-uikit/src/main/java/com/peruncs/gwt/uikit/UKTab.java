package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Tab component wrapper.
 */
@JsType(isNative = true)
public abstract class UKTab extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKTab tab(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKTab tab(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKTab tab(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKTab tab(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Related items container. By default succeeding elements with class 'uk-switcher'.
         */
        public String connect;

        /**
         * Select the clickable elements which trigger content switching.
         */
        public boolean toggle;

        /**
         * Active index on init. Providing a negative number indicates a position starting from the end of the set.
         */
        public int active;


        /**
         * The space separated names of animations to use. Comma separate for animation out.
         */
        public String animation;

        /**
         * The animation duration.
         */
        public int duration = 200;

        /**
         * Use swiping.
         */
        public boolean swiping = true;

        /**
         * When to switch to horizontal mode - a width as integer (e.g. 640) or a breakpoint (e.g. @s, @m, @l, @xl) or any valid media query (e.g. (min-width: 900px)).
         */
        public String media;

    }
}
