package com.example.vuedemo.service;

import com.example.vuedemo.entities.Employee;
import com.example.vuedemo.entities.EmployeeInfo;

import java.util.List;

public interface EmployeeService {
    List<EmployeeInfo> findUserInfo();

    List<Employee> findByEmailLike(String email, Integer empId);

    Integer updateEmpById(Employee employee) ;

    void saveEmployee(Employee employee);

    void deleteById(Integer empId);

    Employee getOneEmployee(Integer empId);
}
