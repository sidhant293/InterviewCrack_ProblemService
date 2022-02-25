package com.interviewcrack.problemservice.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(ProxyException.class)
	public ResponseEntity<ErrorInfo> proxyException(ProxyException proxyException){
		ErrorInfo error=populateError("Invalid Token", HttpStatus.UNAUTHORIZED.value());
		return new ResponseEntity<>(error,HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler(ProblemServiceException.class)
	public ResponseEntity<ErrorInfo> problemServiceException(ProblemServiceException problemServiceException){
		ErrorInfo error=populateError("Can't do it now", HttpStatus.UNAUTHORIZED.value());
		return new ResponseEntity<>(error,HttpStatus.UNAUTHORIZED);
	}
	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorInfo> generalException(Exception exception){
//		ErrorInfo error=null;
//		System.out.println("Exception print "+exception.getMessage()+" || "+exception.getLocalizedMessage());
//		if(exception.getLocalizedMessage().contains("ProxyException")) {
//			System.out.println("contains works");
//			error=populateError("Invalid Token", HttpStatus.UNAUTHORIZED.value());
//			return new ResponseEntity<>(error,HttpStatus.UNAUTHORIZED);
//		}
//		error=populateError("Request can't be processed due to some error", HttpStatus.INTERNAL_SERVER_ERROR.value());
//		return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
//	}

	
	private ErrorInfo populateError(String message,Integer errorCode) {
		ErrorInfo error=new ErrorInfo();
		error.setErrorMessage(message);
		error.setErrorCode(errorCode);
		error.setTimestamp(LocalDateTime.now());
		return error;
	}
}
