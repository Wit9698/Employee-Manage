package com.learning.employeemanage.service;


import com.learning.employeemanage.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> findAllEmployees();
    Employee getEmployee(Long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);
}

