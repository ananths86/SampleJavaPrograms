package com.employee.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeEntity;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void createEmployee(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
		
	}

	public EmployeeEntity getEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
