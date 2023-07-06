package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Apple_and_Orange {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int a_count = 0;
        int o_count = 0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        for(int i=0; i<m; i++) {
        	if(apple[i] < 0)
        		continue;
        	if((apple[i]+a >= s) && (apple[i]+a <= t))
        		a_count++;
        }
        for(int i=0; i<n; i++) {
        	if(orange[i] > 0)
        		continue;
        	if((orange[i]+b >= s) && (orange[i]+b <= t))
        		o_count++;
        }
        System.out.println(a_count);
        System.out.println(o_count);
        in.close();
	}

}
