/*
 * 
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Designer_PDF_Viewer {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int i=0; i < n; i++){
            h[i] = in.nextInt();
        }
        String word = in.next();
        int length = word.length();
        Set<Integer> heights = new TreeSet<Integer>();
        for(int i=0; i<length; i++) {
        	int val = get_height(word.charAt(i), h);
        	heights.add(val);
        	System.out.println(val);
        }
        Integer[] t = heights.toArray(new Integer[0]);
        Integer width = t[t.length-1];
        Integer dim = length * width;
        System.out.println(dim);
        in.close();
	}
	public static int get_height(char c, int[] h) {
		int val = 0;
		switch(c) {
			case 'a' : 
				val = h[0];
				break;
			case 'b' : 
				val = h[1];
				break;
			case 'c' : 
				val = h[2];
				break;
			case 'd' : 
				val = h[3];
				break;
			case 'e' : 
				val = h[4];
				break;
			case 'f' : 
				val = h[5];
				break;
			case 'g' : 
				val = h[6];
				break;
			case 'h' : 
				val = h[7];
				break;
			case 'i' : 
				val = h[8];
				break;
			case 'j' : 
				val = h[9];
				break;
			case 'k' : 
				val = h[10];
				break;
			case 'l' : 
				val = h[11];
				break;
			case 'm' : 
				val = h[12];
				break;
			case 'n' : 
				val = h[13];
				break;
			case 'o' : 
				val = h[14];
				break;
			case 'p' : 
				val = h[15];
				break;
			case 'q' : 
				val = h[16];
				break;
			case 'r' : 
				val = h[17];
				break;
			case 's' : 
				val = h[18];
				break;
			case 't' : 
				val = h[19];
				break;
			case 'u' : 
				val = h[20];
				break;
			case 'v' : 
				val = h[21];
				break;
			case 'w' : 
				val = h[22];
				break;
			case 'x' : 
				val = h[23];
				break;
			case 'y' : 
				val = h[24];
				break;
			case 'z' : 
				val = h[25];
				break;
		}	
		return val;
	}
}
