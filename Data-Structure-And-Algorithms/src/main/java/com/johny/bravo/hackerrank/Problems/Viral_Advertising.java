package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Viral_Advertising {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int people = 5;
		int like = 2;
		for(int i=2; i<=n; i++) {
			people = (people/2) * 3;
			like = like + people/2;
		}
		System.out.println(like);
		in.close();
	}

}
