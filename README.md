# TRServerDemo2

This is an attempt of implementing the OAuth2.0 Open Id authorization flow through the provider Okta.
Despite properly registering an Okta organization and the application itself, currently the app does not recognize the okta.oauth2.issuer field in the application.properties
file and therefore cannot be properly tested. The redirect uri for login and logout are configured on the okta developer page as localhost:8080/login and localhost:8080.
In order to work, the app also needs to complete the first request for an access token. After that, making a  `$ curl http://localhost:8080/hello-oauth \
   --header "Authorization: Bearer ${accessToken}"`
