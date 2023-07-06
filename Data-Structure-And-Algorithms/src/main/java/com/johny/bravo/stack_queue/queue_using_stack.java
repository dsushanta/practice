package com.johny.bravo.stack_queue;

import java.util.Stack;

public class queue_using_stack {

	Stack q;
	
	
	public queue_using_stack() {
		q = new Stack();
	}
	
	public void enqueue(int item) {
		q.add(item);
	}
	
	public int peek() {
		Stack tmp = new Stack();
		if(q.isEmpty())
			return -1;
		while(!q.isEmpty())
			tmp.add(q.pop());
		int x = (int) tmp.peek();
		while(!tmp.isEmpty())
			q.add(tmp.pop());
		tmp = null;
		return x;
	}
	
	public void pop() {
		Stack tmp = new Stack();
		if(q.isEmpty())
			return;
		while(!q.isEmpty())
			tmp.add(q.pop());
		tmp.pop();
		while(!tmp.isEmpty())
			q.add(tmp.pop());
	}
}
