package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Compare_the_Triplets {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		int a_count = 0;
		int b_count = 0;
		for(int i=0; i<3; i++)
			a[i] = in.nextInt();
		for(int i=0; i<3; i++)
			b[i] = in.nextInt();
        for(int i=0; i<3; i++) {
        	if(a[i] > b[i])
        		a_count++;
        	else if(a[i] > b[i])
        		b_count++;
        }
        System.out.println(a_count+" "+b_count);
        in.close();
	}

}
