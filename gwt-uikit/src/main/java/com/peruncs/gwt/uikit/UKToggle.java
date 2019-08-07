package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit toggle component wrapper.
 */
@JsType(isNative = true)
public abstract class UKToggle extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKToggle toggle(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKToggle toggle(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKToggle toggle(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKToggle toggle(Element element);

    /**
     * Toggles the Toggle's target.
     */
    public native void toggle();


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * CSS selector of the element(s) to toggle.
         */
        public String target;

        /**
         * Comma separated list of trigger behaviour modes. (hover, click, media).
         */
        public String mode;

        /**
         * The class that is being toggled. Defaults to the hidden attribute.
         */
        public String cls;

        /**
         * The space separated names of animations to use. Comma separate for animation out.
         */
        public String animation;

        /**
         * The animation duration.
         */
        public int duration = 200;

        /**
         * Toggle the targets successively.
         */
        public boolean queued = true;

        /**
         * When to switch to horizontal mode - a width as integer (e.g. 640) or a breakpoint (e.g. @s, @m, @l, @xl) or any valid media query (e.g. (min-width: 900px)).
         */
        public String media;

    }
}
