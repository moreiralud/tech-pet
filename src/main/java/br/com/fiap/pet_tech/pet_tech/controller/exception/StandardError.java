package br.com.fiap.pet_tech.pet_tech.controller.exception;

import java.time.Instant;

public class StandardError {
  private Instant timeStamp;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  private Integer status;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  private String message;
  private String error;
  private String path;

  public Instant getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Instant timeStamp) {
    this.timeStamp = timeStamp;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
