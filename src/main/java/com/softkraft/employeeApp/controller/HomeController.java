package com.softkraft.employeeApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softkraft.employeeApp.domain.Employee;
import com.softkraft.employeeApp.service.*;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private EmployeeServices employeeServices;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		logger.debug("********************* home controller, return home view" );
		return "home";
	}
	
	@RequestMapping(value="/sarchEmployeeById.jsp", method=RequestMethod.POST)
    public String searchEmployeeSubmit(@RequestParam(value = "employeeId", required = true) String id,
    		@ModelAttribute Employee employee, Model model) {
		try{
			// validate input - has to be long number 
			Long employeeId = new Long(id);
            model.addAttribute(employeeServices.findEmployeeById(employeeId.longValue()));
            return "result";   
		}catch (Exception e){
			logger.info("uer input invalid employee id number: " + id);
			return "errorPage";
		}
    }
}
