package com.kyepot.tutorial.Attribute.Exceptions;

import org.springframework.http.HttpStatus;

public class CustomizeException extends RuntimeException {
  private static final long serialVersionUID = -2854058020627561845L;
  
  private final Integer status;
  private final HttpStatus statusCode;

  public CustomizeException(String message,
      HttpStatus statusCode) {
    super(message);
    this.status = statusCode.value();
    this.statusCode = statusCode;
  }

  public Integer getStatus() {
    return status;
  }

  public HttpStatus getStatusCode() {
    return statusCode;
  }

}
