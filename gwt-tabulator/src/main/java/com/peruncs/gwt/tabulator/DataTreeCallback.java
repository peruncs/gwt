package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * Data tree callback.
 * <p>
 * row - the row component for the expanded row
 * level - the depth of the row in the tree
 * *
 */
@JsFunction
@FunctionalInterface
public interface DataTreeCallback {
    void handleDataTreeRow(RowComponent row, int level);
}
