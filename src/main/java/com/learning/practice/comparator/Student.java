package com.learning.practice.comparator;

public class Student {
	int rollNo;
	String name;
	int age;
	
	public Student (int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	@Override
//	public boolean equals(final Object s) {
//		return this.name.equals(((Student) s).name);
//	}
	
	public String toString() {
		return this.name;
	}
	
//	@Override
//	public int hashCode() {
//		return this.name.hashCode();
//	}
	
}
