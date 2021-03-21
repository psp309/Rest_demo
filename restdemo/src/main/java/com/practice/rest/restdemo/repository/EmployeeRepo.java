package com.practice.rest.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.rest.restdemo.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
