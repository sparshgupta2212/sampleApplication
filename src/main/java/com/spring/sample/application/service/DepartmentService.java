package com.spring.sample.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.sample.application.entities.Department;
import com.spring.sample.application.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments(){
		List<Department> depts = (List<Department>)departmentRepository.findAll(); 
		return depts;
	}
	
	public Optional<Department> getDepartment(int id){
		return departmentRepository.findById(id);
	}
	
	public void addDepartment(Department department) {
		departmentRepository.save(department);
	}
	
	public void updateDepartment(Department department, int id){
		if(id == department.getDepartmentId()) {
			departmentRepository.save(department);
		}
	}
	
	public void deleteAllDepartment(){
		departmentRepository.deleteAll();
	}
	
	public void deleteDepartmentByID(int id){
		departmentRepository.deleteById(id);
	}

	public void patchDepartment(Department department, int id) {
		if(id == department.getDepartmentId()) {
			departmentRepository.save(department);
		}
	}
}
