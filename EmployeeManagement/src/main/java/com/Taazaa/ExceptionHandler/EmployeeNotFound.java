package com.Taazaa.ExceptionHandler;

public class EmployeeNotFound  extends RuntimeException{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3876836956443789459L;

	public EmployeeNotFound() {
		super();
	}

	public EmployeeNotFound(String msg ) {
	super(msg);
}
}
