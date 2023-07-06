package com.johny.bravo.hackerrank.Problems;
/* Problem Statement -----------
 * Given a square matrix of size N x N , calculate the absolute difference between the sums of its diagonals.
Input Format :
The first line contains a single integer, N. The next N lines denote the matrix's rows,
with each line containing N space-separated integers describing the columns.
Output Format :
Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 */
import java.util.Scanner;

public class Diagonal_Difference {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				matrix[i][j] = in.nextInt();
		}
		
		System.out.println(diagonal_diff(matrix, n));
		in.close();
	}
	
	public static int diagonal_diff(int[][] matrix, int n) {
		int l_diagonal = 0;
		int r_diagonal = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j)
					l_diagonal += matrix[i][j];
				if(i+j == n-1)
					r_diagonal += matrix[i][j];
			}
		}
		return Math.abs(l_diagonal - r_diagonal);
	}

}
