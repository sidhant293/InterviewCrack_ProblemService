package com.interviewcrack.problemservice.service;

import java.util.List;

import com.interviewcrack.problemservice.dto.ProblemDTO;
import com.interviewcrack.problemservice.exception.ProblemServiceException;

public interface ProblemService{
	public List<ProblemDTO> getAllProblems(int pageNo,int pageSize) throws ProblemServiceException;
}
