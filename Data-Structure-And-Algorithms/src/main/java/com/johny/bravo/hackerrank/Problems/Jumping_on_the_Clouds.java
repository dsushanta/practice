package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Jumping_on_the_Clouds {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }
        int e = 100;
        int i = 0;
        do {
        	e = e-1; 	
        	i = (i+k)%n;
        	if(c[i] == 1)
        		e = e-2;
        }while(i != 0);
        System.out.println(e);
        in.close();
	}

}
