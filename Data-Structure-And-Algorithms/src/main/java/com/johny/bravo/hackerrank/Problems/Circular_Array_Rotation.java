/* Problem Statement ----------------------
 * John Watson performs an operation called a right circular rotation on an array of integers, [a0,a1,...an-1]. 
After performing one right circular rotation operation, the array is transformed from [a0,a1,...an-1] to [an-1,a0,a1,...an-2]. 
Watson performs this operation k times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, 
Watson asks q queries, where each query consists of a single integer, m , for which you must print the element at index m in the rotated array 
(i.e., the value of am).
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Circular_Array_Rotation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int q = in.nextInt();
	        int[] a = new int[n];
	        int[] b = new int[q];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        for(int a0 = 0; a0 < q; a0++){
	             b[a0] = in.nextInt();
	        }
	        if(k>n)
	        	k = k%n;
	        int[] temp1 = new int[k];
	        int[] temp2 = new int[n-k];
	        
	        for(int i=n-k,j=0; i<n; i++,j++) {
	        	temp1[j] = a[i];
	        }
	        for(int i=0; i<n-k; i++) {
	        	temp2[i] = a[i];
	        }
	        for(int i=0; i<k; i++)
	        	a[i] = temp1[i];
	        for(int i=k,j=0; i<n; i++,j++)
	        	a[i] = temp2[j];
		
		for(int i=0; i<q; i++)
			System.out.println(a[b[i]]);
		in.close();	
		}
	
}
