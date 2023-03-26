package com.example.project_001.util;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(BindException.class) @Order(value = Ordered.HIGHEST_PRECEDENCE)
    public Response<?> validationBindException(BindException e) {
        if(e.getAllErrors().get(0) != null) {
            String defaultMessage = e.getAllErrors().get(0).getDefaultMessage();
            return Response.builder(defaultMessage , 405).build();
        } else {
            return Response.builder("알맞은 값을 입력하세요." , 405).build();
        }
    }
}
