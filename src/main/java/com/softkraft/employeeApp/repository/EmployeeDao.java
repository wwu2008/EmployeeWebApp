package com.softkraft.employeeApp.repository;
import java.util.List;

import com.softkraft.employeeApp.domain.*;

public interface EmployeeDao 
{
	public abstract Employee findEmployeeById(long id);
	public abstract List<Employee> findAllEmployee();
	public abstract long persistEmployee(Employee employee);
}
