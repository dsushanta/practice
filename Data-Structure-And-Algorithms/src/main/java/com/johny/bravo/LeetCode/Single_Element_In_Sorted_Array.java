package com.johny.bravo.LeetCode;

public class Single_Element_In_Sorted_Array {

	public static void main(String[] args) {
		
//		int[] nums = {3,3,7,7,10,11,11};
		int[] nums = {1,1,2,3,3,4,4,8,8};
		Single_Element_In_Sorted_Array s = new Single_Element_In_Sorted_Array();
		System.out.println(s.singleNonDuplicate(nums));
	}
	
	public int singleNonDuplicate(int[] nums) {
		return nonDuplicate(nums, 0, nums.length-1);
    }
	
	private int nonDuplicate(int[] n, int first, int last) {
		if(first > last)
			return 22334455;
		int mid = first + (last-first)/2;
		if((n[mid] == n[mid-1]) && ((mid-first)%2 == 0))
			return nonDuplicate(n, first, mid);
		else if((n[mid] != n[mid-1]) && ((mid-first)%2 != 0))
			return nonDuplicate(n, first, mid-1);
		else if((n[mid] == n[mid+1]) && ((last-mid)%2 == 0))
			return nonDuplicate(n, mid, last);
		else if((n[mid] != n[mid+1]) && ((last-mid)%2 != 0))
					return nonDuplicate(n, mid+1, last);
		else
			return n[mid];
	}

}
