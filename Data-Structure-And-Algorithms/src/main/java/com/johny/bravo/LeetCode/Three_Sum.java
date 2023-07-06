package com.johny.bravo.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.johny.bravo.Problems.Triplet_Sum;

public class Three_Sum {

	public static void main(String[] args) {
		Three_Sum ts = new Three_Sum();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(ts.threeSum2(nums));
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;
		List<List<Integer>> sum3 = new ArrayList<List<Integer>>();
		for(int i=0; i<n; i++) {
			int a = nums[i];
			Set<Integer> s = new HashSet<Integer>();
			for(int j=i+1; j<n; j++) {
				int b = nums[j];
				int c = -(a+b);
				if(s.contains(c)) {
					ArrayList<Integer> t = new ArrayList<Integer>();
					t.add(a);
					t.add(b);
					t.add(c);
					Collections.sort(t);
					if(!sum3.contains(t))
						sum3.add(t);
					t = null;
				}
				else
					s.add(b);
			}
		}
        return sum3;
    }
	
	public List<List<Integer>> threeSum2(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> sum3 = new ArrayList<List<Integer>>();
		for(int i=0; i<n; i++) {
			int a = nums[i];
			int l = i+1;
			int h = n-1;
			while(l < h) {
				int b = nums[l];
				int c = nums[h];
				if(a+b+c == 0) {
					ArrayList<Integer> t = new ArrayList<Integer>();
					t.add(a);
					t.add(b);
					t.add(c);
					Collections.sort(t);
					if(!sum3.contains(t))
						sum3.add(t);
					l++;
					h--;
				} else if (a+b+c < 0)
					l++;
				else
					h--;
			}
			
		}
        return sum3;
    }

}
