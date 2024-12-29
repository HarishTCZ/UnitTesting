package com.harishtcx.UnitTesting.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponseObject> handleUserNotFoundException(UserNotFoundException ex){
        ErrorResponseObject errorResponseObject = new ErrorResponseObject(
                ex.getMessage(),
                HttpStatus.NOT_FOUND.value()
        );
        return new ResponseEntity<>(errorResponseObject,HttpStatus.NOT_FOUND);
    }

}
