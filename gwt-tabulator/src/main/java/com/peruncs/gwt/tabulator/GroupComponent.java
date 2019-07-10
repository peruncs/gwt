package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsType;

/**
 * The group component provides access to a set of grouped rows..
 */
@JsType(isNative = true)
public interface GroupComponent extends BaseComponent {

    /**
     * returns the unique key that is shared between all rows in this group.
     */
    String getKey();

    /**
     * returns an array of RowComponent objects, one for each row in the group.
     */
    RowComponent[] getRows();

    /**
     * returns an array of GroupComponent objects, one for each sub group of this group.
     */
    GroupComponent[] getSubGroups();

    /**
     * returns the GroupComponent for the parent group of this group. if no parent exists, this function will return false.
     */
    GroupComponent getParentGroup();


}
