package com.peruncs.gwt.tabulator;

import jsinterop.annotations.JsFunction;
import jsinterop.base.Any;

/**
 * The downloadReady callback allows you to intercept the download file data before the users is prompted to save the file.
 * In order for the download to proceed the downloadReady callback is expected to return a blob of file to be downloaded.
 * If you would prefer to abort the download you can return false from this callback. This could be useful for example
 * if you want to send the created file to a server via ajax rather than allowing the user to download the file.
 */
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
