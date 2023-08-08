package com.employeemangement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@ComponentScan
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path="/add",consumes={"application/json"})
	public String addAccount(@RequestBody EmployeeDetails field)  {
		EmployeeDetails employeeDetails=employeeService.addAccount(field);
		
		return "Account Created Successfully"+(employeeDetails.getId());
	}
	

@RequestMapping("/fields/{id}")
public EmployeeDetails viewInfoById(@PathVariable long id) {
	return employeeService.getEmployeeDetailsById(id);
}


	

}
