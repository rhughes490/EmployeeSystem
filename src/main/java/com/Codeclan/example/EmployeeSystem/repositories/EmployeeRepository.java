package com.Codeclan.example.EmployeeSystem.repositories;

import com.Codeclan.example.EmployeeSystem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
