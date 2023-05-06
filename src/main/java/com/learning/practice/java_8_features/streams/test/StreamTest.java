package com.learning.practice.java_8_features.streams.test;

import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Vinay","Kumar");
		Employee e2 = new Employee(2, "Suma", "Bai");
		Department dept = new Department(1, Arrays.asList(e1,e2));
		Company company = new Company(1, Arrays.asList(dept));
		
		List<Company> list = Arrays.asList(company);
		
		List<Employee> l = list.stream()
				.flatMap(c->c.getListDept().stream())
				.flatMap(d->d.getListEmployee().stream())
				.filter(e->e.getLastname().equals("Kumar")).collect(Collectors.toList());
		System.out.println(l);
		
		
	}

}
