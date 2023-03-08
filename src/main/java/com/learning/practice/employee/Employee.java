package com.learning.practice.employee;

public class Employee {
	int empId;
	String empName;
	
	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public String toString() {
		return "\nEmployee Id : " + this.empId + "\n" + "Employee Name : " + this.empName;
	}
}
