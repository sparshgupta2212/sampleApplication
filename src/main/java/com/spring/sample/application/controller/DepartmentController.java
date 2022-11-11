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

import com.spring.sample.application.entities.Department;
import com.spring.sample.application.service.DepartmentService;

@RestController
public class DepartmentController {
		
	@Autowired
	private DepartmentService departmentService;
	
		@GetMapping("/departments")
		public List<Department> getAllDepartment(){
			return departmentService.getAllDepartments();
		}

		@GetMapping("/departments/{id}")
		public Optional<Department> getDepartment(@PathVariable int id){
			return departmentService.getDepartment(id);
		}
		
		@PostMapping("/departments")
		public void addDepartment(@RequestBody Department department){
			departmentService.addDepartment(department);
		}

		@PutMapping("/departments/{id}")
		public void updateDepartment(@RequestBody Department department, @PathVariable int id){
			departmentService.updateDepartment(department, id);
		}
		
		@DeleteMapping("/departments")
		public void deleteAllDepartments(){
			departmentService.deleteAllDepartment();
		}

		@DeleteMapping("departments/{id}")
		public void deleteDepartmentByID(@RequestBody Department department, @PathVariable int id){
			departmentService.deleteDepartmentByID(id);
		}
		@PatchMapping("departments/{id}")
		public void patchDepartmentByID(@RequestBody Department department, @PathVariable int id) {
			departmentService.patchDepartment(department, id);
		}
}
