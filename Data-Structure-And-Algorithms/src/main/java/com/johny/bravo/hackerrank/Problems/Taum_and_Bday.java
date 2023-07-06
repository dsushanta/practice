package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Taum_and_Bday {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            System.out.println(calculateCost(b, w, x, y, z));
            in.close();
        }
    }
	public static long calculateCost(long b, long w, long x, long y, long z) {
		long cost = 0;
		if(x+z < y) {
			cost = b*x + w*(x+z);
		}
		else if (y+z < x) {
			cost = b*(y+z) + w*y;
		}
		else {
			cost = b*x + w*y;
		}
		return cost;
	}
}
