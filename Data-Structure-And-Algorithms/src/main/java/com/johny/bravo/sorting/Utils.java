package com.johny.bravo.sorting;

import java.util.Random;

public class Utils {
	
	public static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}

	public static void exch(Comparable []a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	public static boolean isSorted(Comparable []a) {
		for (int i=1; i<a.length; i++) {
			if(less(a[i],a[i-1]))
				return false;
		}
		return true;
	}
	
	public static int getRandomNumberInRange(int start, int end) {

		if (start >= end) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((end - start) + 1) + start;
	}
}
