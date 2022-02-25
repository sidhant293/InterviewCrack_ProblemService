package com.interviewcrack.problemservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TokenRequestDTO {

	private String access;
	private String refresh;
}
