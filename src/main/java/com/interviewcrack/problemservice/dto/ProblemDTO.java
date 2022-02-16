package com.interviewcrack.problemservice.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProblemDTO {
	private int id;
	private String name;
	private String difficulty;
	
	List<TagDTO> tags;
}
