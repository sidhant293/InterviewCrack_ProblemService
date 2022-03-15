package com.interviewcrack.problemservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.interviewcrack.problemservice.entity.Problem;

@Repository
public interface ProblemRepo extends PagingAndSortingRepository<Problem, Integer>{

}
