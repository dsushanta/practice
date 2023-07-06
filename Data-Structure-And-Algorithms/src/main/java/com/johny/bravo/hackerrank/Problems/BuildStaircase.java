package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class BuildStaircase {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		staircase(n);
		in.close();
	}
	
	public static void staircase(int n) {
		for(int i=1; i<=n ; i++) {
			for(int j=i; j<n; j++)
				System.out.print(" ");
			for(int k=0; k<i; k++)
				System.out.print("#");
			System.out.println();
		}
	}

}
