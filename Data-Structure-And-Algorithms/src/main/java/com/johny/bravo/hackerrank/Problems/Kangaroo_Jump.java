/* Problem Statement --------------
 * There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). 
The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump. 
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump. 
Given the starting locations and movement rates for each kangaroo, can you determine if they'll ever land at the same location at the same time?
 * 
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Kangaroo_Jump {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int d1 = x1; 
        int d2 = x2;
        
        for(int i=0; ; i++) {
        	d1 = x1 + i * v1;
        	d2 = x2 + i * v2;
        	if((d1 > d2) && (v1 >= v2)) {
        		System.out.println("NO");
        		break;
        	}	
        	if((d1 < d2) && (v1 <= v2)) {
        		System.out.println("NO");
        		break;
        	}
        	if(d1 == d2) {
        		System.out.println("YES");
        		break;
        	}	
        }
        in.close();
	}
	
}
