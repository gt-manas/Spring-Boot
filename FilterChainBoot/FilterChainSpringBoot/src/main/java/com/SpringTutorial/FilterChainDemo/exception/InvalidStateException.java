package com.SpringTutorial.FilterChainDemo.exception;

public class InvalidStateException extends RuntimeException {
	private static final long serialVersionUID = 430569136177892539L;

	public InvalidStateException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidStateException(String message) {
		super(message);
	}

}
