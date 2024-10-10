package br.com.fiap.pet_tech.pet_tech.controller.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.Instant;

public class ControllerExceptionError {
  private StandardError err = new StandardError();

  public ResponseEntity<StandardError> entityNotFound(
          ControllerNotFoundException e,
          HttpServletRequest request) {

    HttpStatus status = HttpStatus.NOT_FOUND;

   err.setTimeStamp(Instant.now());
   err.setStatus(status.value());
   err.setError("Entity not found");
   err.setMessage(e.getMessage());
   err.setPath(request.getRequestURI());

   return  ResponseEntity.status(status).body(this.err);
  }
}
