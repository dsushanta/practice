package com.johny.bravo.misc;

import java.util.Stack;

public class utills {

	public int[] reverseStack(int a[]) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0; i<a.length; i++)
			s.push(a[i]);
		for(int i=0; i<a.length; i++)
			a[i] = s.pop();
		
		return a;
	}
	
	public void displayIntArray(int[] a) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
	}
}
