package com.johny.bravo.rough;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci_DP {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("How many numbers : ");
		Double n = reader.nextDouble();
		Map<Double, Double> d = new HashMap<Double, Double>();
		d.put(1.0, 0.0);
		d.put(2.0, 1.0);
		long startTime = System.currentTimeMillis();
		Double v = fib(d,n);
		System.out.println(n+"th term in Fibonacci Series : "+v);
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
	}

	public static Double fib(Map<Double, Double> d, Double n) {
		if(n == 1)
			return 0.0;
		if(n == 2)
			return 1.0;
		if(!d.containsKey(n))
			d.put(n, (fib(d,n-1) + fib(d,n-2)));
		return d.get(n);
	}

}
