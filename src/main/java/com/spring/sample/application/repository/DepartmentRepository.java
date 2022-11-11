package com.spring.sample.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.sample.application.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department,Integer > {

}
