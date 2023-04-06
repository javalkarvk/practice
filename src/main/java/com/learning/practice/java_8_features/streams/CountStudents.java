package com.learning.practice.java_8_features.streams;

import java.util.ArrayList;
import java.util.List;

public class CountStudents {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<>();
		ls.add(new Student(1,"ABC",9));
		ls.add(new Student(3,"DEF",8));
		ls.add(new Student(2,"GHI",10));
		long sl = ls.stream().count();
		System.out.println(sl);
	}
}
