package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit ScrollspyNav component wrapper.
 */
@JsType(isNative = true)
public abstract class UKScrollspyNav extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this  component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKScrollspyNav scrollspyNav(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKScrollspyNav scrollspyNav(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKScrollspyNav scrollspyNav(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKScrollspyNav scrollspyNav(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Class to add to the active links.
         */
        public String cls;

        /**
         * Target to apply the class to.
         */
        public String closest;

        /**
         * Adds the Scroll component to its links.
         */
        public boolean scroll;

        /**
         * If overflow is set to true, the first or last item will stay active if above or below the navigation.
         */
        public boolean overflow;


        /**
         * Pixel offset added to scroll top.
         */
        public int offset;

    }

}
