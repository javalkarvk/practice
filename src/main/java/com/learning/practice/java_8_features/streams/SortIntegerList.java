package com.learning.practice.java_8_features.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegerList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(5);
		List<Integer> l2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(l2);

	}

}
