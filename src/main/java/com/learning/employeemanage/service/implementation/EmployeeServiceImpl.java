package com.learning.employeemanage.service.implementation;

import com.learning.employeemanage.exception.UserNotFoundException;
import com.learning.employeemanage.model.Employee;
import com.learning.employeemanage.repository.EmployeeRepo;
import com.learning.employeemanage.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;


    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}
