package com.interviewcrack.problemservice.secure.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Test {

	@GetMapping("/test")
	public String testFucntion(@RequestHeader(value="Authorization") String token) {
		return "ACTIVE";
	}
	
}
