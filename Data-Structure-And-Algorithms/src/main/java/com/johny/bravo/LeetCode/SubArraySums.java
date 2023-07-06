package com.johny.bravo.LeetCode;

public class SubArraySums {
	
	public static void main(String[] args) {
		SubArraySums s = new SubArraySums();
		int[] a = {3,3,9,9,5};
		int m = 7;
//		System.out.println(s.subarraySum(a));
//		System.out.println(s.optimizedSubarraySum(a));
		System.out.println(s.maxSubarraySum(a, m));
	}
	
	public int subarraySum(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					result += arr[k];
				}
			}
		}
		return result;
	}

	public int optimizedSubarraySum(int[] arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum += arr[j];
				result += sum;
			}
		}
		
		return result;
	}
	
	public int maxSubarraySum(int[] a, int m) {
		int result = 0;
		for(int i=0; i<a.length; i++) {
			int sum = 0;
			for(int j=i; j<a.length; j++) {
				sum += a[j];
				int x = sum % m;
				if(result < x)
					result = x;
			}
		}
		return result;
	}
	
}
