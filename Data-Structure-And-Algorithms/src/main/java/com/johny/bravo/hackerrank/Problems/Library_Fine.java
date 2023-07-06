package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Library_Fine {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] da = new int[3];
		int[] de = new int[3];
		for(int i=0; i<3; i++)
			da[i] = in.nextInt();
		for(int i=0; i<3; i++)
			de[i] = in.nextInt();
		int fine = 0;
		if(da[2] > de[2])
			fine = 10000;
		else if(da[2] < de[2])
			fine = 0;
		else {
			if(da[1] > de[1]) {
				fine = 500 * (da[1] - de[1]);
			}
			else if(da[1] < de[1]) {
				fine = 0;
			}
			else {
				if(da[0] > de[0]) {
					fine = 15 * (da[0] - de[0]);
				}
				else if(da[0] <= da[0])
					fine = 0;
			}
		}
		System.out.println(fine);
		in.close();
	}

}
