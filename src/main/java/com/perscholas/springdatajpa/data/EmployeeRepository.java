package com.perscholas.springdatajpa.data;

import com.perscholas.springdatajpa.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
