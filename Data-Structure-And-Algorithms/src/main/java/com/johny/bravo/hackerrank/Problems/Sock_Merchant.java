package com.johny.bravo.hackerrank.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sock_Merchant {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> c = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			int col = in.nextInt();
			if(c.containsKey(col)) {
				Integer v = c.get(col);
				c.put(col, v+1);
			}
			else {
				c.put(col, 1);
			}	
		}
		int count = 0;
		for(Integer key : c.keySet()) {
			int u = c.get(key) / 2;
			count += u;
		}
		System.out.println(count);
		in.close();
	}

}
