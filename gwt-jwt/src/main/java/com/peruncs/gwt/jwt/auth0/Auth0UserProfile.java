package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType
public class Auth0UserProfile {
    public String name;
    public String nickname;
    public String picture;
    public String user_id;
    public String username;
    public String given_name;
    public String family_name;
    public String email;
    public boolean email_verified;
    public String clientID;
    public String gender;
    public String locale;
    public Auth0Identity[] identities;
    public String created_at;
    public String updated_at;
    public String sub;
    public Any user_metadata;
    public Any app_metadata;

    //MicrosoftUserProfile
    public String[]  emails;

    //Office365UserProfile
    public String tenantid;
    public String upn;

    //AdfsUserProfile
    public String issuer;
}
