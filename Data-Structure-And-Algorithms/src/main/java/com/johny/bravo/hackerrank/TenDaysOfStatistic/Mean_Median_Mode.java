package com.johny.bravo.hackerrank.TenDaysOfStatistic;

import java.util.Scanner;

public class Mean_Median_Mode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] elements = new int[n];
		for(int i=0; i<n; i++) {
			elements[i] = in.nextInt();
		}
		
	}
	
	public static float mean(int[] e, int n) {
		int sum = 0;
		for(int i=0; i<n; i++)
			sum = sum + e[i];
		float m = sum/n;
		return m;
	}

}
