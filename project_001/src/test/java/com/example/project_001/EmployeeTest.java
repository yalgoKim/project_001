package com.example.project_001;

import com.example.project_001.dto.SignInRequest;
import com.example.project_001.service.EmployeeService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeTest {

    @Autowired
    private EmployeeService employeeService;
    @Test
    @DisplayName("회원 가입 로직")
    void employeeSave(){
        SignInRequest signInRequest = new SignInRequest();
        signInRequest.setName("test");
        signInRequest.setEmail("test");
        signInRequest.setGrade("test");
        signInRequest.setPhone_number("1234");
        employeeService.employeeSave(signInRequest);

    }
}
