package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Switcher component wrapper.
 */
@JsType(isNative = true)
public abstract class UKSwitcher extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKSwitcher switcher(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSwitcher switcher(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSwitcher switcher(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSwitcher switcher(Element element);

    /**
     * Shows the Switcher item with given index.
     *
     * @param index - Switcher item to show. 0 based index.
     */
    public native void show(int index);

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
         * The animation duration.
         */
        public int duration = 200;

        /**
         * Use swiping.
         */
        public boolean swiping = true;

    }
}
