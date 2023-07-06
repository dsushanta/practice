package com.johny.bravo.java_tutorial.recursion;

import java.util.Scanner;
import java.util.Stack;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("\nHow many Discs : ");
		int N = in.nextInt();
		System.out.println();
		char source = 'A';
		char destination = 'C';
		char aux = 'B';
		TOH t = new TOH();
		t.toh(N, source, destination, aux);
	}
	
}	

	class TOH {
		public void toh(int N, char s, char d, char a) {
			if(N == 0)
				return;
			toh(N-1, s, a, d);
			System.out.println("Disc "+N+" from "+s+" ---> "+d);
			toh(N-1, a, d, s);
		}
	}
