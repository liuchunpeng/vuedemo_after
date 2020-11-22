package com.example.vuedemo.service;

import com.example.vuedemo.dao.EmployeeDao;
import com.example.vuedemo.entities.Employee;
import com.example.vuedemo.entities.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<EmployeeInfo> findUserInfo() {
        return employeeDao.findUserInfo();
    }

    @Override
    public List<Employee> findByEmailLike(String email, Integer empId) {
        return employeeDao.findByEmailLike(email,empId);
    }

    @Override
    public Integer updateEmpById(Employee employee) {
        return employeeDao.updateEmpById(employee);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    @Override
    public void deleteById(Integer empId) {
        employeeDao.deleteById(empId);
    }

    @Override
    public Employee getOneEmployee(Integer empId) {
        return employeeDao.getOneEmployee(empId);
    }
}
