package com.Taazaa.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeNotFoundHandler {
	
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String>  handlerEmployee(EmployeeNotFound enf){
		 return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	
	

}
