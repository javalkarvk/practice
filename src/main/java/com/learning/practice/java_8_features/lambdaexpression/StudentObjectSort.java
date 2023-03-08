package com.learning.practice.java_8_features.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.learning.practice.comparator.Student;

public class StudentObjectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> l = new ArrayList<>();
		l.add(new Student(1,"ABC",10));
		l.add(new Student(2,"ABC",11));
		l.add(new Student(3,"ABC",12));
		l.add(new Student(4,"ABE",13));
		l.add(new Student(5,"ABD",10));
		Map<Student, Long> l2 = l.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().stream().filter(s->s.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(l2);

	}
}
