package com.peruncs.gwt.uikit;

import com.peruncs.gwt.utils.StringOr;
import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Grid component wrapper.
 */
@JsType(isNative = true)
public abstract class UKGrid extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKGrid grid(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKGrid grid(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKGrid grid(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKGrid grid(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * This class is added to items that break into the next row, typically to create margin to the previous row.
         */
        public StringOr margin;

        /**
         * This class is added to the first element in each row.
         */
        public String firstColumn;

        /**
         * Enables masonry layout for this grid.
         */
        public boolean masonry;

        /**
         * Parallax translation value. The value must be a positive integer. Falsy disables the parallax effect (default).
         */
        public int parallax;

    }
}
