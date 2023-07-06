package com.johny.bravo.hackerrank.DataStructure;

import java.io.*;
import java.util.*;

class queue_using_stack {

	Stack inbox, outbox;
	
	public queue_using_stack() {
		inbox = new Stack();
		outbox = new Stack();
	}
	
	public void enqueue(int item) {
		inbox.add(item);
	}
	
	public int peek() {
		if(outbox.isEmpty()) {
			while(!inbox.isEmpty()) {
				outbox.push(inbox.pop());
			}
		}
		return (int) outbox.peek();
	}
	
	public void pop() {
		if(outbox.isEmpty()) {
			while(!inbox.isEmpty()) {
				outbox.push(inbox.pop());
			}
		}
		outbox.pop();
	}
}

public class s {
	
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