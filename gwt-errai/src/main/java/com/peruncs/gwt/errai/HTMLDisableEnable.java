package com.peruncs.gwt.errai;

import org.jboss.errai.common.client.dom.HTMLElement;

public interface HTMLDisableEnable {

    //TODO: fix after this has been addressed: https://issues.jboss.org/browse/ERRAI-934
    static void disable(HTMLElement element) {
        element.getClassList().remove("enabled");
        element.getClassList().add("disabled");
    }

    //TODO: fix after this has been addressed: https://issues.jboss.org/browse/ERRAI-934
    static void enable(HTMLElement element) {
        element.getClassList().remove("disabled");
        element.getClassList().add("enabled");
    }
    
    static void toggle(HTMLElement element, boolean enable) {
        if(enable)
            enable(element);
        else
            disable(element);
    }
    
}
