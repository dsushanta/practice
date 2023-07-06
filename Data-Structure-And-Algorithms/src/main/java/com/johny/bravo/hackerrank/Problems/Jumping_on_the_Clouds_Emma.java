/* Problem Statement ------------------
 * Emma is playing a new mobile game involving n clouds numbered from 0 to n-1. 
A player initially starts out on cloud c0, and they must jump to cloud c(n-1). 
In each step, she can jump from any cloud i to cloud i+1 or cloud i+2.
There are two types of clouds, ordinary clouds and thunderclouds. 
The game ends if Emma jumps onto a thundercloud, but if she reaches the last cloud 
(i.e., c(n-1)), she wins the game!
Can you find the minimum number of jumps Emma must make to win the game? 
It is guaranteed that clouds c0 and c(n-1) are ordinary-clouds and it is always possible to win the game.
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Jumping_on_the_Clouds_Emma {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int steps = 0, count = 0;
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }
        for(int i=0; i < n; i++){
            if(c[i] == 0)
            	count++;
            if(c[i] == 1) {
            	steps = steps + step(count, 1);
            	count = 0;
            }
        }
        steps = steps + step(count-1, 2);
        System.out.println(steps);
        in.close();
    }
	
	public static int step(int n, int f) {
		if(f == 2) {
			if(n <= 0)
				return 0;
			if(n == 1)
				return 1;
			if(n%2 == 0)
				return n/2;
			else
				return (n/2) +1;
		}
		else {
			if(n <= 0)
				return 0;
			if(n == 1)
				return 1;
			else
				return (n/2) + 1;
		}
	}
}
