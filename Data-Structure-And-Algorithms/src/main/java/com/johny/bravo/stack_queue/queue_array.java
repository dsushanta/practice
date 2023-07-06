package com.johny.bravo.stack_queue;

public class queue_array {

	int size;
	int front, rear;
	int arr[];
	
	public void printPointers() {
		System.out.println(front+" "+rear);
	}
	
	public queue_array() {
		size = 10;
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if((rear+1)%size == front)
			return true;
		else
			return false;
	} 
	
	public void enqueue(int item) {
		if(isEmpty()) {
			front = 0;
			rear = 0;
		}
		else if(isFull()) {
			System.out.println("\n Queue is Full");
			return;
		}
		else
			rear = (rear+1)%size;
		arr[rear] = item;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("\n Queue is empty !! ");
			return -1;
		}
		int item = arr[front];
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		else
			front = (front+1)%size; 
		return item;
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("\n Queue is empty !!");
		else {
			for(int i=front; i<=rear; i = (i+1)%size)
				System.out.print(arr[i]+" ");
		}
	}
}
