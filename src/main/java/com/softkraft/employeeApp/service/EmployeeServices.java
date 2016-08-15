package com.softkraft.employeeApp.service;

import java.util.List;

import com.softkraft.employeeApp.domain.Employee;

public interface EmployeeServices
{
	public abstract Employee findEmployeeById(long id);
	public abstract List<Employee> findAllEmployee();
	public abstract long saveEmployee(Employee employee);
}
