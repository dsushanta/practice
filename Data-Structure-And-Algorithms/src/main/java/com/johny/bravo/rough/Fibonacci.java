package com.johny.bravo.rough;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("How many numbers : ");
		Double n = reader.nextDouble();
		long startTime = System.currentTimeMillis();
		Double v = fib(n);
		System.out.println(n+"th term in Fibonacci Series : "+v);
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
	}

	public static Double fib(Double n) {
		if(n == 1.0)
			return 0.0;
		if(n == 2.0)
			return 1.0;
		return fib(n-1) + fib(n-2);
	}
	
}
