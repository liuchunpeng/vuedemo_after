package com.example.vuedemo.dao;

import com.example.vuedemo.entities.Department;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DepartmentDao{
	
	List<Department> findAll();
	
}
