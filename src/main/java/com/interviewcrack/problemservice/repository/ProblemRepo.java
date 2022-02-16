package com.interviewcrack.problemservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.interviewcrack.problemservice.entity.Problem;

@Repository
public interface ProblemRepo extends CrudRepository<Problem, Integer>{

}
