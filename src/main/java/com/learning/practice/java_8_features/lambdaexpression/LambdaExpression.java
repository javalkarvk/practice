package com.learning.practice.java_8_features.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("d");
		l.add("e");
		l.add("a");
		System.out.println(l);
		Collections.sort(l,(a,b)->a.compareTo(b));
		
		List<String> l1 = l.stream().distinct().collect(Collectors.toList());
		System.out.println(l);
	}

}
