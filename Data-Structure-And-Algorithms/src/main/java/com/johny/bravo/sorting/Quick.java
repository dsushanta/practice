package com.johny.bravo.sorting;

import java.util.Random;

public class Quick {

	public static Comparable [] sort(Comparable []a) {
		return sort(a, 0, a.length-1);
	}
	
	private static Comparable [] sort(Comparable []a, Integer start, Integer end) {	
		if(start < end) {
			Integer pivot_index = randomisedPartition(a, start, end);
			a = sort(a, start, pivot_index-1);
			a = sort(a, pivot_index+1, end);
		}
		return a;
	}
	
	private static Integer randomisedPartition(Comparable []a, Integer start, Integer end) {
		int random = Utils.getRandomNumberInRange(start, end);
		Utils.exch(a, random, end);
		return partition(a, start, end);
	}
	
	private static Integer partition(Comparable []a, Integer start, Integer end) {
		Integer pivot_index = start;
		Comparable pivot = a[end];
		for(int i=start; i<end; i++) {
			if(Utils.less(a[i], pivot)) {
				Utils.exch(a, i, pivot_index);
				pivot_index++;
			}	
		}
			Utils.exch(a, pivot_index, end);
			return pivot_index;
	}
}
