package com.springboot.springbootJPA;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Controller
@Component
public class DBOperationRunner implements CommandLineRunner {

	@Autowired
	// EmployeeRepository eRepo;
	EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub

		// creating data
		employeeRepository.saveAll(Arrays.asList(

				new Employee(1001, "James", 2599.5, "HR"), new Employee(1002, "Elizabeth", 2999.0, "Admin"),
				new Employee(1003, "Robert", 2699.5, "Testing"), new Employee(1004, "Victoria", 3000.5, "Development"),
				new Employee(1005, "David", 2650.5, "QA"), new Employee(1006, "Isabel", 2590.0, "Support"),
				new Employee(1007, "Michael", 3599.75, "Development"), new Employee(1008, "Maria", 2499.0, "Finance"),
				new Employee(1009, "Thomas", 2799.25, "HR"), new Employee(1010, "Maria", 2899.5, "Development"))

		);

		// update the data using FindBy ID
//		Optional<Employee> optional = employeeRepository.findById(1001);
//		Employee employee = optional.get();
//
//		employee.setEmpName("gaurav");
//		Employee result = employeeRepository.save(employee);
//		System.out.println(result);
//		
//		
		// how to get data
//	Iterable<Employee>	itr = employeeRepository.findAll();
//	
//	 itr.forEach(employee->{System.out.println(employee);});

		// deleted the user elements
//		employeeRepository.deleteById(1001);
//		System.out.println("deleted....");
		
//		List<Employee> itr	= employeeRepository.findByempName("David");
//		itr.forEach(e->{System.out.println(e);});
//		
//		List<Employee> itr	= 	employeeRepository.findByempIdAndempSal(1007, 3599.75);
//		itr.forEach(e->{System.out.println(e);});
//		
	}

}
