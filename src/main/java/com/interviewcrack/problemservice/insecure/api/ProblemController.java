package com.interviewcrack.problemservice.insecure.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewcrack.problemservice.dto.ProblemDTO;
import com.interviewcrack.problemservice.exception.ProblemServiceException;
import com.interviewcrack.problemservice.service.ProblemService;

@RestController
@RequestMapping("/problemset")
public class ProblemController {
	
	@Autowired
	private ProblemService problemService;
	
	@GetMapping("/all")
	public List<ProblemDTO> getAllProblems() throws ProblemServiceException {
		return problemService.getAllProblems();
	}
}
