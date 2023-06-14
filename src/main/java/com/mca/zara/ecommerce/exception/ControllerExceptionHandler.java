package com.mca.zara.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {
	
		
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<String> handleBadRequest(EntityNotFoundException ex,HttpServletRequest request) {
		 return new ResponseEntity("You gave an incorrect value for ....", HttpStatus.NOT_FOUND);
	}
	

		
	@ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handleException(HttpMessageNotReadableException exception, HttpServletRequest request) {
        return new ResponseEntity("You gave an incorrect value for ....", HttpStatus.BAD_REQUEST);
    }
	
	
}
