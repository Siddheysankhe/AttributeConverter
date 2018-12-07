package com.kyepot.tutorial.Attribute.Exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomizedExceptionHandler extends ResponseEntityExceptionHandler{
  
  @ExceptionHandler(CustomizeException.class)
  public ResponseEntity<Object> handleExceptions(CustomizeException ex,
      WebRequest request){
    return new ResponseEntity<>(ex,ex.getStatusCode());
  }
  
}
