package com.example.vuedemo.controller;

import com.example.vuedemo.entities.Department;
import com.example.vuedemo.entities.Employee;
import com.example.vuedemo.entities.EmployeeInfo;
import com.example.vuedemo.service.DepartmentService;
import com.example.vuedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/emps")
    public String list(Model model){
        List<EmployeeInfo> employees = employeeService.findUserInfo();
        model.addAttribute("listEmployee",employees);
        return "/customers/list";
    }
    @GetMapping("/emp")
    public String toAddEmp(Model model){
        List<Department> departments = departmentService.findAll();
        model.addAttribute("depts",departments);
        return "/customers/addEmp";
    }
    @PostMapping("/emp")
    public String addEmp(Employee employee, Model model){
        employeeService.saveEmployee(employee);
        return "redirect:/emps";
    }
    @PostMapping("/modifyEmp")
    public String modifyEmp(Employee employee, Model model){
        employeeService.updateEmpById(employee);
        return "redirect:/emps";
    }
    @PostMapping("/checkEmail")
    @ResponseBody
    public  Boolean checkEmail(@RequestParam("email")String email, @RequestParam("empId")Integer empId){
        List<Employee> result = employeeService.findByEmailLike(email,empId);
        if (!ObjectUtils.isEmpty(result)){
            return true;
        }
        return false;
    }
    @GetMapping("/delEmp")
    public String delEmp(@RequestParam("empId")Integer empId){
        employeeService.deleteById(empId);
        return "redirect:/emps";
    }
    @GetMapping("/modifyEmp")
    public String toModifyEmp(@RequestParam("empId")Integer empId , Model model){
        Employee employee = employeeService.getOneEmployee(empId);
        List<Department> departments = departmentService.findAll();
        model.addAttribute("depts",departments);
        model.addAttribute("emp",employee);
        return "/customers/modifyEmp";
    }

}
