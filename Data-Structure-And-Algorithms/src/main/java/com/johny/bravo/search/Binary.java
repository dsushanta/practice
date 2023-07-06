package com.johny.bravo.search;

public class Binary {
	public static int search_iterative(int []a, int item, boolean search_first_index) {
		int start, end, mid;
		int index = -1;
		start = 0;
		end = a.length-1;
		while(start <= end) {
			mid = start + (end-start)/2;
			if(item == a[mid]) {
				index = mid;
				if(search_first_index == true)
					end = mid-1;
				else
					start = mid+1;
			}	
			else if(item < a[mid])
				end = mid-1;
			else
				start = mid+1;
		}
		return index;
	}
	
	public static int search_recursive(int []a, int item) {
		return search_recursive(a, item, 0, a.length-1);
	}
	
	private static int search_recursive(int []a, int item, int start, int end) {
		int index;
		if(start > end)
			return -1;
		int mid = start + (end-start)/2;
		if(item == a[mid])
			index = mid;
		else if(item < a[mid])
			index = search_recursive(a, item, start, mid-1);
		else
			index = search_recursive(a, item, mid+1, end);
		return index;
	}
	
	public static int rotated(int[] a, int start, int end) {
		int mid = start + (end-start)/2;
		int n = a.length;
		int next, prev;
		next = (mid+1)%n;
		prev = (n+mid-1)%n;
		if(a[start] < a[end])
			return start;
		if((a[mid] < a[next]) && (a[mid] < a[prev]))
			return mid;
		if(a[mid] < a[end])
			return rotated(a, start, mid-1);
		if(a[mid] > a[start])
			return rotated(a, mid+1, end);
		return -1;
	}
	public static int search_circular(int[] a, int item) {
		return search_circular(a, item, 0, a.length-1);
	}
	private static int search_circular(int[] a, int item, int start, int end) {
		int index = -1;
		if(start > end)
			return index;
		int mid = start + (end-start)/2;
		if(item == a[mid])
			return mid;
		if(a[mid] < a[end]) {
			if((item > a[mid]) && (item <= a[end])) {
				index = search_circular(a, item, mid+1, end);
			}
			else {
				index = search_circular(a, item, start, mid-1);
			}
		}
		if(a[mid] > a[start]) {
			if((item < a[mid]) && (item >= a[start])) {
				index = search_circular(a, item, start, mid-1);
			}
			else {
				index = search_circular(a, item, mid+1, end);
			}
		}
		return index;
	}
}
