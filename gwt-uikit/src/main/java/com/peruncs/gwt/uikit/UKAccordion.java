package com.peruncs.gwt.uikit;

import elemental2.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * UIKit Accordion wrapper.
 */
@JsType(isNative = true)
public abstract class UKAccordion extends UKComponent {


    /**
     * Component creation.
     *
     * @param element - the element for the component.
     * @param options - the initialization options for the  component.
     * @return a component
     */
    @JsMethod(namespace = UIKitNamespace)
    public native static UKAccordion accordion(String element, UKAccordion.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKAccordion accordion(Element element, UKAccordion.Options options);

    @JsMethod(namespace = UIKitNamespace)
    public native static UKAccordion accordion(String element);


    @JsMethod(namespace = UIKitNamespace)
    public native static UKAccordion accordion(Element element);

    /**
     * Toggle the visibility of this  component.
     *
     * @param index   - Accordion pane to toggle. 0 based index. Default to 0.
     * @param animate - Suppress opening animation by passing false. Default is true.
     */
    public native void toggle(int index, boolean animate);

    public native void toggle(int index);

    public native void toggle();


    /**
     * Initialization options.
     */
    @JsType
    public static class Options {

        /**
         * Index of the element to open initially.
         */
        public int active;

        /**
         * Reveal item directly or with a transition.
         */
        public boolean animation = true;

        /**
         * Allow all items to be closed.
         */
        public boolean collapsible = true;

        /**
         * The content selector, which selects the accordion content elements.
         */
        public String content = "> .uk-accordion-content";

        /**
         * Animation duration in milliseconds.
         */
        public int duration = 200;

        /**
         * Allow multiple open items.
         */
        public boolean multiple;

        /**
         * CSS selector of the element(s) to toggle.
         */
        public String targets = "> *";

        /**
         * The transition to use when revealing items. Use keyword for easing functions.
         */
        public String toggle = "ease";

    }

}
