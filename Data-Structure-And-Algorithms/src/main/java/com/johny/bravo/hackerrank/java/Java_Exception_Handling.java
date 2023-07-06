package com.johny.bravo.hackerrank.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Exception_Handling {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		try {
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println(x/y);
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(InputMismatchException i) {
			System.out.println("java.util.InputMismatchException");
		}
	}

}
