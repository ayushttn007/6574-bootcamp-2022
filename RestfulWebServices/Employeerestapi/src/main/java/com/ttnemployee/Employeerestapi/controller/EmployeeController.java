package com.ttnemployee.Employeerestapi.controller;

import com.ttnemployee.Employeerestapi.employee.Employee;
import com.ttnemployee.Employeerestapi.employee.EmployeeDaoService;
import com.ttnemployee.Employeerestapi.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;


@RestController
public class EmployeeController {
/*
    @GetMapping(path = "/")
    public String employee(){
        String employee = "Welcome Ayush";
        return employee;
    }*/
   private EmployeeDaoService service;

   public EmployeeController(EmployeeDaoService service){
       this.service = service;
   }

    /*Implement GET http request for Employee to get list of employees.*/
    /* /employees/{employeeid}*/

    @GetMapping( "/employees")
   public List<Employee> getAllEmployees(){
       return service.getemployees();
   }

   /* Implement GET http request using path variable top get one employee*/

    @GetMapping("/employees/{id}")
    public  Employee getEmployeeById(@PathVariable int id){
      Employee employee =  service.getEmployee(id);
      if(employee == null) throw new UserNotFoundException("User not found");
      return employee;
    }

    /*Implement POST http request for Employee to create a new employee.
        /employees*/
    @PostMapping( "/employees")
    public void createEmployee(@Valid @RequestBody Employee employee){
        service.addEmployee(employee);
    }

    /*Implement DELETE http request for Employee to delete employee By Id*/

    @DeleteMapping("/employees/{id}")
    public  void removeEmployeeById(@PathVariable int id){
        service.deleteEmployeeById(id);
    }

    /*Implement PUT http request for Employee to update employee*/

    @PutMapping("/employees/{id}")
    public  void updateEmployeeById(@PathVariable int id , @RequestBody Employee employee){
        service.updateEmployee(id, employee);
    }


}
