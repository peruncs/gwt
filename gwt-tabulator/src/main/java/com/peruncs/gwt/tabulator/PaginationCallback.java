package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;

/**
 * Page Loaded.
 * <p>
 * pageno - the number of the loaded page.
 * <p>
 * Whenever a page has been loaded, the pageLoaded callback is called, passing the current page number as an argument.
 */
@JsFunction
@FunctionalInterface
public interface PaginationCallback {
    void onPage(int pageNo);
}
