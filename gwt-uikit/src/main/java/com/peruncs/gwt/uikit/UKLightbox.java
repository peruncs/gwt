package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * UIKit Lightbox dialog wrapper.
 */
@JsType(isNative = true)
public abstract class UKLightbox extends UKComponent {


    /**
     * Component creation.
     *
     * @param element - the element for the component.
     * @param options - the initialization options for the component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKLightbox lightboxPanel(String element, UKLightbox.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKLightbox lightboxPanel(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKLightbox lightboxPanel(Element element, UKLightbox.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKLightbox lightboxPanel(Element element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKLightbox lightboxPanel(UKLightbox.Options options);


    /**
     * Lightbox item to show. 0 based index.
     * @param index the index
     */
    public native void show(int index);

    /**
     * Hide this modal.
     */
    public native void hide();


    /**
     * Starts the Lightbox's autoplay.
     */
    public native void startAutoplay();


    /**
     * Stops the Lightbox's autoplay.
     */

    public native void stopAutoplay();


    /**
     * Initialization options.
     */
    @JsType
    public static class Options {

        /**
         * Lightbox animation mode: slide, fade or scale
         */
        public String animation;

        /**
         * Lightbox autoplays.
         */
        public boolean autoplay;

        /**
         * The delay between switching slides in autoplay mode.
         */
        public int autoplayInterval = 7000;

        /**
         * Pause autoplay mode on hover.
         */
        public boolean pauseOnHover;

        /**
         * Lightbox videos autoplay.
         */
        public boolean videoAutoplay;

        /**
         * The initial item to show. (zero based).
         */
        public int index;

        /**
         * The animation velocity (pixel/ms).
         */
        public int velocity = 2;

        /**
         * The number of items to preload. (left and right of the currently active item).
         */
        public int preload = 1;

        /**
         * An array of items to display, e.g. [{source: 'images/size1.jpg', caption: '900x600'}]
         */
        public JsPropertyMap<String>[] items;


        /**
         * The template string.
         */
        public String template;

        /**
         * Delay time before controls fade out in ms.
         */
        public int delayControls = 3000;

    }

}
