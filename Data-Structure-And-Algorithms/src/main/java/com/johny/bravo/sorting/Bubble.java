package com.johny.bravo.sorting;

public class Bubble {

	public static void sort(Comparable []a) {
		int n = a.length;
		int flag = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(Utils.less(a[j+1], a[j]))
					Utils.exch(a, j+1, j);
			}
			// To check if the array is already sorted at this point of time
			if(flag == 0)
				break;
		}
	}
}
