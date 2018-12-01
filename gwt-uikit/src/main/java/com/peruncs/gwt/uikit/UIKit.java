package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * UIKit interface.
 */
@JsType(isNative = true, name = "UIkit", namespace = JsPackage.GLOBAL)
public abstract class UIKit {

    //Does not work yet, see: https://github.com/uikit/uikit/issues/3676
    //Notifications API

    /**
     * Create notification component.
     *
     * @param message - the notification message.
     * @return a notification component.
     */
    public native static UKNotification notification(String message);


    /**
     * Create notification component.
     *
     * @param message - the notification message.
     * @param style - the notification message style. @see UKNotificationOptions.Style
     * @return a notification component.
     */
    public native static UKNotification notification(String message, String style);

    /**
     * Create notification component.
     *
     * @param message - the notification message.
     * @param options - the notification options. @see #UKNotificationOptions
     * @return a notification component.
     */
    public native static UKNotification notification(String message, UKNotificationOptions options);


    /**
     * Create notification component.
     *
     * @param options - the notification options. @see #UKNotificationOptions.
     * @return a notification component.
     */
    public native static UKNotification notification(UKNotificationOptions options);

    public native static UKNotification notification(Element node, UKNotificationOptions options);


    /**
     * Closes all currently open notifications.
     */
    @JsMethod(name = "closeAll", namespace = "UIkit.notification")
    public native static void closeAllNotifications();

    //Modal API

//    /**
//     * Initialization.
//     *
//     * @param element - the element for the dialog component.
//     * @param options - the initialization options for the dialog component.
//     * @return a modal component
//     */
//    public native static UKModal modal(String element, UKModalOptions options);
//
//    /**
//     * Initialization.
//     *
//     * @param element - the element for the dialog component.
//     * @param options - the initialization options for the dialog component.
//     * @return a modal component.
//     */
//    public native static UKModal modal(Element element, UKModalOptions options);
//
//
//    /**
//     * Show an alert box with one button.
//     *
//     * @param message - the alert message.
//     * @param <T>     - the promise type.
//     * @return a promise.
//     */
//    @JsMethod(name = "alert", namespace = "UIkit.modal")
//    public native static <T> Promise<T> alertDialog(String message);
//
//
//    /**
//     * Show a confirm dialog with your message and two buttons.
//     *
//     * @param message - the confirm message.
//     * @param <T>     - the promise type.
//     * @return a promise.
//     */
//    @JsMethod(name = "confirm", namespace = "UIkit.modal")
//    public native static <T> Promise<T> confirmDialog(String message);
//
//
//    /**
//     * Show a dialog asking for a text input.
//     *
//     * @param label       -  the input label message.
//     * @param placeholder -  the placeholder .
//     * @param <T>         - the promise type.
//     * @return a promise.
//     */
//    @JsMethod(name = "prompt", namespace = "UIkit.modal")
//    public native static <T> Promise<T> promptDialog(String label, String placeholder);
//
//
//    /**
//     * Show dialog with any HTML content.
//     *
//     * @param html - the html content.
//     * @param <T>  - the promise type.
//     * @return a promise.
//     */
//    @JsMethod(name = "dialog", namespace = "UIkit.modal")
//    public native static <T> Promise<T> anyDialog(String html);

}
