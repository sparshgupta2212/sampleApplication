package com.spring.sample.application.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sample.application.entities.Employee;


@RestController
public class EmployeeController {
	

	@Autowired
	private com.spring.sample.application.service.EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return employeeService.getEmployee(id);
	}
	
	@PostMapping("/employees")
	public void addEmployees(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}

	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable int id){
		employeeService.updateEmployee(employee, id);
	}
	
	@DeleteMapping("employees/{id}")
	public void deleteEmployeeByID(@RequestBody Employee employee, @PathVariable int id){
		employeeService.deleteEmployeeByID(id);
	}

	@PatchMapping("employees/{id}")
	public void patchEmployeeByID(@RequestBody Employee employee, @PathVariable int id) {
		employeeService.patchEmployee(employee, id);
	}
}
