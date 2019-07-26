package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface GroupBy {

    /**
     * A single group field name.
     *
     * @param groupByField
     * @return
     */
    @JsOverlay
    static GroupBy of(String groupByField) {
        return Js.cast(groupByField);
    }

    /**
     * Arraof group fields.
     *
     * @param groupByFields
     * @return
     */
    @JsOverlay
    static GroupBy of(String[] groupByFields) {
        return Js.cast(groupByFields);
    }

    /**
     * a function that returns a string that represents the group.
     *
     * @return
     */
    @JsOverlay
    static GroupBy of(CallbackRet1<String, JsObject> callBack) {
        return Js.cast(callBack);
    }

}
