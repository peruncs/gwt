package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import elemental2.dom.Node;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Nav component wrapper.
 */
@JsType(isNative = true)
public abstract class UKNav extends UKComponent {

    /**
     * Alert creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKNav nav(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKNav nav(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKNav nav(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKNav nav(Element element);


    /**
     * Toggles the content pane.
     */
    public native void toggle(int index, boolean animate);

    public native void toggle(String index, boolean animate);

    public native void toggle(Node index, boolean animate);

    public native void toggle(int index);

    public native void toggle(String index);

    public native void toggle(Node index);

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The element(s) to toggle.
         */
        public String targets;

        /**
         * The toggle element(s).
         */
        public String toggle;

        /**
         * The content element(s).
         */
        public String content;

        /**
         * Allow all items to be closed.
         */
        public boolean collapsible;

        /**
         * Allow multiple open items.
         */
        public boolean multiple;

        /**
         * The transition to use.
         */
        public String transition;

        /**
         * The space separated names of animations to use. Comma separate for animation out.
         */
        public String animation;


        /**
         * Animation duration in milliseconds.
         */

        public int duration = 150;

    }
}
