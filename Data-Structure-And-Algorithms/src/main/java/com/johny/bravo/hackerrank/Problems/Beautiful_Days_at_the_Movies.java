package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Beautiful_Days_at_the_Movies {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int p = in.nextInt();
		int count = 0;
		for(int i=m; i<=n; i++) {
			int rev = reversed(i);
			if(Math.abs(i - rev)%p == 0)
				count++;
		}
		System.out.println(count);
		in.close();
	}
	
	public static int reversed(int n) {
		int rev = 0;
		while(n > 0) {
			int a = n % 10;
			rev = rev*10 + a;
			n = n/10;
		}
		return rev;
	}

}
