package com.example.project_001.dto;

import lombok.Data;

import javax.validation.constraints.Pattern;
@Data
public class SignInRequest {

    private int idx;
    private String name;
    private String grade;
    private String email;
    @Pattern(regexp = "" , message = "핸드폰 번호를 입력해주세요/")
    private String phone_number;

}
