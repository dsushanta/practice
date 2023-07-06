/* Problem Statement ----------
 * A jail has N prisoners, and each prisoner has a unique id number, S, ranging from 1 to N. 
There are M sweets that must be distributed to the prisoners. 
The jailer decides the fairest way to do this is by sitting the prisoners down in a circle 
(ordered by ascending S), and then, starting with some random S, 
distribute one candy at a time to each sequentially numbered prisoner until all M
candies are distributed. 
For example, if the jailer picks prisoner S=2, then his distribution order would be 
(2,3,4,5,...,n-1,n,1,2,3,4,...) until all M sweets are distributed.
But wait—there's a catch—the very last sweet is poisoned! 
Can you find and print the ID number of the last prisoner to receive a sweet so he can be warned?
 * 
 */
package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Save_the_Prisoner {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0; i<t; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int s = in.nextInt();
			save(n,m,s);
		}
		in.close();
	}
	
	public static void save(int n, int m, int s) {
		m = m % n;
		long v = (s+m-1)%n;
		if(v == 0)
			v = n;
		System.out.println(v);
//		while(m > 1) {
//			i = (i+1)%n;
//			m--;
//		}
//		System.out.println(i);
	}

}
