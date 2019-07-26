package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * Mutator/Accessor params.
 */
@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface MutatorAccessorParams {

    @JsOverlay
    static MutatorAccessorParams of(JsPropertyMap<String> params) {
        return Js.cast(params);
    }

    @JsOverlay
    static MutatorAccessorParams of(Lookup paramLookup) {
        return Js.cast(paramLookup);
    }

    @JsFunction
    @FunctionalInterface
    interface Lookup {
        /**
         * @param origianlCellValue - original value of the cell
         * @param rowData           - the data for the row
         * @param type              - the type of mutation occurring (data|edit|data|download|clipboard)
         * @param component         - when the "type" argument is "edit", this contains the cell component for the edited cell, otherwise it is the column component for the column
         * @return params
         */
        JsPropertyMap<String> paramLookup(JsObject origianlCellValue, JsObject rowData, String type, BaseComponent component);
    }

}
