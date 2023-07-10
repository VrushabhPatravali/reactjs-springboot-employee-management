package com.code.springbootemployeemanagement.service;

import com.code.springbootemployeemanagement.model.Employee;
import com.code.springbootemployeemanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.repository = employeeRepository;
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }
}
