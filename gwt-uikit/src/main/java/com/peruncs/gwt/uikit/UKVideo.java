package com.peruncs.gwt.uikit;

import com.peruncs.gwt.utils.StringOr;
import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;


/**
 * UIKit Video component wrapper.
 */
@JsType(isNative = true)
public abstract class UKVideo extends UKComponent {

    /**
     * Component creation.
     *
     * @param element - the element for this component.
     * @param options - the initialization options for this component.
     * @return the component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKVideo video(String element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKVideo video(Element element, Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKVideo video(String element);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKVideo video(Element element);

    /**
     * Options for component initialization.
     */
    @JsType
    public static class Options {

        /**
         * The video automatically plays/pauses as it's visible/hidden on the page. A value of inview will delay loading the video and play/pause the video as it enters/leaves the viewport.
         * autoplay is the Primary option, and its key may be omitted if it's the only option in the attribute value.
         */
        public StringOr<Boolean> autoplay;

        /**
         * Automatically mute YouTube or Vimeo videos.
         */
        public boolean automute;

    }
}
