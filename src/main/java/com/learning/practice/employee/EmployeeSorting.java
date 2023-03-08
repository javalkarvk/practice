package com.learning.practice.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "abc"));
		list.add(new Employee(2, "abc"));
		list.add(new Employee(3, "abc"));
		list.add(new Employee(4, "abc"));
		list.add(new Employee(5, "def"));
		
		
		List<Employee> l2 = findDuplicates(list);
		l2.forEach(System.out::println);
	}
	
	private static List<Employee> findDuplicates(List<Employee> list) {
		List<Employee> unique = new ArrayList<>();
		List<String> empNames = new ArrayList<>();
		list.stream().forEach(e -> {
			if(empNames.isEmpty()) {
				empNames.add(e.empName);
				unique.add(e);
			} else if (!empNames.contains(e.empName)) {
				unique.add(e);
			}
		});
		return unique;
	}
}
