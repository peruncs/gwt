package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Tooltip component wrapper.
 */
@JsType(isNative = true)
public abstract class UKTooltip extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKTooltip tooltip(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKTooltip tooltip(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKTooltip tooltip(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKTooltip tooltip(Element element);

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Tooltip text. Title is the Primary option and its key may be omitted, if it's the only option in the attribute value.
         */
        public String title;

        /**
         * Tooltip position.
         */
        public String pos;

        /**
         * Tooltip offset.
         */
        public Integer offset;

        /**
         * The space separated names of animations to use. Comma separate for animation out.
         */
        public String animation;

        /**
         * The animation duration.
         */
        public int duration = 100;

        /**
         * The show delay.
         */
        public int delay = 0;

        /**
         * The active class.
         */
        public String cls;

    }
}
