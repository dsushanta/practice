package com.johny.bravo.hackerrank.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Non_Divisible_Subset {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<n; i++)
			a.add(in.nextInt());
		for(int i=0; i<n; i++) {
			a.set(i, a.get(i)%k);
			System.out.print(a.get(i)+" ");
		}	
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
		for(int i=0; i<k; i++) {
			if(a.contains(i)) {
				m.put(i, Collections.frequency(a, i));
			}	
		}
		Set<Integer> keys = m.keySet();
		List<Integer> l = new ArrayList<Integer>();
		for(Integer i : keys)
			l.add(i);
		for(int i=0; i<l.size(); i++) {
			for(int j=i+1; j<l.size(); j++) {
				
			}
		}
		in.close();
	}

}
