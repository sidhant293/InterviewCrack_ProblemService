package com.interviewcrack.problemservice.insecure.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewcrack.problemservice.dto.ProblemsDTO;

@RestController
@RequestMapping("/problemset")
public class ProblemController {
	
	@GetMapping("/all")
	public ProblemsDTO getProblems() {
		System.out.println("getProblems all");
		return null;
	}
}
