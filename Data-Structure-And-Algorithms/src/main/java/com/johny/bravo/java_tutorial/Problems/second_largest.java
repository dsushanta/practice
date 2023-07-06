package com.johny.bravo.java_tutorial.Problems;

public class second_largest {

	public static void main(String[] args) {
		
		int[] a = {12,87,56,34,6,99,73,92,101,500};
		System.out.println(second_largest(a, 0, a.length-1)[1]);

	}
	
	public static int[] second_largest(int[] a, int m, int n) {
		
		int[] l = new int[2];
		l[0] = a[m];
		int f = 0;
		l[1] = l[0];
		for(int i=m; i<=n; i++) {
			if(a[i] > l[0]) {
				f = 1;
				l[1] = l[0];
				l[0] = a[i];
			}
		}
		if(f == 0)
			l[1] = second_largest(a, m+1, n)[0];
		return l;
	}

}
