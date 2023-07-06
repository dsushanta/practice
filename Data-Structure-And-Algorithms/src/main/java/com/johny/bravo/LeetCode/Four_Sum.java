package com.johny.bravo.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Four_Sum {

	public static void main(String[] args) {
		Four_Sum fs = new Four_Sum();
		int[] nums = {1, 0, -1, 0, -2, 2};
		int target = 0;
		System.out.println(fs.fourSum(nums, target));

	}
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		int n = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> sum4 = new ArrayList<List<Integer>>();
		for(int i=0; i<n; i++) {
			int a = nums[i];
			for(int k=i+1; k<n; k++) {
				int b = nums[k];
				int l = k+1;
				int h = n-1;
				while(l < h) {
					int c = nums[l];
					int d = nums[h];
					if(a+b+c+d == target) {
						ArrayList<Integer> t = new ArrayList<Integer>();
						t.add(a);
						t.add(b);
						t.add(c);
						t.add(d);
						Collections.sort(t);
						if(!sum4.contains(t))
							sum4.add(t);
						l++;
						h--;
						
					} else if (a+b+c+d < target)
						l++;
					else
						h--;
				}
			}
			
		}
        return sum4;
    }
        
}


