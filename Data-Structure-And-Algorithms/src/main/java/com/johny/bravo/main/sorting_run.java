package com.johny.bravo.main;

import com.johny.bravo.sorting.Quick;
import com.johny.bravo.sorting.Merge;

public class sorting_run {

	public static void main(String[] args) {
		
		Comparable [] a = {3, 7, 23, 1, 5};
		//Quick q = new Quick(); 
		Comparable [] b = Merge.sort(a);
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
	}

}
