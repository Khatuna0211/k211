package com.employeemangement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class EmployeeDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDatabaseApplication.class, args);
	}
	
	@Bean

	   ArrayList<EmployeeDetails> loadData(EmployeeRepo employeeRepo)

	    {

	        ArrayList<EmployeeDetails> e1=new ArrayList<EmployeeDetails>();

	        employeeRepo.save(new EmployeeDetails(1,"A","hr"));

	        employeeRepo.save(new EmployeeDetails(2,"B","java fse"));

//	        employeeRepo.save(new Employee(3,"C",20000));
//
//	        employeeRepo.save(new Employee(4,"D",20000));

	        

	        e1.add(new EmployeeDetails(1,"A","hr"));

	        e1.add(new EmployeeDetails(2,"B","java fse"));

//	        e1.add(new Employee(3,"C",20000));
//
//	        e1.add(new Employee(4,"D",20000));

	        

	        //System.out.println(e1);

	        

	        return e1;

	        

	    }

	    

	    

	    @Bean

	    List<EmployeeDetails> showData(EmployeeRepo employeeRepo)

	        {

	        List<EmployeeDetails> e1=new ArrayList<EmployeeDetails>();

	        e1=employeeRepo.findAll();

	        for(EmployeeDetails e:e1) {

	            System.out.println(e);

	        }

	            return e1;

	        }
}