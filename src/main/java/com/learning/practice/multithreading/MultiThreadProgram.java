package com.learning.practice.multithreading;

public class MultiThreadProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable thread = () -> {System.out.println("New Thread");};
		Thread mythread = new Thread (thread);
		mythread.start();
		

	}

}
