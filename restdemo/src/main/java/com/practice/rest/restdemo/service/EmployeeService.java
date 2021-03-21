package com.practice.rest.restdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.practice.rest.restdemo.entity.Employee;
import com.practice.rest.restdemo.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	private List<Employee> allEmployees;
	public EmployeeService() {

		allEmployees= new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Pooja");
		emp1.setSalary(7000);
		allEmployees.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Komal");
		emp2.setSalary(7000);
		allEmployees.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Smita");
		emp3.setSalary(8000);
		allEmployees.add(emp3);
		
		Employee emp4 = new Employee();
		emp4.setId(4);
		emp4.setName("Kunal");
		emp4.setSalary(9000);
		allEmployees.add(emp4);
	}
	
	public List<Employee> getAllEmployees() {
		
		//return allEmployees;
		return employeeRepo.findAll();
	}
	
	public String saveEmployee(Employee employee) {
			//allEmployees.add(employee);			 
			employeeRepo.save(employee); 
			return "Employee successfully added";
	}
}
