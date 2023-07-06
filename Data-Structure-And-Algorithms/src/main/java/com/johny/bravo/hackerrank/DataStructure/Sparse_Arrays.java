package com.johny.bravo.hackerrank.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sparse_Arrays {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] collection_string = new String[n];
		for(int i=0; i<n; i++) {
			collection_string[i] = in.next();
		}
		int q_n = in.nextInt();
		String[] query_string = new String[q_n];
		for(int i=0; i<q_n; i++) {
			query_string[i] = in.next();
		}
		for(int i=0; i<q_n; i++) {
			System.out.println(find(collection_string, query_string[i]));
		}
	}
	
	public static int find(String[] collection_string, String s) {
		int count = 0;
		int n = collection_string.length;
		for(int i=0; i<n; i++) {
			if(collection_string[i].equalsIgnoreCase(s))
				count++;
		}
		return count;
	}

}
