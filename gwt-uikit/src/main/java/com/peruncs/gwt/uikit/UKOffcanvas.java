package com.peruncs.gwt.uikit;


import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * UIKit Offcanvas component wrapper.
 */
@JsType(isNative = true)
public abstract class UKOffcanvas extends UKComponent {

    /**
     * Offcanvas creation.
     *
     * @param element - the element for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKOffcanvas offcanvas(String element);


    /**
     * Offcanvas creation.
     *
     * @param element - the element for this  component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKOffcanvas offcanvas(Element element);

    /**
     * Offcanvas creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKOffcanvas offcanvas(String element, UKOffcanvas.Options options);


    /**
     * Offcanvas creation.
     *
     * @param element - the element for this  component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKOffcanvas offcanvas(Element element, UKOffcanvas.Options options);

    /**
     * Show this component.
     */
    public native void show();


    /**
     * Hide this component.
     */
    public native void hide();

    /**
     * Initialization options.
     */
    @JsType
    public static class Options {

        /**
         * Off-canvas animation mode: "slide", "reveal", "push" or "none". Default: "slide".
         */
        public String mode;

        /**
         * Flip off-canvas to the right side.
         */
        public boolean flip;

        /**
         * Display the off-canvas together with an overlay.
         */
        public boolean overlay;

        /**
         * Close the off-canvas when the Esc key is pressed.
         */
        public boolean escClose;

        /**
         * Close the off-canvas when the background is clicked.
         */
        public boolean bgClose;

        /**
         * Define a target container via a selector to specify where the off-canvas should be appended in the DOM. Setting it to "false" will prevent this behavior.
         */
        public String container;
    }

    /**
     * The following events will be triggered on elements with this component attached.
     */
    public interface Events {
        String BEFORE_SHOW = "beforeshow";
        String SHOW = "show";
        String SHOWN = "shown";
        String BEFORE_HIDE = "beforehide";
        String HIDE = "hide";
        String HIDDEN = "hidden";

    }

}