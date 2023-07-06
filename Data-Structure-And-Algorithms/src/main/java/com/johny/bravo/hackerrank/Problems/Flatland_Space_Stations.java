package com.johny.bravo.hackerrank.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Flatland_Space_Stations {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<Integer> ss = new ArrayList<Integer>();
		for(int i=0; i<m; i++) {
			ss.add(in.nextInt());
		}
		
		System.out.println(distant_space_station(ss, n, m));
		in.close();
	}
	
	public static Integer distant_space_station(List<Integer> ss, int n, int m) {
		Integer max = 0;
		List<Integer> dist = new ArrayList<Integer>();
		Collections.sort(ss);
		if(m == n)
			return 0;
		if(m == 1) {
			return Math.max(m, n-m);
		}
		if(ss.get(0) != 0)
			dist.add(ss.get(0));
		if(ss.get(m-1) != n)
			dist.add((n-1)-ss.get(m-1));
		for(int i=0; i<m-1; i++) {
			Integer t = (ss.get(i+1) - ss.get(i))/2;
			dist.add(t);
		}
		Collections.sort(dist);
		max = dist.get(dist.size()-1);
		return max;
	}

}
