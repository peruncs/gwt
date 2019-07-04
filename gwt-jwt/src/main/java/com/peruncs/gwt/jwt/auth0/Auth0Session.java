package com.peruncs.gwt.jwt.auth0;

import elemental2.core.Global;
import elemental2.core.JsDate;
import elemental2.dom.DomGlobal;
import elemental2.webstorage.Storage;
import elemental2.webstorage.WebStorageWindow;

final public class Auth0Session {

    final private Storage storage;
    private double timeoutID;


    public Auth0Session() {
        storage = WebStorageWindow.of(DomGlobal.window).localStorage;
        timeoutID = 0;
    }

    final public boolean isAuthenticated() {
        double expiresAt = getExpiresAt();
        return JsDate.now() < expiresAt;
    }

    public void logout() {
        storage.removeItem(Auth0Consts.ACCESS_TOKEN);
        storage.removeItem(Auth0Consts.ID_TOKEN);
        storage.removeItem(Auth0Consts.EXPIRES_AT);
        storage.removeItem(Auth0Consts.SCOPES);
        if (timeoutID > 0) {
            DomGlobal.clearTimeout(timeoutID);
            timeoutID = 0;
        }
    }

    final public void scheduleRenewal(DomGlobal.SetTimeoutCallbackFn fn) {
        double expiresIn = expiresIn();
        if (expiresIn > 0) {
            timeoutID = DomGlobal.setTimeout(fn, expiresIn);
        }
    }

    final public double expiresIn() {
        double expiresAt = getExpiresAt();
        return expiresAt - JsDate.now();
    }

    final public String getAccessToken() {
        return storage.getItem(Auth0Consts.ACCESS_TOKEN);
    }


    final public String getIdToken() {
        return storage.getItem(Auth0Consts.ID_TOKEN);
    }


    public double getExpiresAt() {
        return Global.parseFloat(storage.getItem(Auth0Consts.EXPIRES_AT));
    }


    final public void setSession(Auth0DecodedHash hash) {
        String expiresAt = Global.JSON.stringify(hash.expiresIn * 1000 + new JsDate().getTime());
        storage.setItem(Auth0Consts.ACCESS_TOKEN, hash.accessToken);
        storage.setItem(Auth0Consts.ID_TOKEN, hash.idToken);
        storage.setItem(Auth0Consts.EXPIRES_AT, expiresAt);
        storage.setItem(Auth0Consts.SCOPES, hash.scope);
    }


}
