package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public abstract class UKNotification {

    /**
     * Values for the @see #Options.status fieled.
     */
    public interface Style {
        String PRIMARY = "primary";
        String SUCCESS = "success";
        String WARNING = "warning";
        String DANGER = "danger";
    }


    /**
     * Values for the @see #Options.pos fieled.
     */
    public interface Position {
        String TOP_LEFT = "top-left";
        String TOP_CENTER = "top-center";
        String TOP_RIGHT = "top-right";
        String BOTTOM_LEFT = "bottom-left";
        String BOTTOM_CENTER = "bottom-center";
        String BOTTOM_RIGHT = "bottom-right";
    }

    /**
     * Notification initialization options.
     */
    @JsType
    public static class Options {

        /**
         * Notification message to show.
         */
        public String message;

        /**
         * Notification status color.
         */
        public String status = Style.SUCCESS;

        /**
         * Visibility duration until a notification disappears.
         */
        public int timeout = 5000;

        /**
         * Useful, if you want to close all notifications in a specific group.
         */
        public String group;

        /**
         * Display corner.
         */
        public String pos = Position.TOP_CENTER;

    }

    /**
     * Create notification component.
     *
     * @param message - the notification message.
     * @return a notification component.
     */
    @JsMethod(namespace = "UIkit")
    public native static UKNotification notification(String message);


    /**
     * Create notification component.
     *
     * @param message - the notification message.
     * @param style   - the notification message style. @see UKNotificationOptions.Style
     * @return a notification component.
     */
    @JsMethod(namespace = "UIkit")
    public native static UKNotification notification(String message, String style);

    /**
     * Create notification component.
     *
     * @param message - the notification message.
     * @param options - the notification options. @see #UKNotificationOptions
     * @return a notification component.
     */
    @JsMethod(namespace = "UIkit")
    public native static UKNotification notification(String message, Options options);


    /**
     * Create notification component.
     *
     * @param options - the notification options. @see #UKNotificationOptions.
     * @return a notification component.
     */
    @JsMethod(namespace = "UIkit")
    public native static UKNotification notification(Options options);


    @JsMethod(namespace = "UIkit")
    public native static UKNotification notification(Element node, Options options);


    /**
     * Closes all currently open notifications.
     */
    @JsMethod(namespace = "UIkit.notification")
    public static native void closeAll();

    /**
     * Close this notification.
     * @param immediate - to close immediately.
     */
    public static native void close(boolean immediate);
}
