package com.johny.bravo.hackerrank.Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class Extra_Long_Factorials {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		BigInteger n  = BigInteger.valueOf(n1);
		System.out.println(fac(n));
		in.close();
	}
	
	public static BigInteger fac( BigInteger n) {
		if(n.equals(BigInteger.ONE))
			return BigInteger.ONE;
		return n.multiply(fac(n.subtract(BigInteger.ONE)));
	}
}
