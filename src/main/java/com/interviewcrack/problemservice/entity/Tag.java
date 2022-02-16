package com.interviewcrack.problemservice.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tags")
@Data
@NoArgsConstructor
public class Tag {

	@Id
	private int tagId;
	private String tagName;
	
	@JsonBackReference
	@ManyToMany(mappedBy = "tags")    //mappedBy is name of field in problem entity
	private List<Problem> problems;
}
