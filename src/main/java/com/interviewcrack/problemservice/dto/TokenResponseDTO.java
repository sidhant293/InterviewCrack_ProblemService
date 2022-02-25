package com.interviewcrack.problemservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TokenResponseDTO {

	private String token_use;
	private String auth_time;
	private String exp;
	private String iat;
	private String username;
}
