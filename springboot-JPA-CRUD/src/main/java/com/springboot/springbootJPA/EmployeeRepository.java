package com.springboot.springbootJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByempName(String empName);
	
   // public List<Employee> findByempIdAndempSal(int empId, Double empSal);
}
