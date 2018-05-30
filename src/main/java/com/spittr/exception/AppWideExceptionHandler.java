package com.spittr.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(DuplicateSpitterException.class)
    public String duplicateSpittleHandler() {
        return "error/duplicate";
    }
}
