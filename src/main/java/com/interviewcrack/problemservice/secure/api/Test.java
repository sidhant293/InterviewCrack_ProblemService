package com.interviewcrack.problemservice.secure.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


@RestController
@RequestMapping("/api")
@SecurityRequirement(name = "bearerAuth")
public class Test {

	@GetMapping("/test")
	public String testFucntion(@RequestHeader(value="Authorization") @Parameter(hidden = true) String token) {
		return "ACTIVE";
	}
	
}
