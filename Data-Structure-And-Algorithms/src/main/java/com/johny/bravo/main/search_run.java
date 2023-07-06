package com.johny.bravo.main;

import com.johny.bravo.search.Binary;

public class search_run {

	public static void main(String[] args) {
		int []a = {11, 15, 2, 4, 5, 7};
//		int left_index = Binary.search_iterative(a, 11, true);
//		int right_index = Binary.search_iterative(a, 11, false);
//		if(left_index == -1)
//			System.out.println("The number is not present in the list ");
//		else
//			System.out.println("The number is present "+(right_index-left_index+1)+" time(s) and leftmost index is : "+left_index);
		int index = Binary.search_circular(a, 2);
		if(index == -1)
			System.out.println("The number is not present in the list ");
		else
			System.out.println("The number is present at index : "+index);
	}

}
