/* Problem Statement ----------------------
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. 
For example, if 2 left rotations are performed on array [1,2,3,4,5] , then the array would become [3,4,5,1,2].
Given an array of n integers and a number, d , perform d left rotations on the array. 
Then print the updated array as a single line of space-separated integers.
*/

package com.johny.bravo.hackerrank.DataStructure;

import java.util.Scanner;

public class Arrays_left_rotation {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int size = reader.nextInt();
		int d = reader.nextInt();
		int[] items = new int[size];
		for(int i=0; i<size; i++) {
			items[i] = reader.nextInt();
		}
		/*int d = 4;
		int[] items = {1,2,3,4,5};*/
		display(items);
		if(d != items.length)
			items = rotate_left(items,d);
		System.out.println("");
		display(items);
		reader.close();
	}
	public static int[] rotate_left(int[] items, int d) {
		
		int[] tmp = new int[d];
		for(int i=0; i<d; i++)
			tmp[i] = items[i];
		for(int j=0, k=d; k<items.length ; j++, k++) {
			items[j] = items[k];
		}
		for(int i=items.length-d, j=0; i<items.length;i++, j++ ) {
			items[i] = tmp[j];
		}
		return items;
	}

	public static void display(int[] items) {
		for(int i=0; i<items.length; i++) {
			System.out.print(items[i]+" ");
		}
	}
}
