package com.bit.oauth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class SecuredController {

	@GetMapping("no")
	public String nonsecuredResource() {
		return "No Security Required.";
	}
	
	@GetMapping("admin")
	public String securedAdminResource(Authentication auth) {
		return "This is a SECURED resource. Authentication: " + auth.getName() + "; Authorities: " + auth.getAuthorities();
	}
	
	@GetMapping("user")
	public String securedUserResource(Authentication auth) {
		return "This is a SECURED resource. Authentication: " + auth.getName() + "; Authorities: " + auth.getAuthorities();
	}
	
}
