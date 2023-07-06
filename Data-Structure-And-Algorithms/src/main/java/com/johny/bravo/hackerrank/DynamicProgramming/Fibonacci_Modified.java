/*
 * Problem Statement : Modified Fibonacci Series
 * Modified Fibonacci Relation : t(i+2) = t(i+1)^2 + t(i)
 */

package com.johny.bravo.hackerrank.DynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci_Modified {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer t1 = scanner.nextInt();
		Integer t2 = scanner.nextInt();
        Integer n = scanner.nextInt();
        BigInteger[] table = new BigInteger[n];
        boolean[] check = new boolean[n];
        scanner.close();
        long startTime = System.nanoTime();
        for(int i=0; i<n; i++)
        	check[i] = false;
        System.out.println(fib(t1, t2, n-1, check, table));
        long endTime = System.nanoTime();
        System.out.println("Time Taken in Nano Seconds : "+ (endTime - startTime));
	}
		
	public static BigInteger fib(Integer t1, Integer t2, Integer n, boolean[] check, BigInteger[] table) {
		if(n == 0)
			return BigInteger.valueOf(t1);
		if(n == 1)
			return BigInteger.valueOf(t2);
		if(check[n])
			return table[n];
		else {
			BigInteger temp = fib(t1, t2, n-1, check, table);
			temp = temp.multiply(temp);
			BigInteger v = temp.add(fib(t1, t2, n-2, check, table));
			check[n] = true;
			table[n] = v;
			return v;
		}	
	}
}
