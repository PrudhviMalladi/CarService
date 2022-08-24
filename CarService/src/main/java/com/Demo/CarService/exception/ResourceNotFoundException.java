package com.Demo.CarService.exception;

public class ResourceNotFoundException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	
	private ResourceNotFoundException(String message) {
		super(message);
	}
}
