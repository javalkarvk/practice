package com.learning.practice.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put(null, "1");
		map.put(null, "2");
		
		map.forEach((k,v)->System.out.println(k+":"+v));

	}

}
