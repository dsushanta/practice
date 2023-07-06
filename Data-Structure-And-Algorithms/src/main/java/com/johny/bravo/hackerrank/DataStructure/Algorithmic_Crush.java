package com.johny.bravo.hackerrank.DataStructure;

import java.util.Scanner;

public class Algorithmic_Crush {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] arr = new long[n];
		for(int i=0; i<n; i++)
			arr[i] = 0;
		int n_operations = in.nextInt();
		int a, b, k;
		for(int i=0; i<n_operations; i++) {
			a = in.nextInt();
			b = in.nextInt();
			k = in.nextInt();
			arr = add(arr, a-1, b-1, k);
		}
		System.out.println(max(arr));
		
	}
	
	public static long[] add(long[] arr, int a, int b, int k) {
		for(int i=a; i<=b; i++)
			arr[i] += k;
		return arr;
	}
	
	public static long max(long[] arr) {
		long max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
