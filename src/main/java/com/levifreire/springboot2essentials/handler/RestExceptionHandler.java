package com.levifreire.springboot2essentials.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.levifreire.springboot2essentials.exception.BadRequestException;
import com.levifreire.springboot2essentials.exception.BadRequestExceptionDetails;

@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestException(
			BadRequestException badRequestException) {
		return new ResponseEntity<>(
				BadRequestExceptionDetails.builder()
					.timestamp(LocalDateTime.now())
					.status(HttpStatus.BAD_REQUEST.value())
					.title("Bad Request Exception, Check the Documentation")
					.details(badRequestException.getMessage())
					.developerMessage(badRequestException.getClass().getName())
					.build(), HttpStatus.BAD_REQUEST);

	}
}
