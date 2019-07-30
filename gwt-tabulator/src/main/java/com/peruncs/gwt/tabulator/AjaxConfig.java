package com.peruncs.gwt.tabulator;

import elemental2.core.JsMap;
import jsinterop.annotations.JsType;

/**
 * See https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch
 * <p>
 * Note: You MUST NOT set any of the following options in the advanced config option as they are set by Tabulator and needed for correct operation of the library:
 * <p>
 * url
 * async
 * dataType
 * success
 * error
 * <p>
 * Cross Origin Requests
 * If you are making ajax requests to URL's not on the same origin as your site, Tabulator will attempt to setup the CORS headers for you to allow the request to succeed.
 * <p>
 * Depending on the configuration of the server the request is being made to Tabulator may not be able to guess the correct headers to set for the request to succeed, If this happens you should look at the error presented in the console as it will help you to determine what values need to be set.
 * <p>
 * When trouble shooting an ajax configuration, the following are the key config variables that you will likely need to alter to make the request work (with the default values that Tabulator uses when generating a cors request):
 */
@JsType
public class AjaxConfig {

    /**
     * GET, POST, PUT, DELETE, etc.
     */
    public String method;

    public JsMap<String, String> headers;

    /**
     * CORS mode
     */

    public String mode;

    /**
     * Credentials. See Fetch API docs.
     */
    String credentials;
}
