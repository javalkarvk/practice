package com.learning.practice.java_8_features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudents {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<>();
		ls.add(new Student(1,"ABC",9));
		ls.add(new Student(3,"DEF",8));
		ls.add(new Student(2,"GHI",10));
		List<Student> sl = ls.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
		System.out.println(sl);
	}
}
