package com.softkraft.employeeApp.configuration;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@ComponentScan(basePackages="com.softkraft.employeeApp.repository, com.softkraft.employeeApp.service")
@Configuration
public class AppConfig
{
	@Bean
	public DataSource dataSource()
	{
		BasicDataSource ds = new BasicDataSource();
		
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/employee");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setInitialSize(5);
		ds.setMaxActive(10);
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
	}
}
