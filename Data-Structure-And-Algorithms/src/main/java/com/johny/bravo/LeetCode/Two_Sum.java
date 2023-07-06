package com.johny.bravo.LeetCode;

import java.util.Arrays;

public class Two_Sum {

	public static void main(String[] args) {
		Two_Sum t = new Two_Sum();
		int[] nums = {-1,-2,-3,-4,-5};
		int target = -8;
		System.out.println(Arrays.toString(t.twoSum(nums, target)));
	}
	
	public int[] twoSum(int[] nums, int target) {
        
		if(nums.length == 0)
			return nums;
		
		int i,j=0;
		boolean f = false;
		for(i=0; i<nums.length; i++) {
			for(j=i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					f = true;
					break;
				}
			}
			if(f)
				break;
		}
		return new int[] {i,j};
    }

}
