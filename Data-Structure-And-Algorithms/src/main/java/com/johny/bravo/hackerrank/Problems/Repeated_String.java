/* Problem Statement -----------
 * Lilah has a string, s , of lowercase English letters that she repeated infinitely many times.
Given an integer, n , find and print the number of letter a's in the first n letters of Lilah's infinite string.
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Repeated_String {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long no_of_a = number_of_a(s, s.length());
        long m = n / s.length();
        long e = n % s.length();
        long extra_a = number_of_a(s, e);
        long total = m * no_of_a + extra_a;
        System.out.println(total);
        in.close();
    }
	public static long number_of_a(String s, long n) {
		long count = 0;
		for(int i=0; i<n; i++) {
			if(s.charAt(i) == 'a')
				count++;
		}
		return count;
	}
}
