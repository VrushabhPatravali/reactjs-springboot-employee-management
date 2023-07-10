package com.code.springbootemployeemanagement.controller;

import com.code.springbootemployeemanagement.model.Employee;
import com.code.springbootemployeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private EmployeeService service;

    public EmployeeController (EmployeeService employeeService) {
        this.service=employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return service.findAll();
    }
}
