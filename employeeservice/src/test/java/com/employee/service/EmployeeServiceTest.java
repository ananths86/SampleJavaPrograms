package com.employee.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.employee.entity.EmployeeEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
"classpath:employee-servlet.xml"})
public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void testCreateEmployee() {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setEmployeeId("964");
		entity.setEmployeeDesignation("Technical Lead");
		entity.setEmployeeName("Ananth");
		entity.setEmployeeSalary("5K");
		employeeService.createEmployee(entity);
	}

}
