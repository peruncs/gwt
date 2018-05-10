package com.peruncs.gwt.stripe;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 * Stripe transaction token.
 */
@JsType(isNative = true, name = "Object", namespace = GLOBAL)
public class Token {

    @JsProperty
    public String id;

    /**
     * Type of the token: card or bank_account.
     */
    @JsProperty
    public String type;

    @JsProperty
    public BankAccount bank_account;

    @JsProperty
    public Card card;

    @JsProperty
    public String client_ip;

    @JsProperty
    public String created;

    @JsProperty
    public boolean livemode;

    /**
     * Whether or not this token has already been used (tokens can be used only once)
     */
    @JsProperty
    public boolean used;

    @JsOverlay
    @Override
    final public String toString() {
        return "Token{" + "id=" + id + ", type=" + type + ", bank_account=" + bank_account + ", card=" + card + ", client_ip=" + client_ip + ", created=" + created + ", livemode=" + livemode + ", used=" + used + '}';
    }

}
