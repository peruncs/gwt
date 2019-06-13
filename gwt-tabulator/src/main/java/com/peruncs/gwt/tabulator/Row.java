package com.peruncs.gwt.tabulator;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface Row {
    /**
     * You can freeze a row at the top of the table by calling the freeze function on the Row Component of any row. This will insert the row above the scrolling portion of the table in the table header.
     */
    void freeze();

    /**
     * A frozen row can be unfrozen using the unfreeze function on the Row Component of any row. This will remove the row from the table header and re-insert it back in the table.
     */
    void unfreeze();
}
