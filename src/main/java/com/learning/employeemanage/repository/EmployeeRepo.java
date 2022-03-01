package com.learning.employeemanage.repository;

import com.learning.employeemanage.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
