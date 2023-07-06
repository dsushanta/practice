/* Problem Statement -------------
 * Watson gives two integers (A and B) to Sherlock and asks if he can count
the number of square integers between A and B(both inclusive).
Note: A square integer is an integer which is the square of any integer. 
For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.
 */
package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Sherlock_and_Squares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(factors(a,b));
		}
		in.close();
	}
	
	public static int factors(int a, int b) {
		int count = 0;
		double m = Math.sqrt(a);
		double n = Math.sqrt(b);
		double x = Math.floor(m);
		double y = Math.floor(n);
		if(x == Math.ceil(m))
			count++;
//		if(y == Math.ceil(n))
//			count++;
		for(double i=x+1; i<=y; i++) {
			count++;
		}
		return count;
	}
}
