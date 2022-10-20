package com.ttnemployee.Employeerestapi.employee;



import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class Employee {
    /* Using lombok project to generate getter and setter.
       using spring validator to validate id,age and name.
       Apply validation while create a new employee using POST http Request.*/
    @NotNull
   @Getter @Setter private int id;

    @NotNull    // age should not be null
    @Min(18)  // Minimum age 18
    @Getter @Setter private int age;
    @NotBlank
    @Getter @Setter private String name;


    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


}
