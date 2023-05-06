package com.learning.practice.java_8_features.streams.test;

import java.util.List;

public class Department {
	int id;
	List<Employee> listEmployee;
	
	public Department(int id, List<Employee> em) {
		this.id = id;
		this.listEmployee = em;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.id);
	}
}
