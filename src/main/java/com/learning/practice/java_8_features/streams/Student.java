package com.learning.practice.java_8_features.streams;

public class Student {
	Integer rollNo;
	String name;
	Integer age;
	
	public Student (Integer rollNo, String name, Integer age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		return this.rollNo+":"+this.name+":"+this.age;
	}
}
