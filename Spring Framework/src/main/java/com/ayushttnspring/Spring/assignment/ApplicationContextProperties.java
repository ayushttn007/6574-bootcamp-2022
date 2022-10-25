package com.ayushttnspring.Spring.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Student{
    public int EmployeeId = 20999;
    public String EmployeeName = "Ayush Sharma";
    public String Department = "Software-JVM";


}

@SpringBootApplication
public class ApplicationContextProperties {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApplicationContextProperties.class, args);
        Student student = context.getBean(Student.class);

        System.out.println(student.EmployeeId);
        System.out.println(student.EmployeeName);
        System.out.println(student.Department);
    }

}