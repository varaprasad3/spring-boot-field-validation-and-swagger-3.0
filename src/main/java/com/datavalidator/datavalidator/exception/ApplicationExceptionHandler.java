package com.datavalidator.datavalidator.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Map<String, String> studentDefinedExceptionHandler(MethodArgumentNotValidException argumentNotValidException) {
		Map<String, String> errorMap = new HashMap<>() ;
		argumentNotValidException.getBindingResult().getFieldErrors().forEach(error -> errorMap.put(error.getField(), error.getDefaultMessage()));
		
		return errorMap ;
	}
}
