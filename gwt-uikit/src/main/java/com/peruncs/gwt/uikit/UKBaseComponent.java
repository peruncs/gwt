package com.peruncs.gwt.uikit;

import jsinterop.annotations.JsOverlay;
//import jsinterop.base.Js;


public class UKBaseComponent<C extends UKBaseComponent>  {
        @JsOverlay
    public final C onShow(Object callback) {
//        on("show",callback);
//        return Js.cast(this);
        return null;
    }
    
    @JsOverlay
    public final C onBeforeShow(Object callback) {
//        on("beforeshow",callback);
//        return Js.cast(this);
        return null;
    }
    
    @JsOverlay
    public final C onShown(Object callback) {
//        on("shown",callback);
//       return Js.cast(this);
        return null;
    }
    
    @JsOverlay
    public final C onHide(Object callback) {
//        on("hide",callback);
//        return Js.cast(this);
        return null;
    }
    
    @JsOverlay
    public final C onHidden(Object callback) {
//        on("hidden",callback);
//        return Js.cast(this);
        return null;
    }
}
