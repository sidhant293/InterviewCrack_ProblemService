package com.interviewcrack.problemservice.exception;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorInfo {
	private String errorMessage;
	private Integer errorCode;
	private LocalDateTime timestamp;
}
