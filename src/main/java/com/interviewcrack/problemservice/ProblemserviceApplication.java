package com.interviewcrack.problemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ProblemserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemserviceApplication.class, args);
	}

}
