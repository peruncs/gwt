package com.peruncs.gwt.tabulator;

import elemental2.core.JsObject;
import jsinterop.annotations.JsFunction;

/**
 * Custom group header.
 */
@JsFunction
@FunctionalInterface
public interface GroupHeader {
    /**
     * @param value- the value all members of this group share.
     * @param count  - the number of rows in this group.
     * @param data   - an array of all the row data objects in this group.
     * @param group  - the group component for the group.
     * @return the contents of the group header
     */
    String groupHeader(JsObject value, int count, JsObject[] data, GroupComponent group);

}
