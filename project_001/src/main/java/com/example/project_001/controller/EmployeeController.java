package com.example.project_001.controller;

import com.example.project_001.dto.SignInRequest;
import com.example.project_001.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class  EmployeeController {


    private final EmployeeService employeeService;

    @GetMapping("/signin")
    public int employeeSave(@RequestBody @Valid SignInRequest signInRequest
    , BindingResult bindingResult) throws BindException {
        if (bindingResult.hasErrors()){
            throw new BindException(bindingResult);
        }
        return employeeService.employeeSave(signInRequest);
    }
}

