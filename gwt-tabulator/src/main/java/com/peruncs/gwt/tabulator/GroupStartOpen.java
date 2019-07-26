package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface GroupStartOpen {
    /**
     * @param allGroupsStartOpen - true - all groups start open (default value). false - all groups start closed
     * @return
     */
    @JsOverlay
    static GroupStartOpen of(boolean allGroupsStartOpen) {
        return Js.cast(allGroupsStartOpen);
    }

    @JsFunction
    @FunctionalInterface
    interface GroupOpenFunc {
        /**
         * Decide to start with open or closed groups.
         *
         * @param value- the value all members of this group share.
         * @param count  - the number of rows in this group.
         * @param data   - an array of all the row data objects in this group.
         * @param group  - the group component for the group.
         * @return true if all groups should start open, flase - should start closed.
         */
        boolean groupOpen(JsObject value, int count, JsObject[] data, GroupComponent group);
    }

    @JsOverlay
    static GroupStartOpen of(GroupOpenFunc groupOpenFunc) {
        return Js.cast(groupOpenFunc);
    }
}
