package com.SpringTutorial.FilterChainDemo.exception;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(basePackages = {"com.SpringTutorial.FilterChainDemo"} )
public class GlobalControllerExceptionHandler {
	public static final String DEFAULT_ERROR_VIEW = "error";

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error")
	public void rulesForUnHandledError(HttpServletRequest req, Exception e) {
		System.out.println("Unhandled exception in exception handler" + e);
		System.out.println("INTERNAL_SERVER_ERROR : Unhandled exception in exception handler" + e);
	}
	@ExceptionHandler(ServletException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error")
	public void rulesForUnHandledSevletError(HttpServletRequest req, Exception e) {
		System.out.println("Unhandled exception in exception handler" + e);
		System.out.println("INTERNAL_SERVER_ERROR : Unhandled exception in exception handler" + e);
	}

	@ExceptionHandler(HttpMessageConversionException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Bad Request")
	public void rulesForRequestConversionError(HttpServletRequest req, HttpMessageConversionException e) {
		System.out.println("Unhandled exception in exception handler, HttpMessageConversionException" + e);
		System.out.println("BAD_REQUEST : Unhandled exception in exception handler" + e);
	}
	 private static class ErrorResponse {
	        public String message;

	        public ErrorResponse(String message) {
	            this.message = message;
	        }
	    }
}
