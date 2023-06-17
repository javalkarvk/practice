package samplepackage;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ")({[]})";
		System.out.println(check(str));
		
	}
	
	public static boolean check(String str) {
		Stack<Character> s1 = new Stack<>();
		Character popChar;
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				s1.push(ch);
				continue;
			}
			if (s1.isEmpty()) {
				return false;
			}
			
			switch (ch) {
			case ')' :
				popChar = s1.pop();
				if (popChar == '[' || popChar == '{') {
					return false;
				}
				break;
			case ']' :
				popChar = s1.pop();
				if (popChar == '(' || popChar == '{') {
					return false;
				}
				break;
			case '}' :
				popChar = s1.pop();
				if (popChar == '[' || popChar == '(') {
					return false;
				}
				break;
			}
		}
		return s1.empty();
	}

}
