package com.johny.bravo.hackerrank.java;

import java.util.Scanner;

public class java_2d_array_hourglass {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = -999999;
        int s;
        for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				s = houglass_sum(arr, i, j);
				if(s>max)
					max = s;
			}
		}
        System.out.println(max);
    }
	
	public static int houglass_sum(int[][] arr, int m, int n) {
		int sum = 0;
		for(int i=m; i<m+3; i++) {
			for(int j=n; j<n+3; j++) {
				if(i==m+1 && j!=n+1)
					continue;
				sum += arr[i][j];
			}
		}
		return sum;
	}

}
