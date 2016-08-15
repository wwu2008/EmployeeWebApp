package com.softkraft.employeeApp.configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EmployeeWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		// TODO Auto-generated method stub
		return new Class<?>[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		// TODO Auto-generated method stub
		return new Class<?>[] { WebAppConfig.class };
	}

	@Override
	protected String[] getServletMappings()
	{
		// TODO Auto-generated method stub
		return new String[] { "/" };
		
	}
  
}
