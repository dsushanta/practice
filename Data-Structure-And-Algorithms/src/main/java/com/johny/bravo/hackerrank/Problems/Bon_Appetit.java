package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Bon_Appetit {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] c = new int[n];
		for(int i=0; i<n; i++) {
			c[i] = in.nextInt();
		}
		int b_charged = in.nextInt();
		int b_actual = 0;
		for(int i=0; i<n; i++) {
			if(i == k)
				continue;
			b_actual += c[i]; 
		}
		b_actual /= 2;
		if(b_charged == b_actual)
			System.out.println("Bon Appetit");
		else
			System.out.println(b_charged-b_actual);
		in.close();
	}

}
