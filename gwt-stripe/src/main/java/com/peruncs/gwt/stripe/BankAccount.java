package com.peruncs.gwt.stripe;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 * Stripe Bank Account.
 *
 */
@JsType(isNative = true, name = "Object", namespace = GLOBAL)
public class BankAccount {

    @JsProperty
    public String id;

    @JsProperty
    public String account_holder_name;

    @JsProperty
    public String account_holder_type;

    @JsProperty
    public String bank_name;

    @JsProperty
    public String country;

    @JsProperty
    public String currency;

    @JsProperty
    public String fingerprint;

    @JsProperty
    public String last4;

    @JsProperty
    public String routing_number;

    @JsProperty
    public String status;

    @JsOverlay
    @Override
    final public String toString() {
        return "BankAccount{" + "id=" + id + ", account_holder_name=" + account_holder_name + ", account_holder_type=" + account_holder_type + ", bank_name=" + bank_name + ", country=" + country + ", currency=" + currency + ", fingerprint=" + fingerprint + ", last4=" + last4 + ", routing_number=" + routing_number + ", status=" + status + '}';
    }

}
