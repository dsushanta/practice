package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Find_Digits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++) {
			int n = in.nextInt();
			digits(n);
		}
		in.close();
	}
	
	public static void digits(int n) {
		int c = 0;
		int n1 = n;
		while(n > 0) {
			int p = n%10;
			if(p == 0) {
				n = n/10;
				continue;
			}	
			if(n1 % p == 0)
				c++;
			n = n/10;
		}
		System.out.println(c);
	}

}
