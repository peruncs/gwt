package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * UIKit Modal dialog wrapper.
 */
@JsType(isNative = true)
public abstract class UKModal extends UKComponent {

    /**
     * Modal namespace for JsInterop.
     */
    interface UKModalNamespace {
        String value = "UIkit.modal";
    }

    /**
     * Modal creation.
     *
     * @param element - the element for the dialog component.
     * @param options - the initialization options for the dialog component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace.value)
    public native static UKModal modal(String element, UKModal.Options options);

    /**
     * Modal creation.
     *
     * @param element - the element for the dialog component.
     * @param options - the initialization options for the dialog component.
     * @return a modal component.
     */
    @JsMethod(namespace = UIKitNamespace.value)
    public native static UKModal modal(Element element, UKModal.Options options);

    /**
     * Show an alert box with one button.
     *
     * @param message - the alert message.
     * @param <T>     - the promise type.
     * @return a promise.
     */
    @JsMethod(namespace = UKModalNamespace.value)
    public native static <T> Promise<T> alert(String message);

    /**
     * Show a confirm dialog with your message and two buttons.
     *
     * @param message - the confirm message.
     * @param <T>     - the promise type.
     * @return a promise.
     */
    @JsMethod(namespace = UKModalNamespace.value)
    public native static <T> Promise<T> confirm(String message);

    /**
     * Show a dialog asking for a text input.
     *
     * @param label       -  the input label message.
     * @param placeholder -  the placeholder .
     * @param <T>         - the promise type.
     * @return a promise.
     */
    @JsMethod(namespace = UKModalNamespace.value)
    public native static <T> Promise<T> prompt(String label, String placeholder);

    /**
     * Show a dialog with HTML content.
     *
     * @param html - the html content.
     * @param <T>  - the promise type.
     * @return a promise.
     */
    @JsMethod(namespace = UKModalNamespace.value)
    public native static <T> Promise<T> dialog(String html);

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


    public interface SelCloseOptions {
        String UK_MODAL_CLOSE = "uk-modal-close";
        String UK_MODAL_CLOSE_DEFAULT = "uk-modal-close-default";
        String UK_MODAL_CLOSE_OUTSIDE = "uk-modal-close-outside";
        String UK_MODAL_CLOSE_FULL = "uk-modal-close-full";
    }

    /**
     * The following events will be triggered on elements with this component attached.
     */
    public interface Events {
        /**
         * Fires before an item is shown.
         */
        String BEFORE_SHOW_EVENT = "beforeshow";

        /**
         * Fires after an item is shown.
         */
        String SHOW_EVENT = "show";

        /**
         * Fires after the item's show animation has completed.
         */
        String SHOWN_EVENT = "shown";

        /**
         * Fires before an item is hidden.
         */
        String BEFORE_HIDE = "beforehide";

        /**
         * Fires after an item's hide animation has started.
         */
        String HIDE_EVENT = "hide";

        /**
         * Fires after an item is hidden.
         */
        String HIDDEN_EVENT = "hidden";
    }

    @JsType
    public static class Options {

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
        public String selClose = SelCloseOptions.UK_MODAL_CLOSE;
    }

}
