package com.johny.bravo.hackerrank.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci_DP {

	
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        scanner.close();
        System.out.println(fib(n, map));

	}
		
	public static Integer fib(Integer n, Map<Integer, Integer> map) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		if(map.containsKey(n))
			return map.get(n);
		else {
			Integer v = fib(n-1, map) + fib(n-2, map);
			map.put(n, v);
			return v;
		}	
	}

}
