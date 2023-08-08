package com.employeemangement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
public EmployeeDetails getEmployeeDetailsById(long id) {
		
		Optional<EmployeeDetails> fields = employeeRepo.getEmployeeDetailsById(id);
		return  fields.get();
	}

	public EmployeeDetails addAccount(EmployeeDetails field) {
		return employeeRepo.save(field);
		
	}
	
	

}
