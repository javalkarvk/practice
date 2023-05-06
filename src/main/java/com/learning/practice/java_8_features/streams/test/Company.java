package com.learning.practice.java_8_features.streams.test;

import java.util.List;

public class Company {
	int id;
	List<Department> listDept;
	
	public Company(int id, List<Department> dept) {
		this.id = id;
		this.listDept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Department> getListDept() {
		return listDept;
	}

	public void setListDept(List<Department> listDept) {
		this.listDept = listDept;
	}
	
	
}
