package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Primary_Number_Optimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int[] numbers = new int[p];
        for(int a0 = 0; a0 < p; a0++){
        	numbers[a0] = in.nextInt();
        }
        for(int a0 = 0; a0 < p; a0++){
            System.out.println(primary_check(numbers[a0]));
        }
        in.close();
	}
	public static String primary_check(int p) {
		if(p<1)
            return "Not prime";
        if(p == 1)
            return "Not prime";
		for(int i=2; i<=(int)Math.sqrt(p); i++) {
        	if(p%i == 0)
        		return "Not prime";
        }
		return "Prime";
	}

}
