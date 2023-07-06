package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class GCD_Recursion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
		System.out.println(gcd(x,y));
		in.close();
	}
	
	public static int gcd(int x, int y) {
		int t;
		if(x == y)
			t = x;
		else if(x>y)
			t = gcd(x-y, y);
		else
			t = gcd(x, y-x);
		return t;
	}

}
