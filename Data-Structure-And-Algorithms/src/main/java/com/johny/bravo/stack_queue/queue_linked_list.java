package com.johny.bravo.stack_queue;

import com.johny.bravo.linked_list.Link_Int;
import com.johny.bravo.linked_list.Linked_List_Int;

public class queue_linked_list {
	
	private Link_Int front;
	private Link_Int rear;
	
	public queue_linked_list() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		if(front == null && rear == null)
			return true;
		else
			return false;
	}
	
	public void enqueue(int item) {
		Link_Int new_link = new Link_Int(item);
		if(isEmpty()) {
			front = new_link;
			rear = new_link;
		}
		else {
			rear.setNext(new_link);
			rear = new_link;
		}
	}
	
	public int dequeue() {
		if(isEmpty())
			return -1;
		int item = front.getValue();
		if(front == rear) {
			front = null;
			rear = null;
		}
		else
			front = front.getNextLink();
		return item;
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("\n Queue is empty !!");
		Link_Int l = front;
		while(l != null) {
			System.out.print(l.getValue()+" ");
			l=l.getNextLink();
		}
	}
}
