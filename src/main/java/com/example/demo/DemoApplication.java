package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class DemoApplication {

	@GetMapping("/")
	public String welcomeUser(Principal principal) {
		return "Hi " + principal.getName()+ "Welcome to This server demo application";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping("/hello-oauth")
//	public String hello(@AuthenticationPrincipal OidcUser user) {
//		return "Hello, " + user.getFullName();
//	}



//	@GetMapping("/")
//	public String index(@AuthenticationPrincipal Jwt jwt) {
//		return String.format("Hello, %s!", jwt.getSubject());
//	}
//
//	@GetMapping("/message")
//	@PreAuthorize("hasAuthority('SCOPE_message:read')")
//	public String message() {
//		return "secret message";
//	}
//
//	@PostMapping("/message")
//	@PreAuthorize("hasAuthority('SCOPE_message:write')")
//	public String createMessage(@RequestBody String message) {
//		return String.format("Message was created. Content: %s", message);
//	}

}
