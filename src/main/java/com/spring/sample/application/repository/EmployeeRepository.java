package com.spring.sample.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.sample.application.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
