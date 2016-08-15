package com.softkraft.employeeApp.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import  com.softkraft.employeeApp.repository.*;
import com.softkraft.employeeApp.domain.Employee;

public class EmployeeServicesImpl implements EmployeeServices
{
    @Autowired
	private EmployeeDao employeeDao;
    
    
	@Override
	public Employee findEmployeeById(long id)
	{
		// TODO Auto-generated method stub
		return employeeDao.findEmployeeById(id);
	}

	@Override
	public List<Employee> findAllEmployee()
	{
		// TODO Auto-generated method stub
		return employeeDao.findAllEmployee();
	}

	@Override
	public long saveEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		return employeeDao.persistEmployee(employee);
	}
}
