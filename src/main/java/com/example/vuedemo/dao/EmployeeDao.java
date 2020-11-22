package com.example.vuedemo.dao;

import com.example.vuedemo.entities.Employee;
import com.example.vuedemo.entities.EmployeeInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeDao{

	List<EmployeeInfo> findUserInfo();

	List<Employee> findByEmailLike(String email, Integer empId);

	Integer updateEmpById(Employee employee) ;

	void saveEmployee(Employee employee);

	void deleteById(Integer empId);

	Employee getOneEmployee(Integer empId);
}