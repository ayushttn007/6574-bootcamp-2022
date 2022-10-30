package com.springJpatwo.springjpa;

import com.springJpatwo.springjpa.entities.Employees;
import com.springJpatwo.springjpa.repos.EmployeesRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringjpaApplicationTests {

	@Autowired
	EmployeesRepository EmpRepo;

	// Employees Create
	@Test
  public 	void EmployeesCreate() {
	/*	// First Employee
     Employees employeeOne = new Employees();
	 employeeOne.setFirstName("Ayush");
	 employeeOne.setLastName("Sharma");
	 employeeOne.setAge(23);
	 employeeOne.setSalary(Long.parseLong("150000"));

	 // Second Employee
		Employees employeeTwo = new Employees();
		employeeTwo.setFirstName("Shubham");
		employeeTwo.setLastName("Singh");
		employeeTwo.setAge(25);
		employeeTwo.setSalary(Long.parseLong("45000"));*/

		// Third Employee
		Employees employeeThird = new Employees();
		employeeThird.setFirstName("Jyoti");
		employeeThird.setLastName("Sharma");
		employeeThird.setAge(19);
		employeeThird.setSalary(Long.parseLong("100000"));

		// Forth Employee
		Employees employeeForth = new Employees();
		employeeForth.setFirstName("Urvashi");
		employeeForth.setLastName("Aggrawal");
		employeeForth.setAge(22);
		employeeForth.setSalary(Long.parseLong("120000"));

		/*EmpRepo.save(employeeOne);
		EmpRepo.save(employeeTwo);*/
		EmpRepo.save(employeeThird);
		EmpRepo.save(employeeForth);
	}



@Test
	public void findEmployeesall(){
		List<Object[]> empdata = EmpRepo.findAllEmpSalLessthanAvg();
	for ( Object[] objects: empdata ) {
		System.out.print(objects[0] + " ");
		System.out.print(objects[1] + " ");
		System.out.println();
	}
	}

	@Test
	@Transactional
	public void  updateEmpSallessthanAvg(){
		System.out.println(EmpRepo.updateEmpSallessthanAvg(150000));
	}
	@Test
	@Transactional
	@Rollback(value = false)
	public void deleteEmpMinSal(){
		EmpRepo.deleteEmpbyMinSal();
	}

	@Test
	public void testFindAllFilteredEmployees()
	{
		List<Object[]> empData=EmpRepo.findAlllikeEmployees();
		for(Object[] objects:empData)
		{
			System.out.println("id:" + objects[0]);
			System.out.println("First Name: " + objects[1]);
			System.out.println("Age: " + objects[2]);
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void deleteEmpByAge()
	{
		EmpRepo.deleteEmpByAge(45);
	}


}
