package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;

/**
 * UIKit Modal dialog wrapper.
 */
@JsType(isNative = true)
public abstract class UKModal extends UKComponent {

    /**
     * Modal namespace for JsInterop.
     */
    @JsOverlay
    final static String UKModalNamespace = "UIkit.modal";

    @JsOverlay
    public final static String UK_MODAL_CLOSE = "uk-modal-close";

    @JsOverlay
    public final static String UK_MODAL_CLOSE_DEFAULT = "uk-modal-close-default";

    @JsOverlay
    public final static String UK_MODAL_CLOSE_OUTSIDE = "uk-modal-close-outside";

    @JsOverlay
    public final static String UK_MODAL_CLOSE_FULL = "uk-modal-close-full";


    /**
     * Modal creation.
     *
     * @param element - the element for the dialog component.
     * @param options - the initialization options for the dialog component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKModal modal(String element, UKModal.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKModal modal(String element);

    /**
     * Modal creation.
     *
     * @param element - the element for the dialog component.
     * @param options - the initialization options for the dialog component.
     * @return a modal component.
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKModal modal(Element element, UKModal.Options options);

    public native static UKModal modal(Element element);

    /**
     * Show an alert box with one button.
     *
     * @param message - the alert message.
     * @return a promise.
     */
    @JsMethod(namespace = UKModalNamespace)
    public native static Promise<Void> alert(String message);

    /**
     * Show a confirm dialog with your message and two buttons.
     *
     * @param message - the confirm message.
     * @return a promise.
     */
    @JsMethod(namespace = UKModalNamespace)
    public native static Promise<Void> confirm(String message);

    /**
     * Show a dialog asking for a text input.
     *
     * @param label       -  the input label message.
     * @param placeholder -  the placeholder .
     * @return a promise.
     */
    @JsMethod(namespace = UKModalNamespace)
    public native static Promise<Void> prompt(String label, String placeholder);

    /**
     * Show a dialog with HTML content.
     *
     * @param html - the html content.
     * @return a promise.
     */
    @JsMethod(namespace = UKModalNamespace)
    public native static Promise<Void> dialog(String html);

    /**
     * Show this modal.
     */
    public native void show();

    /**
     * Hide this modal.
     */
    public native void hide();

    /**
     * Toggle this modal.
     */

    public native void toggle();


    /**
     * Initialization options.
     */
    @JsType
    public static class Options {

        /**
         * Close the modal when the Esc key is pressed.
         */
        public boolean escClose = true;

        /**
         * Close the modal when the background is clicked.
         */
        public boolean bgClose = true;

        /**
         * Stack modals, when more than one is open. By default, the previous modal will be hidden.
         */
        public boolean stack = false;

        /**
         * Define a target container via a selector to specify where the modal should be appended in the DOM. Setting it to false will prevent this behavior.
         */
        public String container = "true";


        /**
         * Class to add to body when modal is active.
         */
        public String clsPage = "uk-modal-page";


        /**
         * Class of the element to be considered the panel of the modal.
         */

        public String clsPanel = "uk-modal-dialog";


        /**
         * CSS selector for all elements that should trigger the closing of the modal.
         */
        public String selClose = UK_MODAL_CLOSE;
    }

}
