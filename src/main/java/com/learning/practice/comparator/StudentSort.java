package com.learning.practice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1,"ABC",10));
		list.add(new Student(2,"ABD",9));
		list.add(new Student(3,"ABE",11));
		
		Collections.sort(list, (s1,s2)->s1.age == s2.age ? 0 : s1.age< s2.age ? 1 : -1);
		Collections.sort(list, (s1,s2)->s1.name.compareTo(s2.name));
		list.forEach(s -> System.out.println(s.name));
	}

}
