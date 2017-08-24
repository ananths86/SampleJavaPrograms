package com.employee.service;

import com.employee.entity.EmployeeEntity;

public interface EmployeeService {

	public void createEmployee(EmployeeEntity employee);
	
	public EmployeeEntity getEmployee(String id);
}
