package com.learning.practice.java_8_features.datetimeapi;

import java.time.*;
public class DateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dt = LocalDateTime.now();
		
		dt = dt.plusMonths(6);
		System.out.println(dt);
		
		LocalDateTime dob = LocalDateTime.of(1990,03,31,14,45,00);
		
//		Period p = Period.between(dob, dt);
		
	}
}
