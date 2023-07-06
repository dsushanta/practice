/* Problem Statement -------------
 * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10 to the power -4 are acceptable.
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Plus_Minus {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
			a[i] = in.nextInt();
		int n_count = 0;
		int p_count = 0;
		int z_count = 0;
		for(int i=0; i<n; i++) {
			if(a[i] < 0)
				n_count++;
			else if(a[i] > 0)
				p_count++;
			else
				z_count++;
		}
		double n_fraction = (double)n_count / (double)n;
		double p_fraction = (double)p_count / (double)n;
		double z_fraction = (double)z_count / (double)n;
		System.out.printf("%.6f", p_fraction);                 // <--- Important line
        System.out.println();
		System.out.printf("%.6f", n_fraction);
		System.out.println();
        System.out.printf("%.6f", z_fraction);
        in.close();
	}

}
