package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class AuthOptions extends BaseAuthOptions {
    public Any[] plugins;
    public boolean _disableDeprecationWarnings;
    public boolean _sendTelemetry;
    public Any _telemetryInfo;
}
