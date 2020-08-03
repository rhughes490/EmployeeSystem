package com.Codeclan.example.EmployeeSystem;

import com.Codeclan.example.EmployeeSystem.models.Employee;
import com.Codeclan.example.EmployeeSystem.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeSystemApplicationTests {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee2 = new Employee("John", "john@gmail.com", 32, 123213412);
		employeeRepository.save(employee2);
	}

}
