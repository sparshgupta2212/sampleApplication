package com.spring.sample.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.sample.application.entities.Employee;
import com.spring.sample.application.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAll(); 
		return emps;
	}
	
	public Optional<Employee> getEmployee(int id){
		return employeeRepository.findById(id);
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(Employee emp, int id){
		if(id == emp.getEmployeeId()) {
			employeeRepository.save(emp);
		}
	}
	
	public void deleteEmployeeByID(int id){
		employeeRepository.deleteById(id);
	}
	
	public void patchEmployee(Employee emp, int id) {
		if(id == emp.getEmployeeId()) {
			employeeRepository.save(emp);
		}
	}
}
