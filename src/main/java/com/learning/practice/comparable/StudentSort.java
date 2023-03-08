package com.learning.practice.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1,"ABC",10));
		list.add(new Student(2,"ABD",9));
		list.add(new Student(3,"ABE",11));
		
		Collections.sort(list);
		
		list.forEach(s -> System.out.println(s.name));
	}

}
