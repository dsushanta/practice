package com.johny.bravo.hackerrank.DataStructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[m];
            for(int a_i=0; a_i < m; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[n];
            for(int b_i=0; b_i < n; b_i++){
                b[b_i] = in.nextInt();
            }
            System.out.println(maxNumbers(m, n, x, a, b));
        }
    }
    
    public static int maxNumbers(int m, int n, int x, int[] a, int[] b) {
    	
    	int sum = 0, sum1;
    	Set number = new TreeSet();
    	
    	int c=0, c1=0, i, j=0, element=0;
    	for(i=0; i<m; i++) {
    		c1 = 0;
    		sum1 = 0;
    		if(sum+a[i] < x) {
    			sum += a[i];
    			c++;
    		}	
    		c1 = c;
    		sum1 = sum;
    		for(j=0; j<n; j++) {		
        		sum1 += b[j];
        		if(sum1 < x) {
        			c1++;
        		}
        		else {
        			number.add(c1);
        			break;
        		}
        	}
    	}
    	if(i == m || j == n)
    		number.add(c1);
    	//Collections.sort(number);
    	if(number.isEmpty())
    		return 0;
    	else {
    		Iterator iterator = number.iterator();
    		while(iterator.hasNext()){
    		  element = (int) iterator.next();
    		}
    		//System.out.println(number);  		
    		return element;
    	}
    }
}
