package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Sticky component wrapper.
 */
@JsType(isNative = true)
public abstract class UKSticky extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKSticky sticky(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKSticky sticky(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSticky sticky(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKSticky sticky(Element element);

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The top offset from where the element should be stick.
         */
        public String top;

        /**
         * The bottom offset until the element should stick. (true: parent element, prefixed with '!' a parent selector).
         */
        public String bottom;

        /**
         * The offset the Sticky should be fixed to.
         */
        public String offset;

        /**
         * The animation to use when the element becomes sticky.
         */
        public String animation;

        /**
         * The active class.
         */
        public String clsActive;


        /**
         * The inactive class.
         */
        public String clsInactive;

        /**
         * The element the Sticky should get its width from in active mode.
         */
        public String widthElement;

        /**
         * Only show sticky element when scrolling up.
         */
        public boolean showOnUp;

        /**
         * Condition for the active status - a width as integer (e.g. 640) or a breakpoint (e.g. @s, @m, @l, @xl) or any valid media query (e.g. (min-width: 900px)).
         */
        public String media;

        /**
         * Initially make sure that the Sticky is not over a targeted element via location hash.
         */
        public Integer targetOffset;

    }

}
