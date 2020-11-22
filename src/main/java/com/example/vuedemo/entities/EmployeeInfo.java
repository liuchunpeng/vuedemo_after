package com.example.vuedemo.entities;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class EmployeeInfo {

    private Integer empId;

    private String lastName;

    private String email;

    //1 male, 0 female
    private Integer gender;

    private String departmentName;

    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
    private Date birth;
}
