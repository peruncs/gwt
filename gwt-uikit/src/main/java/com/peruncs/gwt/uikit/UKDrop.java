package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Drop component wrapper.
 */
@JsType(isNative = true)
public abstract class UKDrop extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKDrop drop(String element, DropDownOptions options);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKDrop drop(Element element, DropDownOptions options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKDrop drop(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKDrop drop(Element element);


    /**
     * Show the Drop.
     */
    public native void show();

    /**
     * Hide the Drop.
     */
    public native void hide();

}
