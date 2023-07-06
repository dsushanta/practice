package com.johny.bravo.hackerrank.DataStructure;

import java.util.Scanner;

public class Arrays_DS {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		print_reverse(a, 0, n);
	}
	
	public static void print_reverse(int[] a, int i, int n) {
		if(i == n)
			return;
		print_reverse(a, i+1, n);
		System.out.print(a[i]+" ");
	}

}
