package com.springJpatwo.springjpa;

import com.springJpatwo.springjpa.entities.Employee;
import com.springJpatwo.springjpa.entities.Salary;
import com.springJpatwo.springjpa.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeTesting {
    @Autowired
    EmployeeRepository repository;
    @Test
    public void testCreateEmployee()
    {
        Employee employee=new Employee();
        employee.setId(10);
        employee.setFirstName("Ayush");
        employee.setLastName("Sharma");
        employee.setAge(23);
        Salary salary=new Salary();
        salary.setBasicSalary(150000.00);
        salary.setBonusSalary(5000.00);
        salary.setTaxAmount(2000.00);
        salary.setSpecialAllowanceSalary(15000.00);
        employee.setSalary(salary);
     repository.save(employee);
    }

}