package com.johny.bravo.hackerrank.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Minimum_Distances {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int i=0; i < n; i++){
            A[i] = in.nextInt();
        }
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++) {
        	if(!m.containsKey(A[i]))
        		m.put(A[i], 0);
        	else {
        		Integer v = m.get(A[i]);
        		m.put(A[i], v+1);
        	}
        }
        TreeSet<Integer> dist = new TreeSet<Integer>();
        for(Integer k : m.keySet()) {
        	dist.add(m.get(k));
        }
        if(dist.size() == 1)
        	System.out.println(-1);
        else {
        	for(Integer k : dist) {
        		if(k != 1) {
        			System.out.println(k);
        			break;
        		}	
        	}
        		
        }
        in.close();
	}

}
