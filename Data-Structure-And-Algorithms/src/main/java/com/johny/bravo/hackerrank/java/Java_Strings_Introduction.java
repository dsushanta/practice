package com.johny.bravo.hackerrank.java;

import java.util.Scanner;

public class Java_Strings_Introduction {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        String A=in.next();
        String B=in.next();

        int length_sum = A.length() + B.length();
        int compare_result = A.compareTo(B);
        String compare = null;
        if(compare_result > 0)
        	compare = "Yes";
        else
        	compare = "No";
        String capital_A = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capital_B = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(length_sum);
        System.out.println(compare);
        System.out.println(capital_A+" "+capital_B);
	}

}
