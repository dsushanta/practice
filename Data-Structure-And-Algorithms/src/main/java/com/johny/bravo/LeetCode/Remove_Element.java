package com.johny.bravo.LeetCode;

import java.util.Arrays;

public class Remove_Element {

	public static void main(String[] args) {
//		int[] nums = {0,1,2,2,3,0,4,2};
		int[] nums = {2};
		int val = 2;
		Remove_Element r = new Remove_Element();
		System.out.println(r.removeElement(nums, val));
	}
	
	public int removeElement(int[] nums, int val) {
		
		int f = nums.length - 1;
		boolean found = false;
			
		for(int i=0; i<nums.length;i++) {
			if(i > f)
				break;
			if(nums[i] == val) {
				while(f > i && nums[f] == val)
					f--;
				swap(nums,i,f);
				found = true;
			}
		}
		if(found == false)
			f++;
//		System.out.println(nums.length - c + 1);
		System.out.println(Arrays.toString(nums));
		return f;
    }
	
	private void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

}
