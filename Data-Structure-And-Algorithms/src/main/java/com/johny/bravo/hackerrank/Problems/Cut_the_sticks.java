/* Problem Statement -----------------
 * You are given N sticks, where the length of each stick is a positive integer. 
A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.
Suppose we have six sticks of the following lengths: 
5 4 4 2 2 8
Then, in one cut operation we make a cut of length 2 from each of the six sticks. 
For the next cut operation four sticks are left (of non-zero length), whose lengths are the following: 
3 2 2 6
The above step is repeated until no sticks are left.
Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.
Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cut_the_sticks {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> tree = new LinkedList<Integer>();
		for(int i=0; i<n; i++) {
			tree.add(in.nextInt());
		}
		Collections.sort(tree);
		while(tree.contains(0))
			tree.remove(0);
		while(!tree.isEmpty()) {
			System.out.println(tree.size());
			Integer c = tree.get(0);
			for(int i =0; i<tree.size(); i++) {
				tree.set(i, tree.get(i)-c);
			}
			while(tree.contains(0))
				tree.remove(0);
		}
		in.close();
	}

}
