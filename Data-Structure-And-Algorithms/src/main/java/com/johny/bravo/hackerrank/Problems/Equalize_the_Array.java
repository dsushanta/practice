/* Problem Statement ----------------
 * Karl has an array of n integers. In one operation, he can delete any element from the array.
Karl wants all the elements of the array to be equal to one another. 
To do this, he must delete zero or more elements from the array. 
Find and print the minimum number of deletion operations Karl must perform so that all the array's elements are equal.
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Equalize_the_Array {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] a = new Integer[n];
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
			if(m.containsKey(a[i])) {
				Integer v = m.get(a[i]);
				m.put(a[i], v+1);
			}
			else {
				m.put(a[i], 1);
			}
		}
		List<Integer> l = new ArrayList<Integer>();
		for(Integer key : m.keySet()){
			l.add(m.get(key));
		}
		Collections.sort(l);
		int count = 0;
		for(int i=0; i<l.size()-1; i++) {
			count = count + l.get(i);
		}
		System.out.println(count);
		in.close();
	}

}
