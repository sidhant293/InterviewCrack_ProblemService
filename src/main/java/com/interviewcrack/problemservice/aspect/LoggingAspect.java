package com.interviewcrack.problemservice.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	public static final Log LOGGER= LogFactory.getLog(LoggingAspect.class);
	
	@Before(value = "execution(* com.interviewcrack.problemservice.secure.api.*.*(..)) || "
			+ "execution(* com.interviewcrack.problemservice.insecure.api.*.*(..)) || "
			+ "execution(* com.interviewcrack.problemservice.proxy.*.*(..))")
	public void beforeFunction(JoinPoint joinPoint) {
		LOGGER.info("About to execute "+joinPoint.getSignature().getName());
	}
	
	@After(value = "execution(* com.interviewcrack.problemservice.secure.api.*.*(..)) || "
			+ "execution(* com.interviewcrack.problemservice.insecure.api.*.*(..)) || "
			+ "execution(* com.interviewcrack.problemservice.proxy.*.*(..))")
	public void afterFunction(JoinPoint joinPoint) {
		LOGGER.info("Execution finished of "+joinPoint.getSignature().getName());
	}
	
	@AfterThrowing(pointcut = "execution(* com.interviewcrack.problemservice.secure.api.*.*(..)) || "
			+ "execution(* com.interviewcrack.problemservice.insecure.api.*.*(..)) || "
			+ "execution(* com.interviewcrack.problemservice.proxy.*.*(..))",throwing = "exception")
	public void afterException(JoinPoint joinPoint, Exception exception) {
		LOGGER.error("Exception in method: "+joinPoint.getSignature().getName()+" Message: "+exception.getMessage(),exception);
	}
}
