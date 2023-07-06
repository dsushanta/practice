package com.johny.bravo.LeetCode;

import java.util.Arrays;

public class Next_Permutation {

	public static void main(String[] args) {
		Next_Permutation np = new Next_Permutation();
		int[] nums = {1,3,2};
		np.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	public void nextPermutation(int[] nums) {
        int n = nums.length-1;
		for(int i=n; i>0; i--) {
			for(int j=i-1; j>0; j--) {
				if(nums[i] > nums[j]) {
					swap(nums,i,j);
					break;
				}
			}
		}
    }
	
	private void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

}
