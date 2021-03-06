package com.perscholas.springdatajpa.data;

import com.perscholas.springdatajpa.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findEmployeeByLastNameContaining(String str);
}
