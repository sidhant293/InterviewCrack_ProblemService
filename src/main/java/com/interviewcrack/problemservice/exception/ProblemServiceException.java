package com.interviewcrack.problemservice.exception;

import org.springframework.http.HttpStatus;

public class ProblemServiceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1103146672674359314L;
	private HttpStatus errorStatus;
	
	public ProblemServiceException() {
		super();
	}
	
	public ProblemServiceException(String message) {
		super(message);
	}
	
	public ProblemServiceException(String message,HttpStatus errorStatus) {
		super(message);
		this.errorStatus=errorStatus;
	}
	
	public HttpStatus getErrorStatus() {
		return errorStatus;
	}
}
