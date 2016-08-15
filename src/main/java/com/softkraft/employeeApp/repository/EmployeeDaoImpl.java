package com.softkraft.employeeApp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.softkraft.employeeApp.domain.Employee;

@Profile("production")
@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
    @Autowired
    private JdbcOperations jdbcOperations;
    
    class EmployeeMapper implements RowMapper<Employee>
	{
		@Override
		public Employee mapRow(ResultSet row, int rowNum) throws SQLException
		{
			return new Employee(row.getLong("employee_id"), row.getString("first_name"),
								row.getString("last_name"), row.getString("address"), row.getString("phone"));
		}
	}
    
	@Override
	public Employee findEmployeeById(long id)
	{
		// TODO Auto-generated method stub		
		return jdbcOperations.queryForObject("slect * from employee_table", new EmployeeMapper());
	}

	@Override
	public List<Employee> findAllEmployee()
	{
		// TODO Auto-generated method stub
		return jdbcOperations.query("select * from employee_table", new EmployeeMapper());
	}

	@Override
	public long persistEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		Long id = jdbcOperations.queryForObject("select auto_increment from information_schema.tables " +
				"where table_schema = 'employee' and table_name = 'employee_table'",
				Long.class);
		jdbcOperations.update("insert into employee_table values(?,?,?,?,?)",
				        id,employee.getFirstName(),employee.getLastname(),employee.getPhoneNumber(),employee.getAddress());		
		return id;
	}

}
