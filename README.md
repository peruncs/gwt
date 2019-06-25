GWT goodies
================
This repository provides GWT/JSInterop/JACL  wrappers for useful and popular JS libraries and utility projects:

### JS-Cookie
A wrapper for [JS Cookie](github.com/js-cookie) JS library for convient handling of cookies.

### Tabulator
A wrapper for the powerful and very capable  [Tabulator](tabulator.info) JS component.

### Stripe
A Stripe API wrapper.

### UIKIT
A wrapper for the very nice [UiKit](https://getuikit.com/) web site framework.

### reCaptcha
A wrapper for Google reCaptcha wrapper.

### JWT
A JWT wrapper for various providers (Auth0 for now, Okta and Keycloak to come ...)

All projects are Apache 2.0 licensed and provided "AS-IS".



## How to build
You can deploy these project into local Maven repository with:
> gradlew PTML

You can also build individual projects, for example:
> gradlew -p gwt-jwt PTML
