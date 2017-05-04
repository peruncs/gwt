package com.peruncs.gwt.errai;

import com.google.gwt.dom.client.Element;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.HTMLElement;

/**
 * "visible" HTML element property helper.
 *
 * @see
 * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/visibility">visibility</a>
 */
public enum HTMLVisibleProperty {

    VISIBLE,
    HIDDEN,
    COLLAPSE,
    INITIAL,
    INHERIT,
    UNSET;

    public final static String PROPERTY_NAME = "visible";
    public final String value;

    HTMLVisibleProperty() {
        value = name().toLowerCase();
    }

    @Override
    public String toString() {
        return value;
    }

    //Convinience methods 
    static public HTMLVisibleProperty getVisibelProperty(HTMLElement element) {
        return HTMLVisibleProperty.valueOf(element.getStyle().getPropertyValue(PROPERTY_NAME));
    }

    static public HTMLVisibleProperty getVisibelProperty(IsElement element) {
        return getVisibelProperty(element.getElement());
    }

    static public void setVisibleProperty(HTMLElement element, HTMLVisibleProperty visible) {
        element.getStyle().setProperty(PROPERTY_NAME, visible.value);
    }

    static public void setVisibleProperty(IsElement element, HTMLVisibleProperty visible) {
        setVisibleProperty(element.getElement(), visible);
    }

    static public void setVisibleProperty(Element element, HTMLVisibleProperty visible) {
        element.getStyle().setProperty(PROPERTY_NAME, visible.value);
    }
    
    public static void unsetVisibleProperty(HTMLElement element){
        element.getStyle().removeProperty(PROPERTY_NAME);
    }
    
    public static void unsetVisibleProperty(IsElement element){
        unsetVisibleProperty(element.getElement());
    }
    
    public static void unsetVisibleProperty(Element element){
        element.getStyle().clearProperty(PROPERTY_NAME);
    }
    
    public static void makeVisible(HTMLElement element){
        HTMLVisibleProperty.makeVisibleOrHidden(element,true);
    }
    
    public static void makeHidden(HTMLElement element){
        HTMLVisibleProperty.makeVisibleOrHidden(element,false);
    }

    public static void makeVisible(Element element){
        HTMLVisibleProperty.makeVisibleOrHidden(element,true);
    }
    
    public static void makeHidden(Element element){
        HTMLVisibleProperty.makeVisibleOrHidden(element,false);
    }
    
    public static void makeVisible(IsElement element){
        makeVisibleOrHidden(element,true);
    }
    
    public static void makeHidden(IsElement element){
        makeVisibleOrHidden(element,false);
    }
    
    static public void makeVisibleOrHidden(HTMLElement element, boolean isVisible) {
        setVisibleProperty(element, isVisible ? VISIBLE : HIDDEN);
    }

    static public void makeVisibleOrHidden(IsElement element, boolean isVisible) {
        setVisibleProperty(element, isVisible ? VISIBLE : HIDDEN);
    }
    
    static public void makeVisibleOrHidden(Element element, boolean isVisible) {
        setVisibleProperty(element, isVisible ? VISIBLE : HIDDEN);
    }
    
    
}