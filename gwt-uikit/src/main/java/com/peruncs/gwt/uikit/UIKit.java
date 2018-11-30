package com.peruncs.gwt.uikit;

import elemental2.dom.Node;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "UIkit", namespace = JsPackage.GLOBAL)
public abstract class UIKit {

    //Does not work yet, see: https://github.com/uikit/uikit/issues/3676
    //Notifications API
    public static native UKNotification notification(String message);
    public static native UKNotification notification(String message, String status);
    public static native UKNotification notification(String message, UKNotificationOptions options);
    public static native UKNotification notification(UKNotificationOptions options);
    public static native UKNotification notification(Node node, UKNotificationOptions options);

    @JsMethod(name = "closeAll", namespace = "UIkit.notification")
    public static native void closeAllNotifications();
}
