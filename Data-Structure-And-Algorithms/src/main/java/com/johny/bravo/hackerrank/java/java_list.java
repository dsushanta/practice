package com.johny.bravo.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java_list {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			int t = in.nextInt();
			l.add(t);
		}
		int q = in.nextInt();
		in.nextLine();
		for(int i=0; i<q; i++) {
			String s = in.nextLine();
			if(s.equalsIgnoreCase("Insert")) {
				int index = in.nextInt();
				int v = in.nextInt();
				l.add(index, v);
			}
			else if(s.equalsIgnoreCase("Delete")) {
				int index = in.nextInt();
				l.remove(index);
			}
			in.nextLine();
		}
		for(int e : l)
			System.out.println(e+" ");
	}

}
