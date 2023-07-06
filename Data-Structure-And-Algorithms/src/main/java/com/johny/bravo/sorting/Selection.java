package com.johny.bravo.sorting;

public class Selection {
	
	public void sort(Comparable [] a) {
		
		int n = a.length;
		
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(Utils.less(a[j], a[min]))
					min = j;
			}
			Utils.exch(a, min, i);
		}
	}

}
