package com.springJpatwo.springjpa.repos;

import com.springJpatwo.springjpa.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}