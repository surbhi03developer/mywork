package com.demo2example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyControllerDemo {

	@RequestMapping(value = "/abc1", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String test() {

		return "Hello...i m a test()";
	}

	@RequestMapping("/abc2")
	public ModelAndView test1() {

		return new ModelAndView("user");
	}

	@RequestMapping(value = "/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee employeeTestJson() {

		Employee emp = new Employee();
		emp.setCompany("abc");
		emp.setDesignation("nnn");
		emp.setEmpId(1);
		emp.setName("Surbhi Di");
		return emp;
	}
	
	@RequestMapping(value = "/xml", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
	public Employee employeeTestXml(@RequestBody Employee em) {

		Employee emp = new Employee();
		emp.setCompany("abc");
		emp.setDesignation("nnn");
		emp.setEmpId(1);
		emp.setName("Surbhi Di");
		return emp;
	}
}
