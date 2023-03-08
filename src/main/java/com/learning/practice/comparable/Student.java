package com.learning.practice.comparable;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	int age;
	
	Student (int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "\nRollNo : " + this.rollNo + "\nName : " + this.name + "\nAge : " + this.age;
	}
	
	@Override
	public int compareTo(Student s) {
		if (this.name.compareTo(s.name) != 0) {
			return this.name.compareTo(s.name);
		} else {
			return this.age - s.age;
		}
	}
}
