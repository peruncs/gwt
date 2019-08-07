package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Slideshow component wrapper.
 */
@JsType(isNative = true)
public abstract class UKSlideshow extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this  component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKSlideshow slideshow(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKSlideshow slideshow(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSlideshow slideshow(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSlideshow slideshow(Element element);

    /**
     * Shows the component.
     *
     * @param index slider item index.
     */
    public native void show(int index);

    /**
     * Starts the autoplay.
     */
    public native void startAutoplay();


    /**
     * Stops the autoplay.
     */
    public native void stopAutoplay();

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Slideshow animation mode: slide, fade, scale, pull or push.
         */
        public String animation;

        /**
         * Slideshow  autoplays.
         */
        public boolean autoplay;

        /**
         * The delay between switching slides in autoplay mode.
         */
        public int autoplayInterval = 7000;


        /**
         * Enable pointer dragging.
         */
        public boolean draggable = true;

        /**
         * The animation easing (CSS timing functions or cubic-bezier).
         */
        public String easing;

        /**
         * Disable infinite sliding.
         */
        public boolean finite;

        /**
         * Slideshow item to show. 0 based index.
         */
        public int index;

        /**
         * The animation velocity (pixel/ms).
         */
        public int velocity = 1;

        /**
         * The ratio. (false prevents height adjustment).
         */
        public String ratio;

        /**
         * Pause autoplay mode on hover.
         */
        public boolean pauseOnHover = true;

        /**
         * The minimum height.
         */
        Integer minHeight;

        /**
         * The maximum  height.
         */
        Integer maxHeight;

    }

}
