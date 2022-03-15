package com.interviewcrack.problemservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
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
	public List<ProblemDTO> getAllProblems(int pageNo,int pageSize) throws ProblemServiceException {
		
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Problem> page=problemRepo.findAll(pageable);
		
		if(page==null || page.isEmpty()) throw new ProblemServiceException("No problems available",HttpStatus.BAD_REQUEST);
		
		List<Problem> problemsFromDB=page.getContent();
		
		List<ProblemDTO> problemList=new ArrayList<>();
		problemsFromDB.forEach(problem-> problemList.add(problem.convertToDTO()));
		return problemList;
	}
	
}
