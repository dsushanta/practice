/* Problem Statement -------------
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. 
Each summer, its height increases by 1 meter.
Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. 
How tall will her tree be after N growth cycles?
 */
package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Utopian_Tree {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] t = new int[n];
		int h_final[] = new int[n];
		for(int i=0; i<n; i++) {
			t[i] = in.nextInt();
			h_final[i] = 1; 
		}
		for(int i=0; i<n; i++) {
			if(t[i] == 0)
				continue;
			for(int j=1; j<=t[i]; j++) {
				if(j%2 == 0) {
					h_final[i] += 1;
				}
				else {
					h_final[i] *= 2;
				}
			}
		}
		for(int i=0; i<n; i++)
			System.out.println(h_final[i]);
		in.close();
	}

}
