package com.learning.practice.list;

import java.util.List;
import java.util.ArrayList;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<>();
		list1.add("abc");
		
		List<String> list2 = new ArrayList<>();
		list2.add("abc");
		
		listOp(list1, list2);
		System.out.println(list1);
		System.out.println(list2);
	}
	
	private static void listOp(List list1, List list2) {
		list1 = new ArrayList<>();
		list1.add("def");
		
		list2.add("def");
	}

}
