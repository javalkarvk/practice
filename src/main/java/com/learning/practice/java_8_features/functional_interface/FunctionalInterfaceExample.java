package com.learning.practice.java_8_features.functional_interface;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.BiFunction;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FunctionalInterfaceExample f = new FunctionalInterfaceExample();
//		f.say("Hi");
		BiFunction<Integer, Integer, Integer> f = (a,b)->a*b;
		Predicate<Integer> p = (a) -> a%2==0;
//		(a->a%2==0).test(10);
		sayable s = (String msg)->{
			System.out.println(msg);
		};
		s.say("Hi");
	}

//	@Override
//	public void say(String msg) {
//		// TODO Auto-generated method stub
//		System.out.println("Message :"+msg.toString());
//	}
}
