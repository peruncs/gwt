package com.peruncs.gwt.uikit;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface UKNotification {
    void close(boolean immediate);
}
