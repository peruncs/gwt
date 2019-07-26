package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * By default Tabulator will try and match the comparison type to the type of element used for the header filter.
 * <p>
 * Standard input elements will use the "like" filter, this allows for the matches to be displayed as the user types.
 * <p>
 * For all other element types (select boxes, check boxes, input elements of type number) an "=" filter type is used.
 * <p>
 * If you want to specify the type of filter used you can pass it to the headerFilterFunc option in the column definition object. This will take any of the standard filters outlined above or a custom function:
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface HeaderFilterFunc {

    /**
     * Standard input elements will use the "like" filter, this allows for the matches to be displayed as the user types.
     *
     * @return
     */
    @JsOverlay
    static HeaderFilterFunc like() {
        return Js.cast("like");
    }

    /**
     * For all other element types (select boxes, check boxes, input elements of type number) an "=" filter type is used.
     *
     * @return
     */
    @JsOverlay
    static HeaderFilterFunc equal() {
        return Js.cast("=");
    }

    @JsOverlay
    static HeaderFilterFunc of(CustomHeaderFilter customHeaderFilter) {
        return Js.cast(customHeaderFilter);
    }

    /**
     * Custom header filter
     */
    @JsFunction
    @FunctionalInterface
    interface CustomHeaderFilter {
        /**
         * @param headerValue- the value of the header filter element.
         * @param rowValue     - the value of the column in this row.
         * @param filterParams - params object passed to the headerFilterFuncParams property.
         * @return true if it passes the filter.
         */
        boolean filter(JsObject headerValue, JsObject rowValue, JsPropertyMap<String> filterParams);

    }
}
