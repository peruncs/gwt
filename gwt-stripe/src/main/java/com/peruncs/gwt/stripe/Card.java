package com.peruncs.gwt.stripe;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 * Stripe Credit Card.
 */
@JsType(isNative = true, name = "Object", namespace = GLOBAL)
public class Card {

    @JsProperty
    public String id;

    @JsProperty
    public String address_city;

    @JsProperty
    public String address_country;

    @JsProperty
    public String address_line1;

    @JsProperty
    public String address_line1_check;

    @JsProperty
    public String address_line2;

    @JsProperty
    public String address_state;

    @JsProperty
    public String address_zip;

    @JsProperty
    public String address_zip_check;

    @JsProperty
    public String brand;

    @JsProperty
    public String country;

    @JsProperty
    public String cvc_check;

    @JsProperty
    public String dynamic_last4;

    @JsProperty
    public int exp_month;

    @JsProperty
    public int exp_year;

    @JsProperty
    public String funding;

    @JsProperty
    public String last4;

    @JsProperty
    public String name;

    @JsProperty
    public String tokenization_method;

    @JsOverlay
    @Override
    final public String toString() {
        return "Card{" + "id=" + id + ", address_city=" + address_city + ", address_country=" + address_country + ", address_line1=" + address_line1 + ", address_line1_check=" + address_line1_check + ", address_line2=" + address_line2 + ", address_state=" + address_state + ", address_zip=" + address_zip + ", address_zip_check=" + address_zip_check + ", brand=" + brand + ", country=" + country + ", cvc_check=" + cvc_check + ", dynamic_last4=" + dynamic_last4 + ", exp_month=" + exp_month + ", exp_year=" + exp_year + ", funding=" + funding + ", last4=" + last4 + ", name=" + name + ", tokenization_method=" + tokenization_method + '}';
    }
}