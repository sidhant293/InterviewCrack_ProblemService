package com.interviewcrack.problemservice.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TokenValidator {

	@Before(value = "execution(* com.interviewcrack.problemservice.api.*.*(..))")
	public void validateAccessToken() {
		System.out.println("VALIDATOR CALLED");
	}
}
