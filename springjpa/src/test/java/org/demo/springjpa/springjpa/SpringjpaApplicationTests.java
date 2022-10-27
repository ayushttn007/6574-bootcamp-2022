package org.demo.springjpa.springjpa;

import org.demo.springjpa.springjpa.Employee.Employee;
import org.demo.springjpa.springjpa.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringjpaApplicationTests {
    @Autowired
	EmployeeRepository repository ;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testEmployeeCreate(){
		Employee employee = new Employee();
		employee.setName("Ayush Jain");
		employee.setId(6577);
		employee.setAge(21);
		employee.setLocation("Noida sector 16");
            repository.save(employee);
	}


	@Test
	public void testEmployeeRead() {
		Employee employee = repository.findById(6574).get();
		assertNotNull(employee);
		assertEquals("Ayush Sharma", employee.getName());
		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + employee.getLocation());
	}

	@Test
	public void testEmployeeUpdate() {
		Employee employee = repository.findById(6574).get();
		employee.setAge(22);
		repository.save(employee);

	}
	@Test
	public void testEmployeeDelete() {
		if (repository.existsById(6570)) {
			System.out.println("Deleting an Employee");
			repository.deleteById(6570);
		}
	}


	@Test
	public void testEmployeeCount() {
	System.out.println("Total Employees: " + repository.count());

	}

	@Test
	public void testEmployeeFindAllPagingAndSorting() {
		PageRequest pageable =  PageRequest.of(0, 2, Sort.Direction.ASC,"age");
		repository.findAll(pageable).forEach(p->System.out.println(p));

	}
	@Test
	public void testEmployeeFindByName(){
		List<Employee> employee = repository.findByName("Ayush Sharma");
		assertNotNull(employee);

	}

	@Test
	public void testEmployeeFindByNameLike(){
		List<Employee> employee = repository.findByNameLike("A%");
		System.out.println("Employee: "+ employee);
		assertNotNull(employee);
	}

	@Test
	public void testEmployeeFindByAgeBetween(){
		List<Employee> employee = repository.findByAgeBetween(20,22);
		System.out.println("Employee: "+ employee);
		assertNotNull(employee);
	}

}
