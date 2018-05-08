package com.peruncs.gwt.stripe;

import com.peruncs.gwt.utils.Callback;
import com.peruncs.gwt.utils.Callback1;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

/**
 * Stripe configuration settings.
 */
@JsType(isNative = true, name = "Object", namespace = GLOBAL)
public class Settings {

    /**
     * We set some defaults this way as we can not have true constructor.
     * @return this settings
     */
    @JsOverlay
    final public Settings init() {
        allowRememberMe = true;
        locale = "auto";
        currency = "USD";
        return this;
    }

    /**
     * Your publishable key (test or live)
     */
    @JsProperty
    public String key;

    /**
     * The callback to invoke when the Checkout process is complete
     */
    @JsProperty
    public Callback1<Token> token;

    /**
     * The callback to invoke when Checkout is opened (not supported in IE6 and
     * IE7)
     */
    @JsProperty
    public Callback opened;

    /**
     * The callback to invoke when Checkout is closed (not supported in IE6 and
     * IE7). Called after the token callback (for successful tokenizations)
     */
    @JsProperty
    public Callback closed;

    /**
     * A relative or absolute URL pointing to a square image of your brand or
     * product. The recommended minimum size is 128x128px. The supported image
     * types are: .gif, .jpeg, and .png
     */
    @JsProperty
    public String image;

    /**
     * The name of your company or website.
     */
    @JsProperty
    public String name;

    /**
     * A description of the product or service being purchased.
     */
    @JsProperty
    public String description;

    /**
     * The amount (in cents) that's shown to the user. Note that you will still
     * have to explicitly include the amount when you create a charge using the
     * API
     */
    @JsProperty
    public long amount;

    /**
     * The currency of the amount (3-letter ISO code). The default is USD.
     */
    @JsProperty
    public String currency;

    /**
     * The label of the payment button in the Checkout form (e.g. Subscribe, Pay
     * {{amount}}, etc.). If you include {{amount}} in the label value, it will
     * be replaced by a localized version of data-amount. Otherwise, a localized
     * data-amount will be appended to the end of your label. Checkout does not
     * translate custom labels to the user's preferred language.
     */
    @JsProperty
    public String panelLabel;

    /**
     * Specify whether Checkout should validate the billing postal code (true or
     * false). The default is false, but we highly recommend setting to true and
     * enabling declines on verification failures in your account settings.
     */
    @JsProperty
    public boolean zipCode;

    /**
     * Specify whether Checkout should collect the user's billing address (true
     * or false). The default is false.
     */
    @JsProperty
    public boolean billingAddress;

    /**
     * Specify whether Checkout should collect the user's shipping address (true
     * or false). The default is false.
     */
    @JsProperty
    public boolean shippingAddress;

    /**
     * If you already know the email address of your user, you can provide it to
     * Checkout to be pre-filled.
     */
    @JsProperty
    public String email;

    /**
     * The text to be shown on the blue button. Default is Pay with Card.
     * Checkout does not translate custom labels to the user's preferred
     * language. (Only available with the simple integration
     */
    @JsProperty
    public String label;

    /**
     * Specify whether to include the option to "Remember Me" for future
     * purchases (true or false). The default is true.
     */
    @JsProperty
    public boolean allowRememberMe;

    /**
     * Specify whether to accept Bitcoin (true or false). The default is false.
     */
    @JsProperty
    public boolean bitcoin;

    /**
     * Specify whether to accept Alipay ("auto", true, or false). The default is
     * false.
     */
    @JsProperty
    public boolean alipay;

    /**
     * Specify if you need reusable access to the customer's Alipay account
     * (true or false). The default is false.
     */
    @JsProperty
    public boolean alipayReusable;

    /**
     * Specify auto to display Checkout in the user's preferred language, if
     * available. English will be used by default.
     */
    @JsProperty
    public String locale;

}
