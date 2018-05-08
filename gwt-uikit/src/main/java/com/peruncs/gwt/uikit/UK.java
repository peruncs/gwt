package com.peruncs.gwt.uikit;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true)
public interface UK {
    
//  //Navbar
//  @JsProperty
//  public UKBaseComponent navbar(JQElement selector, JsPropertyMap properties);
//
//  @JsProperty
//  public UKBaseComponent navbar(JQElement selector);
  
  @JsProperty
  public UKBaseComponent navbar(String selector, JsPropertyMap properties);
  
  @JsProperty
  public UKBaseComponent navbar(String selector);
  
}
