package com.johny.bravo.stack_queue;

public class stack_array {
	private int size;
	private int stack[];
	private int top;

	public stack_array() {
		size = 10;
		stack = new int[size];
		top = -1;
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(int item) {
		if(top < size-1) {
			stack[++top] = item;
		}
		else {
			int stack_new[] = new int[2*size];
			for(int i=0; i<=top; i++)
				stack_new[i] = stack[i];
			stack = stack_new;
			size = 2*size; 
			stack[++top] = item;
		}
	}
	
	public int pop() {
		int item = stack[top--];
		return item;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("\n Stack is Empty !!");
			return;
		}	
		for(int i=0; i<=top; i++)
			System.out.println(stack[i]);
	}
	
	public int findMax() {
		int max = stack[top];
		for(int i=top-1; i>=0; i--) {
			if(stack[i] > max)
				max = stack[i];
		}
		return max;
	}
}
