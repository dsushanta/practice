package com.johny.bravo.LeetCode;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		Container_With_Most_Water w = new Container_With_Most_Water();
		int[] nums = {1,8,6,2,5,4,8,3,7};
		System.out.println(w.maxArea(nums));

	}
	
	public int maxArea(int[] nums) {
		if(nums.length == 0)
			return -1;
		int i=0, j=0, water_vol_max=0;
		for(; i<nums.length; i++) {
			for(j=i+1; j<nums.length; j++) {
				int min = min(nums[i], nums[j]);
				int area = min * (j-i);
				if(water_vol_max < area)
					water_vol_max = area;
			}
		}
		return water_vol_max;
    }
	
	private int min(int a, int b) {
		if(a < b)
			return a;
		else
			return b;
	}

}
