package com.learning.practice.java_8_features.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learning.practice.comparator.Student;

public class StreamConcat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> l = new ArrayList<>();
		l.add(new Student(1,"ABC",10));
		l.add(new Student(2,"ABC",11));
		ArrayList<Student> l2 = new ArrayList<>();
		l2.add(new Student(3,"ABC",12));
		l2.add(new Student(4,"ABE",13));
		l2.add(new Student(5,"ABD",10));
		List l3 = Stream.concat(l.stream(), l2.stream()).collect(Collectors.toList());
		
		System.out.println(l3);

	}
}
