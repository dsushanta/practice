/* Problem Statement ---------------
 * Davis has s staircases in his house and he likes to climb each staircase 1,2 or 3 steps at a time. Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.
Given the respective heights for each of the s staircases in his house, find and print the number of ways he can climb each staircase on a new line. 
Explanation
Let's calculate the number of ways of climbing the first two of the Davis' s=3 staircases:
The first staircase only has n=1 step, so there is only one way for him to climb it (i.e., by jumping 1 step). 
Thus, we print 1 on a new line.
The second staircase has n=3 steps and he can climb it in any of the four following ways: 

1. 1->1->1
2. 1->2
3. 2->1
4. 3

Thus, we print 4 on a new line.
 */

package com.johny.bravo.hackerrank.Problems;

import java.util.Scanner;

public class Davis_Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        
        int[] staircases = new int[s];
        for(int i = 0; i < s; i++){
            staircases[i] = in.nextInt();
        }
        int steps = 3;
        for(int i = 0; i < s; i++){
        	int[] t = new int[staircases[i]+2];
        	for(int j=0; j<=staircases[i]+1; j++)
        		t[j] = -1;
            System.out.println(waysToClimb(staircases[i]+1, steps, t));
        }
        in.close();
	}
	
	public static int waysToClimb(int n, int steps, int[] t) {
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		if(t[n] != -1)
			return t[n];
		int sum =0;
		for(int i=1; i<=steps; i++) {
			sum = sum + waysToClimb(n-i, steps, t);
		}
		t[n] = sum;
		return sum;
	}
	
	/* Explaination
	 * Let's say m=2 for this example
	 * waysToClimb(n) = 	-> ways to climb the staircase by taking 1 step or 2 steps
	 * 		waysToClimb(n-1)  -> if I climb one step at a time -> It means I have already taken 1 step and trying to climb the remaining n-1 steps
	 * 			+
	 * 		waysToClimb(n-1)  -> if I climb two steps at a time -> It means I have already taken 2 steps(2 steps at one go) and trying to climb the remaining n-2 steps
	 */

}
