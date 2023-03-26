package com.example.project_001.service;

import com.example.project_001.dto.SignInRequest;
import com.example.project_001.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeMapper employeeMapper;
    private static int IDX = 000;

    @Override
    public int employeeSave(SignInRequest signInRequest) {
        IDX = IDX + 1 ;
        signInRequest.setIdx(IDX);
        return employeeMapper.employeeSave(signInRequest);
    }
}
