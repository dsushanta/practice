/* Problem Statement
 * Given five positive integers, find the minimum and maximum values that can be 
 * calculated by summing exactly four of the five integers. 
 * Then print the respective minimum and maximum values as a single line of 
 * two space-separated long integers.
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mini_Max_Sum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<5; i++)
			a.add(in.nextInt());
		Collections.sort(a);
		long max = 0;
		long min = 0;
		for(int i=1; i<a.size(); i++)
			max = max + a.get(i);
		for(int i=0; i<a.size()-1; i++)
			min = min + a.get(i);
		System.out.println(min+" "+max);
		in.close();
	}

}
