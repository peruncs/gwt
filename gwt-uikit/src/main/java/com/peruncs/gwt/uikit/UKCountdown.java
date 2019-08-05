package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * UIKit Countdown wrapper.
 */
@JsType(isNative = true)
public abstract class UKCountdown extends UKComponent {


    /**
     * Component creation.
     *
     * @param element - the element for the  component.
     * @param options - the initialization options for the  component.
     * @return a component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKCountdown countdown(String element, UKCountdown.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKCountdown countdown(Element element, UKCountdown.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKCountdown countdown(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKCountdown countdown(Element element);

    /**
     * Starts the countdown.
     */
    public native void start();

    /**
     * Stops the countdown.
     */
    public native void stop();


    /**
     * Initialization options.
     */
    @JsType
    public static class Options {

        /**
         * Any string parsable by Date.parse. See Reference.
         */
        public String date;

    }

}
