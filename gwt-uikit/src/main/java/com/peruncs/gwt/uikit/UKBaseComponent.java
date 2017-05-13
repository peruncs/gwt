
package com.peruncs.gwt.uikit;

import com.peruncs.gwt.jquery.JQElement;
import com.peruncs.gwt.utils.Callback;
import jsinterop.annotations.JsOverlay;
import jsinterop.base.Js;


public class UKBaseComponent<C extends UKBaseComponent> extends JQElement {
        @JsOverlay
    public final C onShow(Callback callback) {
        on("show",callback);
        return Js.cast(this);
    }
    
    @JsOverlay
    public final C onBeforeShow(Callback callback) {
        on("beforeshow",callback);
        return Js.cast(this);
    }
    
    @JsOverlay
    public final C onShown(Callback callback) {
        on("shown",callback);
       return Js.cast(this);
    }
    
    @JsOverlay
    public final C onHide(Callback callback) {
        on("hide",callback);
        return Js.cast(this);
    }
    
    @JsOverlay
    public final C onHidden(Callback callback) {
        on("hidden",callback);
        return Js.cast(this);
    }
}
