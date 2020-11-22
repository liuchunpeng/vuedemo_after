package com.example.vuedemo.service;

import com.example.vuedemo.entities.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
}
