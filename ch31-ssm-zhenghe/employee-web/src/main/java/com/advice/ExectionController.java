package com.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExectionController {

    @ExceptionHandler(RuntimeException.class)
    public String exection(){
        return "error";
    }
}
