package com.peruncs.gwt.stripe;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Stripe transaction token.
 */
@JsType
public class Token {

    @JsProperty
    public String id;

    /**
     * Type of the token: card or bank_account.
     */
    @JsProperty
    public String type;

    /**
     * String representing the object’s type. Objects of the same type share the same value.
     */
    @JsProperty
    public String object;

    /**
     * the bank account.
     */
    @JsProperty
    public BankAccount bank_account;

    /**
     * the card used to make the charge.
     */
    @JsProperty
    public Card card;

    /**
     * IP address of the client that generated the token.
     */
    @JsProperty
    public String client_ip;

    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    @JsProperty
    public String created;


    /**
     * Has the value {@code true} if the object exists in live mode or the value {@code false}, if the object exists in test mode.
     */
    @JsProperty
    public boolean livemode;

    /**
     * Whether or not this token has already been used (tokens can be used only once).
     */
    @JsProperty
    public boolean used;

    @Override
    final public String toString() {
        return "Token{" + "id=" + id + ", type=" + type + ", bank_account=" + bank_account + ", card=" + card + ", client_ip=" + client_ip + ", created=" + created + ", livemode=" + livemode + ", used=" + used + '}';
    }

}
