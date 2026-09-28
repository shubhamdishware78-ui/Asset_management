package com.shubham.asset_management.service;

import com.shubham.asset_management.entity.Employee;
import com.shubham.asset_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public long getTotalEmployees() {
        return employeeRepository.count();
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}