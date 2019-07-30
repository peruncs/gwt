package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * Group Visibility Changed.
 * <p>
 * group - group component
 * visible - is group visible (true = visible, false = hidden)
 * <p>
 * The groupVisibilityChanged callback is triggered whenever a group changes between hidden and visible states.
 */
@JsFunction
@FunctionalInterface
public interface GroupedVisibilityChangedCallback {
    void group(GroupComponent group, boolean visible);
}
