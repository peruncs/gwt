package com.peruncs.gwt.uikit;

import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public interface UIKit {
    
    
    
  //Navbar
  @JsProperty
  public UIKitNavbar navbar(NodeOrJQueryOrJqueryElement element, JsPropertyMap properties);
  @JsProperty
  public UIKitNavbar navbar(NodeOrJQueryOrJqueryElement element);
}
