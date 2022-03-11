package com.interviewcrack.problemservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.interviewcrack.problemservice.dto.ProblemDTO;
import com.interviewcrack.problemservice.entity.Problem;
import com.interviewcrack.problemservice.exception.ProblemServiceException;
import com.interviewcrack.problemservice.repository.ProblemRepo;
import com.interviewcrack.problemservice.service.ProblemService;

@Service
@Transactional
public class ProblemServiceImpl implements ProblemService{

	@Autowired
	private ProblemRepo problemRepo;
	
	@Override
	public List<ProblemDTO> getAllProblems() throws ProblemServiceException {
		Iterable<Problem> problemsFromDB=problemRepo.findAll();
		if(problemsFromDB==null) throw new ProblemServiceException("No problems available");
		
		List<ProblemDTO> problemList=new ArrayList<>();
		problemsFromDB.forEach(problem-> problemList.add(problem.convertToDTO()));
		return problemList;
	}
	
}
