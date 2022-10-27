package org.demo.springjpa.springjpa.repos;

import org.demo.springjpa.springjpa.Employee.Employee;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {



    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String pattern);
    List<Employee> findByAgeBetween(int StartAge,int EndDate);

}
