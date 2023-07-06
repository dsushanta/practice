package com.johny.bravo.hackerrank.DataStructure;

import java.util.Scanner;

import com.johny.bravo.stack_queue.queue_using_stack;

public class Queue_using_Two_Stacks {
	
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        queue_using_stack q_stack = new queue_using_stack();
        
        for(int i=0; i<q; i++) {
        	int ch = in.nextInt();
        	switch(ch) {
        	case 1:
        		int x = in.nextInt();
        		q_stack.enqueue(x);
        		break;
        	case 2:
        		q_stack.pop();
        		break;
        	case 3:
        		System.out.println(q_stack.peek());
        	}
        }
    }
}
