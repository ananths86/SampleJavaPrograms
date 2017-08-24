package com.employee.dao;

import com.employee.entity.EmployeeEntity;

public interface EmployeeDAO {

	public void createEmployee(EmployeeEntity employee);
	
	public EmployeeEntity getEmployee(String employeeId);
}
