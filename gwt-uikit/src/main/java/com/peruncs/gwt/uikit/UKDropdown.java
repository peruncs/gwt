package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Dropdown component wrapper.
 */
@JsType(isNative = true)
public abstract class UKDropdown extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this alert component.
     * @param options - the initialization options for this component.
     * @return a modal component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKDropdown dropdown(String element, DropDownOptions options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKDropdown dropdown(Element element, DropDownOptions options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKDropdown dropdown(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKDropdown dropdown(Element element);


    /**
     * Show the Drop.
     */
    public native void show();

    /**
     * Hide the Drop.
     */
    public native void hide();

}
