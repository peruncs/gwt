package com.peruncs.gwt.jwt.auth0;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(isNative = true)
public class WebAuth {

    public Authentication client;
    public Popup popup;
    public Redirect redirect;
    public CrossOriginAuthentication crossOriginAuthentication;

    @JsConstructor
    public WebAuth(AuthOptions options) {
    }


    public native void authorize(AuthorizeOptions options);

    public native void parseHash(Auth0Callback<Auth0ParseHashError,Auth0DecodedHash> callback);

    public native void parseHash(ParseHashOptions options, Auth0Callback<Auth0ParseHashError,Auth0DecodedHash> callback);

    public native void validateToken(String token, String nonce, Auth0Callback<Auth0Error,Any> callback);

    public native void renewAuth(RenewAuthOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void changePassword(ChangePasswordOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void signup(DbSignUpOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void signupAndAuthorize(DbSignUpOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void login(CrossOriginLoginOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void crossOriginAuthenticationCallback();

    public native void logout(LogoutOptions options);

    public native void passwordlessStart(PasswordlessStartOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void passwordlessVerify(PasswordlessVerifyOptions options, Auth0Callback<Auth0Error,Any> callback);

    public native void checkSession(CheckSessionOptions options, Auth0Callback<Auth0Error,Any> callback);

}