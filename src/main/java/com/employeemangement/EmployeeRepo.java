package com.employeemangement;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeDetails, Long> {

	   

		Optional<EmployeeDetails> getEmployeeDetailsById(long id);

	}


