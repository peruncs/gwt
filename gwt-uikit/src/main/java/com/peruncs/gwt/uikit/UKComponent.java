package com.peruncs.gwt.uikit;


import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * UIKit base component.
 */
@JsType(isNative = true)
public abstract class UKComponent {

    /**
     * UIkit namespace for JsInterop.
     */
    interface UIKitNamespace {
        String value = "UIkit";
    }

    /**
     * Calls the update hook on components registered on the element itself, it's parents and children.
     *
     * @param element - the element
     * @param event   - the event
     */
    @JsMethod(namespace = UIKitNamespace.value)
    public native static void update(HTMLElement element, String event);


    /**
     * Updates the component itself.
     *
     * @param event - the event
     */
    @JsMethod(name = "$emit")
    public native void emit(String event);

    /**
     * Destroys the component. For example - unbind its event listeners.
     */
    @JsMethod(name = "$destroy")
    public native void destroy();

    /**
     * Destroys the component, also removes the element from the DOM.
     *
     * @param removeElement - wheter to remove the element from DOM.
     */

    @JsMethod(name = "$destroy")
    public native void destroy(boolean removeElement);
}
