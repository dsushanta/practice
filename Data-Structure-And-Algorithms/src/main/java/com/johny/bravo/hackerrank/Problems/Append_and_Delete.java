/* Problem Statement ---------------
 * You have a string, s, of lowercase English alphabetic letters. 
You can perform two types of operations on s:
1. Append a lowercase English alphabetic letter to the end of the string.
2. Delete the last character in the string. Performing this operation on an empty string results in an empty string.
Given an integer, k, and two strings, s and t , 
determine whether or not you can convert s to t by performing exactly 
k of the above operations on s. 
If it's possible, print Yes; otherwise, print No.
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Append_and_Delete {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int m=0,n=0;
        int i;
        for(i=0;; i++) {
        	if((i == s.length()) && (i == t.length()))
        		break;
        	if(i == s.length())
        		break;
        	if(i == t.length())	
        		break;
        	if(s.charAt(i) != t.charAt(i))
        		break;
        }
        m = s.length() - i;
		n = t.length() - i;
		if(m+n > k)
			System.out.println("No");
		else if(m == 0) {
			if((k-n >= 2*s.length()) || (k-n)%2 == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("Yes");
		in.close();
	}
}
