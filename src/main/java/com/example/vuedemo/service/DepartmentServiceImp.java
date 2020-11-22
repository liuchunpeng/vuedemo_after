package com.example.vuedemo.service;

import com.example.vuedemo.dao.DepartmentDao;
import com.example.vuedemo.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public List<Department> findAll() {
        return departmentDao.findAll();
    }
}
