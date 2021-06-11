package com.jesaias.project.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public ObjectNotFoundException() {
		super();
	}
	
	public ObjectNotFoundException(String msg,Throwable cause) {
		super(msg,cause);
	}
}
