package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.JsPropertyMap;


@JsType(isNative = true)
public class Authentication {

    public PasswordlessAuthentication passwordless;
    public DBConnection dbConnection;

    @JsConstructor
    public Authentication(AuthOptions authOptions) {
    }

    public native String buildAuthorizeUrl(JsPropertyMap<Object> options);

    public native String buildLogoutUrl(LogoutOptions logoutOptions);

    public native  void loginWithDefaultDirectory(DefaultDirectoryLoginOptions options, Auth0Callback<Auth0Error,Any> callBack);

    public native  void loginWithResourceOwner(ResourceOwnerLoginOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native  void login(DefaultLoginOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native  void oauthToken(JsPropertyMap<?> options, Auth0Callback<Auth0Error,Any> callback);

    public native  void getSSOData(Auth0Callback<Auth0Error,Any> callback);

    public native  void getSSOData(boolean withActiveDirectories, Auth0Callback<Auth0Error,Any> callback);

    public native void userInfo(String accessToken, Auth0Callback<Auth0Error,Auth0UserProfile> callback);

    public native Any delegation(DelegationOptions options, Auth0Callback<Auth0Error,Auth0DelegationToken> callback);

    public native void getUserCountry(Auth0Callback<Auth0Error,CountryCodeOptions> callback);
}
