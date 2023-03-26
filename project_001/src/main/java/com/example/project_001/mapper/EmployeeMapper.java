package com.example.project_001.mapper;

import com.example.project_001.dto.SignInRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    int employeeSave(SignInRequest signInRequest);
}
