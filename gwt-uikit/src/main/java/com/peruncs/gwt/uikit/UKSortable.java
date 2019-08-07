package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Sortable component wrapper.
 */
@JsType(isNative = true)
public abstract class UKSortable extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this  component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKSortable sortable(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKSortable sortable(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSortable sortable(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKSortable sortable(Element element);

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The group.
         */
        public String group;

        /**
         * The animation duration.
         */
        public int animation = 150;

        /**
         * Mouse move threshold before dragging starts.
         */
        public int threshold = 5;

        /**
         * The item class.
         */
        public String clsItem;

        /**
         * The placeholder class.
         */
        public String clsPlaceholder;

        /**
         * The ghost class.
         */
        public String clsDrag;

        /**
         * The body's dragging class.
         */
        public String clsDragState;

        /**
         * The list's class.
         */
        public String clsBase;


        /**
         * Disable dragging on elements with this class.
         */
        public String clsNoDrag;


        /**
         * The empty list class.
         */
        public String clsEmpty;

        /**
         * The ghost's custom class.
         */
        public String clsCustom;

        /**
         * The handle selector.
         */
        public String handle;

    }

}
