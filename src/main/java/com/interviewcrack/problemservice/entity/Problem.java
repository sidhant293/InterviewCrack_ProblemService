package com.interviewcrack.problemservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.interviewcrack.problemservice.dto.ProblemDTO;
import com.interviewcrack.problemservice.dto.TagDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="problems")
@Data
@NoArgsConstructor
public class Problem {

	@Id
	private int problemId;
	private String problemName;
	private String problemDifficulty;
	
	@JsonManagedReference
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name="problem_tags",
			joinColumns = { @JoinColumn(name="problem_id") },
			inverseJoinColumns = { @JoinColumn(name="tag_id") }
			)
	private List<Tag> tags;
	
	public ProblemDTO convertToDTO() {
		ProblemDTO dto=new ProblemDTO();
		dto.setId(problemId);
		dto.setDifficulty(problemDifficulty);
		dto.setName(problemName);
		
		List<TagDTO> tagDTOs=new ArrayList<>();
		tags.forEach(tag-> tagDTOs.add(tag.convertToDTO()));
		
		dto.setTags(tagDTOs);
		return dto;
	}
}
