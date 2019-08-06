package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Navbar component wrapper.
 */
@JsType(isNative = true)
public abstract class UKNavbar extends UKComponent {

    /**
     * Alert creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKNavbar navbar(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKNavbar navbar(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKNavbar navbar(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKNavbar navbar(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Dropdown alignment: left, right, center.
         */
        public String align;

        /**
         * Comma separated list of dropdown trigger behavior modes: click, hover.
         */
        public String mode;

        /**
         * Delay time in hover mode before a dropdown is shown in milliseconds.
         */
        public int delayShow;

        /**
         * Delay time in hover mode before a dropdown is hidden in milliseconds.
         */
        public int delayHide;

        /**
         * Referenced element to keep the dropdown's visibility.
         */
        public String boundary;

        /**
         * Align the dropdown to the boundary.
         */
        public boolean boundaryAlign;

        /**
         * The offset of the dropdown container.
         */
        public int offset;


        /**
         * Enable or disable dropbar behavior.
         */

        public boolean dropbar;

        /**
         * The mode in which the dropbar appears: slide, push.
         */
        public String dropbarMode;

        /**
         * The dropbar transition duration.
         */
        public int duration = 200;

    }
}
