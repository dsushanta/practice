package com.johny.bravo.LeetCode;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		Remove_Duplicates_from_Sorted_Array r = new Remove_Duplicates_from_Sorted_Array();
		int[] nums = {0,0,1,1,1,2,2,3,3,4,4};
		System.out.println(r.removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
	
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0 || nums.length == 1)
			return nums.length;
        int j = 0;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] != nums[i+1]) {
				nums[j++] = nums[i];
			}
		}
		nums[j++] = nums[nums.length-1];
		return j;
    }
}
