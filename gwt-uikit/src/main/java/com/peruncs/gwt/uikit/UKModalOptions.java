package com.peruncs.gwt.uikit;

import jsinterop.annotations.JsType;

@JsType
public class UKModalOptions {

    /**
     * Class to add to <body> when modal is active.
     */
    String clsPage = "uk-modal-page";


    /**
     * Class of the element to be considered the panel of the modal.
     */

    String clsPanel = "uk-modal-dialog";

    public interface SelCloseOptions {
        String UK_MODAL_CLOSE = "uk-modal-close";
        String UK_MODAL_CLOSE_DEFAULT = "uk-modal-close-default";
        String UK_MODAL_CLOSE_OUTSIDE = "uk-modal-close-outside";
        String UK_MODAL_CLOSE_FULL = "uk-modal-close-full";
    }

    /**
     * CSS selector for all elements that should trigger the closing of the modal.
     */
    String selClose = SelCloseOptions.UK_MODAL_CLOSE;
}
