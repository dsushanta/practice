/**
 * 
 */
package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Manasa_And_Stones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int test_cases = in.nextInt();
		for(int i=0; i<test_cases; i++) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			if(a>b) {
				int t = a;
				a = b;
				b = t;
			}
			func(n, a, b);
		}
		in.close();
	}
	
	public static void func(int n, int a, int b) {
		
		int min_val = (n-1)*a;
		int df = b - a;
		System.out.println(n+" "+a+" "+b+" "+min_val+" "+df);
		for(int i=0; i<n; i++) {
			int d = df*i;
			int v = min_val+d;
			System.out.print(v+" ");
		}
		System.out.println();
	}

}
