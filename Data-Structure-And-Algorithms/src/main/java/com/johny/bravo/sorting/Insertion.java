package com.johny.bravo.sorting;

public class Insertion {

	public static Comparable[] sort(Comparable a[]) {	
		int n = a.length;	
		for(int i=0; i<n; i++) {
			for(int j=i; j>0; j--) {
				if(Utils.less(a[j], a[j-1]))
					Utils.exch(a, j, j-1);
				else
					break;
			}
		}
		return a;
	}
	
}
