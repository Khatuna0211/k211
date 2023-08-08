package com.employeemangement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {
	    @Id
		private long id;
		private String name;
		private String department;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public EmployeeDetails(int id, String name, String department) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
		}
		public EmployeeDetails() {
			super();
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
		}
		

	}



