package com.interviewcrack.problemservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.interviewcrack.problemservice.entity.Tag;

@Repository
public interface TagRepo extends CrudRepository<Tag, Integer>{

}
