package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
public interface TreeStartExpandedUnion {

    /**
     * start with an expanded tree (true).
     *
     * @param startWithExpandedTree
     * @return
     */
    @JsOverlay
    static TreeStartExpandedUnion of(boolean startWithExpandedTree) {
        return Js.cast(startWithExpandedTree);
    }

    /**
     * Specify which levels to expand from the top.
     *
     * @param expansionPerLevel
     * @return
     */
    @JsOverlay
    static TreeStartExpandedUnion of(boolean[] expansionPerLevel) {
        return Js.cast(expansionPerLevel);
    }

    @JsOverlay
    static TreeStartExpandedUnion of(Custom custom) {
        return Js.cast(custom);
    }

    @JsFunction
    @FunctionalInterface
    interface Custom {
        boolean shouldExpand(RowComponent row, int level);
    }

}
