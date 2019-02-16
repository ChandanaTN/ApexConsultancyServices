package com.apex.assignment1;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Please enter the fibonacci series count to generate:");
		try {
			Scanner reader = new Scanner(System.in);
			int count = reader.nextInt();
			reader.close();
			ArrayList<Integer> fibonacci = new ArrayList<Integer>();
			fibonacci.add(1);
			fibonacci.add(1);
			for (int counter = 2; counter < count; counter++) {
				fibonacci.add(counter, fibonacci.get(counter - 1) + fibonacci.get(counter - 2));
			}
			System.out.println("The first " + count + " fibonacci numbers are: " + fibonacci);
		} catch (Exception e) {
			System.out.println("There is a " + e);
		}
	}

}
