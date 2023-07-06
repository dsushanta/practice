/* Problem Statement ------------------------
 * You are given a square map of size n X n . Each cell of the map has a value denoting its depth. 
We will call a cell of the map a cavity if and only if this cell is not on the border of the map 
and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).
You need to find all the cavities on the map and depict them with the uppercase character X

Input Format :
The first line contains an integer, n, denoting the size of the map. 
Each of the following n lines contains n positive digits without spaces. 
Each digit (1-9) denotes the depth of the appropriate area.

Constraints : 
1<=n<=100

Output Format :
Output n lines, denoting the resulting map. 
Each cavity should be replaced with character X.

Sample Input : 
4
1112
1912
1892
1234

Sample output :
1112
1X12
18X2
1234
Explanation
The two cells with the depth of 9 fulfill all the conditions of the Cavity 
definition and have been replaced by X. 
 */

package com.johny.bravo.hackerrank.DynamicProgramming;

import java.io.IOException;
import java.util.Scanner;

public class Cavity_Map {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] map = new int[n][n];
		int[][] cavity = new int[n][n];
		String row = null;
		in.nextLine();							// important line - this is required to tackle a problem in scanner
		for(int i=0; i<n; i++) {				// please refere to cave of programming tutorial for scanner class
			row = in.nextLine();
			for(int j=0; j<row.length(); j++) {
				map[i][j] = Character.getNumericValue(row.charAt(j));
                cavity[i][j] = 0;
			}
		}
        
		for(int i=1; i<n-1;i++) {
			for(int j=1; j<n-1; j++) {
				if(cavity[i][j] == 2)
					continue;
				int status = check_cavity(map, cavity, i, j);
				if(status == 1)
					cavity[i][j] = status;
			}
		}
		
		print_cavity(map, cavity, n);
		in.close();
	}
	
	public static void print_cavity(int[][] map, int[][] cavity, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(cavity[i][j] == 1)
					System.out.print("X");
				else
					System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int check_cavity(int[][]map, int[][]cavity, int i, int j) {
		int status;
		int l, r, u, d;
		l = map[i][j] - map[i][j-1];
		r = map[i][j] - map[i][j+1];
		u = map[i][j] - map[i-1][j];
		d = map[i][j] - map[i+1][j];
		if((l>0) && (r>0) && (u>0) && (d>0)) {
			status = 1;
			mark_non_cavity(cavity, i, j);
		}	
		else
			status = 0;
		return status;
	}
	
	public static void mark_non_cavity(int[][]cavity, int i, int j) {
		cavity[i-1][j] = 2;
		cavity[i+1][j] = 2;
		cavity[i][j-1] = 2;
		cavity[i][j+1] = 2;
	}

}
