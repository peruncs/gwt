package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Slider component wrapper.
 */
@JsType(isNative = true)
public abstract class UKSlider extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return athe component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKSlider slider(String element, Options options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKSlider slider(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKSlider slider(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKSlider slider(Element element);

    /**
     * Shows the slider item.
     *
     * @param index slider item index.
     */
    public native void show(int index);

    /**
     * Starts the slider autoplay.
     */
    public native void startAutoplay();


    /**
     * Stops the slider autoplay.
     */
    public native void stopAutoplay();

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Slider autoplays.
         */
        public boolean autoplay;

        /**
         * The delay between switching slides in autoplay mode.
         */
        public int autoplayInterval = 7000;

        /**
         * Center the active slide.
         */
        public boolean center;

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
         * Slider item to show. 0 based index.
         */
        public int index;

        /**
         * Pause autoplay mode on hover.
         */
        public boolean pauseOnHover = true;

        /**
         * Slide in sets.
         */
        public boolean sets;

        /**
         * The animation velocity (pixel/ms).
         */
        public int velocity = 1;

        public String selSlides;

    }

}
