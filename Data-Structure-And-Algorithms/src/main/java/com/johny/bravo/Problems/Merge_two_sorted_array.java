package com.johny.bravo.Problems;

public class Merge_two_sorted_array {

	public static void main(String[] args) {
		
		int[] b = {1,3,5,7};
		int[] a = {2,4,6,8};

		int m = a.length;
		int n = b.length;
		
		int[] c = new int[m+n];
		
		for(int i=0, j=0, k=0; k<m+n;) {
			if(i>=m)
				c[k++] = b[j++];
			else if(j>=n)
				c[k++] = a[i++];
			else if(a[i] <= b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		
		for(int i : c) {
			System.out.print(i+" ");
		}	
	}
}
