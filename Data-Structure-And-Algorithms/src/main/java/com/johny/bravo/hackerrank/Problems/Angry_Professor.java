package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Angry_Professor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] time = new int[n];
			for(int j=0; j<n; j++) {
				time[j] = in.nextInt();
			}
			class_cancelled(time, k, n);
		}
		in.close();
	}

	public static void class_cancelled(int[] time, int k, int n) {
		int c = 0;
		for(int i=0; i<n; i++) {
			if(time[i] <= 0)
				c++;
		}
		if(c >= k)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
