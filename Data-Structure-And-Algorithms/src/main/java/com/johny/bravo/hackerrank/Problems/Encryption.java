/* Problem Statement -------------------------
 * An English text needs to be encrypted using the following encryption scheme. 
First, the spaces are removed from the text. Let L be the length of this text. 
Then, characters are written into a grid, whose rows and columns have the following constraints:
Floor(sqrt(L)) <= rows <= columns <= Ceil(sqrt(L))  
For example, the sentence "if man was meant to stay on the ground god would have given us roots" 
after removing spaces is 54 characters long, so it is written in the form of a grid with 7 rows and 8 columns. 

ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots

Ensure that rows X columns >= L
If multiple grids satisfy the above conditions, choose the one with the minimum area, 
i.e. rows X columns
 
The encoded message is obtained by displaying the characters in a column, inserting a space, 
and then displaying the next column and inserting a space, and so on. 
For example, the encoded message for the above rectangle is: 

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau 

You will be given a message in English with no spaces between the words. The maximum message length can be 

81 characters. Print the encoded message.
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = s.length();
		double[] d = dim(n);
		int row = (int)d[0];
		int col = (int)d[1];
		System.out.println(row+" "+col);
		List<String> words = new ArrayList<String>();
		for(int i=0; i<n; i=i+col) {
			int j;
			if(i+col<n)
				j = i+col;
			else 
				j = n;
			String w = s.substring(i, j);
			words.add(w);
		}
		for(String k : words)
			System.out.println(k);
		String encrypted = "";
		for(int i=0; i<col; i++) {
			String ww = "";
			for(int j=0; j<words.size(); j++) {
				if(i<words.get(j).length())
					ww = ww+words.get(j).charAt(i); 
			}
			encrypted = encrypted + ww + " ";
		}
		System.out.println(encrypted);
		in.close();
	}
	
	public static double[] dim(int n) {
		double[] d = new double[2];
		double r = Math.floor(Math.sqrt(n));
		double c = Math.ceil(Math.sqrt(n));
		if(r*c >= n) {
			d[0] = r;
			d[1] = c;
		}
		else {
			d[0] = r+1;
			d[1] = c;
		}
		return d;
	}

}
