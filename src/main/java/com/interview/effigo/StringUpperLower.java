package com.interview.effigo;

public class StringUpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ApPlE";
		String result = "";
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				result += Character.toUpperCase(c);
			} else {
				result += c;
			}
		}
		System.out.println(result);
	}
}
