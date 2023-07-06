package com.johny.bravo.hackerrank.DataStructure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Equal_Stack {

    public static void main(String[] args) {
//    	Stack h1 = new Stack();
//    	Stack h2 = new Stack();
//    	Stack h3 = new Stack();
    	
    	Queue h1 = new LinkedList<>();
    	Queue h2 = new LinkedList<>();
    	Queue h3 = new LinkedList<>();
    	
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        int s1=0, s2=0, s3=0, height;
        
        for(int h1_i=0; h1_i < n1; h1_i++){
            int t = in.nextInt();
            s1 += t;
        	h1.add(t);
        }
        
        for(int h2_i=0; h2_i < n2; h2_i++){
        	int t = in.nextInt();
            s2 += t;
            h2.add(t);
        }
        
        for(int h3_i=0; h3_i < n3; h3_i++){
        	int t = in.nextInt();
            s3 += t;
            h3.add(t);
        }
        
    	if(s1 < s2) {
    		if(s1 < s3)
    			height = s1;
    		else
    			height = s3;
    	} else {
    		if(s2 < s3)
    			height = s2;
    		else
    			height = s3;
    	}
        System.out.println(commonHeight(s1, s2, s3, n1, n2, n3, h1, h2, h3, height));
    }
    
    public static int commonHeight(int s1, int s2, int s3, int n1, int n2, int n3, Queue h1, Queue h2, Queue h3, int height) {
   
    	int r = 0;
    	int ss1 = s1, ss2 = s2, ss3 = s3;
    	for(int j = height; j >= 0; j--) {
    		int f1 = 0, f2 = 0, f3 = 0;   		
    		
    		while(ss1 > j) {
    			ss1 -= (int)h1.poll();
    		}
    		if(ss1 == j)
				f1 = 1;
    		
    		while(ss2 > j) {
    			ss2 -= (int)h2.poll();
    		}
    		if(ss2 == j)
				f2 = 1;
    		
    		while(ss3 > j) {
    			ss3 -= (int)h3.poll();
    		}
    		if(ss3 == j)
				f3 = 1;
    		
    		if(f1==1 && f2==1 && f3==1) {
    			r = j;
    			break;
    		}
    	}
    	return r;
    }
}
