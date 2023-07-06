package com.johny.bravo.sorting;

public class Merge {

	public static Comparable[] sort (Comparable []a) {
		Comparable[] aux = new Comparable[a.length];
		return sort(a, aux, 0, a.length-1);
	}
	
	private static Comparable[] sort (Comparable []a, Comparable[] aux, int start, int end) {
		if(end > start) {
			int mid = start + (end-start)/2;
			a = sort(a, aux, start, mid);
			a = sort(a, aux, mid+1, end);
			a = merge_sub_arrays(a, aux, start, end, mid);
		}
		return a;
	}
	
	private static Comparable [] merge_sub_arrays(Comparable []a, Comparable []aux, int start, int end, int mid) {
		for(int k=start; k<=end; k++) {
			aux[k] = a[k];
		}
		int i, j;
		i = start;
		j = mid+1;
		for(int k=start; k<=end; k++) {
			if(i>mid)
				a[k] = aux[j++];
			else if(j>end)
				a[k] = aux[i++];
			else if(Utils.less(aux[i], aux[j]))
				a[k] = aux[i++];
			else
				a[k] = aux[j++];
		}
		return a;
	}
}
