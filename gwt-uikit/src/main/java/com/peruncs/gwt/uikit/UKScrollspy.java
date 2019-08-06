package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Scrollspy component wrapper.
 */
@JsType(isNative = true)
public abstract class UKScrollspy extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this  component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKScrollspy scrollspy(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKScrollspy scrollspy(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKScrollspy scrollspy(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKScrollspy scrollspy(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Class to toggle when the element enters/leaves viewport. cls is the Primary option and its key may be omitted, if it's the only option in the attribute value.
         */
        public String cls;

        /**
         * Hides the element while out of view.
         */
        public boolean hidden = true;

        /**
         * Top offset before triggering in view.
         */
        public int offsetTop;

        /**
         * Left offset before triggering in view.
         */
        public int offsetLeft;

        /**
         * Applies the cls class every time the element is in view.
         */
        public boolean repeat;

        /**
         * Delay time in ms.
         */
        public int delay;

    }

}
