package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Chocolate_Feast {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int trips = in.nextInt();
		for(int i=0; i<trips; i++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			System.out.println(chocolates(n, c, m));
		}
		in.close();
	}

	public static int chocolates(int n, int c, int m) {
		int total = n/c, choco, wrap_left = n/c;
		while(wrap_left >= m) {
			choco = wrap_left/m;
			total += choco;
			wrap_left = choco + wrap_left%m;
		}
		return total;
	}
}
