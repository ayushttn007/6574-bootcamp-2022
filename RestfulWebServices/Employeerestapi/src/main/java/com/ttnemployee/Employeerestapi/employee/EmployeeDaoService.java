package com.ttnemployee.Employeerestapi.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


/*Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.*/
@Component
public class EmployeeDaoService {
    private  static  List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(6574, 23,"Ayush Sharma"));
        employees.add(new Employee(6547, 21, "Sizuka"));
        employees.add(new Employee(6444, 23,"Naruto"));
        employees.add(new Employee(7544, 20, "Sasuka"));
        employees.add(new Employee(0574, 24,"Kawaski"));
        employees.add(new Employee(1540, 28, "Rimuru"));
    }

    public  List<Employee> getemployees(){
        return employees;
    }

    public Employee getEmployee(int id){
        Predicate<? super Employee> predicate = Employee -> Employee.getId() == id;
        return employees.stream().filter(predicate).findFirst().orElse(null);

    }

    public Employee addEmployee(Employee employee){
        employee.setId(employee.getId());
        employees.add(employee);
        return employee;
    }

    public void deleteEmployeeById(int id) {
        Predicate<? super Employee> predicate = Employee -> Employee.getId() == id;
        employees.removeIf(predicate);
    }


    public void updateEmployee(int id , Employee updateEmployee) {
        Employee emp = getEmployee(id);
       emp.setAge(updateEmployee.getAge());
       emp.setName(updateEmployee.getName());

    }


}
