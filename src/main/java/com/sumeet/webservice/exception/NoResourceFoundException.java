package com.sumeet.webservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NoResourceFoundException extends RuntimeException{
	
	public NoResourceFoundException(String message) {
		super(message);
	}
	

}
