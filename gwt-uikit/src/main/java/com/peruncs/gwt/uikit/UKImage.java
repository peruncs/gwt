package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Image component wrapper.
 */
@JsType(isNative = true)
public abstract class UKImage extends UKComponent {


    /**
     * Component creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKImage img(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKImage img(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKImage img(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKImage img(Element element);


    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The image's src attribute.
         */
        public String dataSrc;

        /**
         * The image's srcset attribute.
         */
        public String dataSrcset;

        public String sizes;

        /**
         * The image's width attribute. It will be used to determine the placeholder's width and the position of the image in the document.
         */
        public String width;

        /**
         * The image's height attribute. It will be used to determine the placeholder's height and the position of the image in the document.
         */
        public String height;

        /**
         * The offset increases the viewport's bounding box vertically before computing an intersection with the image.
         */
        public String offsetTop;

        /**
         * The offset increases the viewport's bounding box horizontally before computing an intersection with the image.
         */
        public String offsetLeft;

        /**
         * A list of targets who's bounding boxes will be used to compute an intersection with the image. Defaults to the image itself.
         */
        public String target;


    }
}
