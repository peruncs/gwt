package com.peruncs.gwt.uikit;

import jsinterop.annotations.JsType;

@JsType
public class UKNotificationOptions {


    /**
     * Notification message to show.
     */
    public String message;


    public interface Style {
        String PRIMARY = "primary";
        String SUCCESS = "success";
        String WARNING = "warning";
        String DANGER = "danger";
    }

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


    public interface Position {
        String TOP_LEFT = "top-left";
        String TOP_CENTER = "top-center";
        String TOP_RIGHT = "top-right";
        String BOTTOM_LEFT = "bottom-left";
        String BOTTOM_CENTER = "bottom-center";
        String BOTTOM_RIGHT = "bottom-right";
    }

    /**
     * Display corner.
     */
    public String pos = Position.TOP_CENTER;

}
