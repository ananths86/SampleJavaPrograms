package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="EMPLOYEE_DET")
@Entity(name="EmployeeEntity")
public class EmployeeEntity {

	@Id
	@Column(name="EMPLOYEE_ID")
	private String employeeId;
	
	@Column(name="EMPLOYEE_NAME")
	private String employeeName;
	
	@Column(name="EMPLOYEE_DESIGNATION")
	private String employeeDesignation;
	
	@Column(name="EMPLOYEE_SALARY")
	private String employeeSalary;
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
