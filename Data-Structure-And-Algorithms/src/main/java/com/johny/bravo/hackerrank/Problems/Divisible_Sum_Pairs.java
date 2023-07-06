/* Problem Statement ------------
 * You are given an array of n integers, {a0,a1,...,an-1} and a positive integer k. 
Find and print the number of (i,j) pairs where i<j and ai+aj is evenly divisible by k. 

 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Divisible_Sum_Pairs {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int count = 0;
        for(int i=0; i<n; i++) {
        	if(a[i]%k == 0) {
        		for(int j=i+1; j<n; j++) {
        			if(a[j]%k == 0)
        				count++;
        		}
        	}
        	if(a[i]%k != 0) {
        		for(int j=i+1; j<n; j++) {
        			if((a[i] + a[j])%k == 0)
        				count++;
        		}
        	}
        }
        System.out.println(count);
        in.close();
	}

}
