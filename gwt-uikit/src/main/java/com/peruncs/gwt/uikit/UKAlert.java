package com.peruncs.gwt.uikit;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Alert component wrapper.
 */
@JsType(isNative = true)
public abstract class UKAlert extends UKComponent {

    /**
     * Alert creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for the dialog component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace.value)
    public native static UKAlert alert(String element, Options options);


    /**
     * Alert creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for the dialog component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace.value)
    public native static UKAlert alert(HTMLElement element, Options options);

    /**
     * Closes and removes the Alert.
     */
    public native void close();

    /**
     * The following events will be triggered on elements with this component attached.
     */
    public interface Events {
        String BEFORE_HIDE = "beforehide";
        String HIDE = "hide";
    }

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * Fade out or use the Animation component.
         */
        public boolean animation = true;


        /**
         * Animation duration in milliseconds.
         */

        public int duration = 150;


        /**
         * CSS selector for all elements that should trigger the closing of the modal.
         */
        public String selClose = "uk-alert-close";
    }
}