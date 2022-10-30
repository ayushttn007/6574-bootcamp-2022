package com.springJpatwo.springjpa.repos;

import com.springJpatwo.springjpa.entities.Employees;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeesRepository extends CrudRepository<Employees,Integer> {

    //Display the first name, last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
    @Query("select firstName, lastName from Employees where Salary > (select avg(Salary) from Employees) ORDER BY age ASC, Salary DESC")
    List<Object[]> findAllEmpSalLessthanAvg();


    /*Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.*/

 // ----------UPDATE AND DELETE ARE NOT WORKED USING JPQL---------------;

  @Modifying
    @Query("UPDATE Employees SET Salary=:Salary where Salary < (select avg(Salary) from Employees)")
    List<Employees> updateEmpSallessthanAvg(@Param("Salary") long Salary);

    @Modifying
    @Query("delete from Employees where Salary = (select min(Salary)  from (select * from Employees))")
    void deleteEmpbyMinSal();


    /* NATIVE QUERIES*/

    // Display the id, first name, age of all employees where last name ends with "singh"
    @Modifying
    @Query(value="select id,fname,age from employees where lname like '%Singh'",nativeQuery = true)
    List<Object[]> findAlllikeEmployees();

    //Delete all employees with age greater than 45(Should be passed as a parameter)

    @Modifying
    @Query(value = "delete from employees where age>:age", nativeQuery = true)
    void deleteEmpByAge(@Param("age") int age);

}
