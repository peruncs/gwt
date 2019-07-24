package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

@JsFunction
@FunctionalInterface
public interface DownloadReady {
    /**
     *
     * @param fileContents - the unencoded contents of the file
     * @param blob - the blob object for the download
     * @return - must return a blob to proceed with the download, return false to abort download
     */
    Any process(byte[] fileContents, Any blob);
}
