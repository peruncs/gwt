GWT goodies
================
This repository provides GWT/JSInterop/JACL  wrappers for useful and popular JS libraries and utility projects. 
All projects are Apache 2.0 licensed, contributions are welcome!

### JS-Cookie
A wrapper for [JS Cookie](github.com/js-cookie) JS library for easy handling of cookies.
[More ...](gwt-cookies/README.md) 

### Tabulator
A wrapper for the [Tabulator](tabulator.info) JS grid component.
[More ...](gwt-tabulator/README.md)

### Stripe
A Stripe API wrapper.
[More ...](gwt-stripe/README.md)

### UIKIT
A wrapper for the very nice [UiKit](https://getuikit.com/) web site framework.
[More ...](gwt-uikit/README.md)

### reCaptcha
A wrapper for Google reCaptcha.
[More ...](gwt-recaptcha/README.md)

### JWT
A JWT wrapper for various providers (Auth0 for now, Okta and Keycloak to come ...)
[More ...](gwt-jwt/README.md)

### Utils
Utility code used in some of the other modules
[More ...](gwt-utils/README.md)


## How to build

To build all projects:
> gradlew assemble

To build all projects:
> gradlew clean

To deploy all projects into local Maven repository with:
> gradlew publishLocal

You can also build individual projects, for example:
> gradlew -p gwt-jwt assemble
