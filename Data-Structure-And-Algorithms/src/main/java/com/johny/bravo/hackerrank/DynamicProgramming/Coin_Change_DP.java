package com.johny.bravo.hackerrank.DynamicProgramming;

import java.util.Scanner;

public class Coin_Change_DP {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Boolean [][] check = new Boolean[n][m];
        long [][] table = new long[n][m];
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        for(int i=0; i<n; i++) {
        	for(int j=0; j<m; j++)
        		check[i][j] = false;
        }
        coin_change c = new coin_change();
        System.out.println(c.total(coins, n, m, check, table));
        in.close();
    }
}

class coin_change {
	public long total(int[] coins, int n, int m, Boolean [][] check, long [][] table) {
		long sum;
		if(n == 0)
			return 1;
		if(n < 0)
			return 0;
		if(n >0 && m <= 0)
			return 0;
		if(check[n-1][m-1])
			sum = table[n-1][m-1];
		else {			
			sum = total(coins, n, m-1, check, table) + total(coins, n-coins[m-1], m, check, table);
			check[n-1][m-1] = true;
			table[n-1][m-1] = sum;
		}	
		return sum;
	}
	 
}
