package com.peruncs.gwt.errai;

import com.google.gwt.dom.client.Element;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.HTMLElement;

/**
 * "display" HTML element property helper.
 *
 * @see
 * <a href="https://developer.mozilla.org/en-US/docs/Web/CSS/display">display</a>
 */
public enum HTMLDisplayProperty {

    //TODO: inline-table | table | table-cell | table-column | table-column-group | table-footer-group | table-header-group | table-row | table-row-group  | inline-flex | grid | inline-grid | run-in | ruby | ruby-base | ruby-text | ruby-base-container | ruby-text-container | contents
    DEFAULT(""),
    NONE("none"),
    INLINE("inline"),
    BLOCK("block"),
    INITIAL("initial"),
    INHERIT("inherit"),
    LIST_ITEM("list-item"),
    INLINE_LIST_ITEM("inline-list-item"),
    INLINE_BLOCK("inline-block"),
    FLEX("flex"),;

    public final static String PROPERTY_NAME = "display";
    public final String value;

    HTMLDisplayProperty(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    //Convinience methods 
    public static boolean isShown(HTMLElement element) {
        return !isHidden(element);
    }

    public static boolean isHidden(HTMLElement element) {
        return element.getStyle().getPropertyValue(PROPERTY_NAME).equals(NONE.value);
    }


    public static HTMLDisplayProperty getDisplayProperty(HTMLElement element) {
        return HTMLDisplayProperty.valueOf(element.getStyle().getPropertyValue(PROPERTY_NAME));
    }
    
    public static HTMLDisplayProperty getDisplayProperty(IsElement element) {
        return getDisplayProperty(element.getElement());
    }

    public static void setDisplayProperty(HTMLElement element, HTMLDisplayProperty display) {
        element.getStyle().setProperty(PROPERTY_NAME, display.value);
    }

    public static void setDisplayProperty(IsElement element, HTMLDisplayProperty display) {
        setDisplayProperty(element.getElement(), display);
    }
    
    public static void setDisplayProperty(Element element, HTMLDisplayProperty display) {
        element.getStyle().setProperty(PROPERTY_NAME, display.value);
    }

    public static void unsetDisplayProperty(HTMLElement element) {
        element.getStyle().removeProperty(PROPERTY_NAME);
    }

    public static void unsetDisplayProperty(IsElement element) {
        unsetDisplayProperty(element.getElement());
    }
    
    public static void unsetDisplayProperty(Element element) {
        element.getStyle().clearProperty(PROPERTY_NAME);
    }

    public static void setToDefaultDisplayProperty(HTMLElement element) {
        setDisplayProperty(element, DEFAULT);
    }

    public static void setToDefaultDisplayProperty(IsElement element) {
        setToDefaultDisplayProperty(element.getElement());
    }
    
     public static void setToDefaultDisplayProperty(Element element) {
         setDisplayProperty(element, DEFAULT);
    }

    public static void show(HTMLElement element) {
        unsetDisplayProperty(element);
    }
    
    public static void show(IsElement element) {
        showOrHide(element, true);
    }

     public static void show(Element element) {
        unsetDisplayProperty(element);
    }
    
    public static void hide(HTMLElement element) {
        showOrHide(element, false);
    }

    public static void hide(Element element) {
        showOrHide(element, false);
    }

    public static void hide(IsElement element) {
        showOrHide(element, false);
    }

    public static void showOrHide(HTMLElement element, boolean show) {
        setDisplayProperty(element, show ? DEFAULT : NONE);
    }

    public static void showOrHide(IsElement element, boolean show) {
        setDisplayProperty(element, show ? DEFAULT : NONE);
    }
    
    public static void showOrHide(Element element, boolean show) {
        setDisplayProperty(element, show ? DEFAULT : NONE);
    }
    
}
