package com.interviewcrack.problemservice.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProblemsDTO {

	private List<ProblemDTO> problems;
	private TokenDTO token;
}
