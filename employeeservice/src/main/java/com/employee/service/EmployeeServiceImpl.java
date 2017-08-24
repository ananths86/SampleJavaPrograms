package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeDAO;
import com.employee.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	public void createEmployee(EmployeeEntity employee) {
		
		employeeDAO.createEmployee(employee);
	}

	@Transactional
	public EmployeeEntity getEmployee(String id) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(id);
	}

}
