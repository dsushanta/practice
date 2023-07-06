package com.johny.bravo.hackerrank.Problems;
/* Problem Statement ------------
 * Consider two sets of positive integers, A = {a0, a1,..., an-1} and B = {b0, b1,..., bn-1} . 
We say that a positive integer, x, is between sets A and B if the following conditions are satisfied:
1. All elements in A are factors of x.
2. x is a factor of all elements in B.

Given A and B, find and print the number of integers (i.e., possible x's) that are between the two sets.
Explanation :
The integers that are between A = {2.4} and B = {16,32,96} are 4, 8 and 16.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Between_Two_Sets {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Integer mul = 1;
        for(int i=0; i<n; i++)
        	mul = mul * a[i];
        List<Integer> b = new ArrayList<Integer>();
        for(int i=0; i < m; i++){
            b.add(in.nextInt());
        }
        Collections.sort(b);
        List<Integer> f = factors(b.get(0));
        Set<Integer> common_f = new TreeSet<Integer>();
        for(Integer i : f)
        	common_f.add(i);
        for(Integer i : b) {
        	for(Integer j : f) {
        		if(i % j != 0)
        			common_f.remove(j);
        	}
        }
        d(f);
        int count = 0;
        for(Integer fac : common_f) {
        	int i;
        	for(i=0; i<n; i++) {
        		if(fac % a[i] != 0)
        			break;
        	}
        	if(i == n)
        		count++;
        }
        System.out.println(count);
        in.close();
	}
	
	public static List<Integer> factors(Integer n) {
		List<Integer> f = new ArrayList<Integer>();
		for(int i=1; i <= n/2; i++) {
			if(n%i == 0)
				f.add(i);
		}
		f.add(n);
		return f;
	}
	public static void d(List<Integer> l) {
		for(Integer l1 : l)
			System.out.print(l1+" ");
	}
}
