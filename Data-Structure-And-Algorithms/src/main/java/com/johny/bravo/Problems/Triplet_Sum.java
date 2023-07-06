package com.johny.bravo.Problems;

import java.util.HashSet;
import java.util.Set;

public class Triplet_Sum {

	public static void main(String[] args) {

		Triplet_Sum ts = new Triplet_Sum();
		Integer[] nums = {1, 4, 11, 6, 10, 8};
		int sum = 22;
		ts.printTripletSum(nums, sum);
	}

	
	private void printTripletSum(Integer[] nums, int sum) {
		int n = nums.length;
				
		for(int i=0; i<n; i++) {
			int a = nums[i];
			Set<Integer> s = new HashSet<Integer>();
			
			for(int j=i+1; j<n; j++) {
				int b = nums[j];
				int c = sum - (a+b);			
				if(s.contains(c)) {
					System.out.println(a+" "+" "+b+" "+c);				
				}else
					s.add(b);
			}
		}
	}
}
