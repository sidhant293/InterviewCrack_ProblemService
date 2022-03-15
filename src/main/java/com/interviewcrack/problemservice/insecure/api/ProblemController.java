package com.interviewcrack.problemservice.insecure.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<ProblemDTO> getAllProblems(@RequestParam int pageNo,@RequestParam int pageSize) throws ProblemServiceException {
		if(pageSize>20) pageSize=20;
		return problemService.getAllProblems(pageNo,pageSize);
	}
}
