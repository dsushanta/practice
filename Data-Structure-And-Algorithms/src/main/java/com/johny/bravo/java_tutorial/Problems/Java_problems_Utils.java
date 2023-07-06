package com.johny.bravo.java_tutorial.Problems;

import java.util.HashSet;
import java.util.Set;

public class Java_problems_Utils {

	public static void common_elements_between_two_arrays() {
		int[] a = {1,2,3,4,5,6,7};
		int[] b = {6,12,9,8,4,25};
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i : a) {
			s.add(i);
		}
		for(int i : b) {
			if(s.contains(i))
				System.out.println(i);
		}
	}
	
	public static void spiral_print_2D_array(int[][] a) {
		int row_size = a.length;
		for(int i=0; i<row_size; i++) {
			int[] t = a[i];
			int col_size = t.length;
			if(i%2 == 0) {
				for(int j=0; j<col_size; j++) {
					System.out.print(" "+t[j]);
				}
				System.out.println();
			}else {
				for(int j=col_size-1; j>=0; j--) {
					System.out.print(" "+t[j]);
				}
				System.out.println();
			}	
		}
	}
}
