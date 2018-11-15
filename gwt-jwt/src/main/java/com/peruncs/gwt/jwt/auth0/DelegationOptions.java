package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;

@JsType
public class DelegationOptions extends LoginOptions {
    public String client_id;
    public String grant_type;
    public String id_token;
    public String refresh_token;
    public String target;
    public String scope;
    public String api_type;
}
