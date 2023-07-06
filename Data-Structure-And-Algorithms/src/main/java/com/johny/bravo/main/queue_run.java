package com.johny.bravo.main;

import com.johny.bravo.stack_queue.queue_array;
import com.johny.bravo.stack_queue.queue_linked_list;

public class queue_run {
	
	public static void main(String args[]) {
		queue_array q = new queue_array();
		q.display();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		System.out.println();
		q.display();
		System.out.println();
		q.dequeue();
		q.dequeue();
		q.display();
		System.out.println();
		q.enqueue(7);
		q.display();
		System.out.println();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.printPointers();
		q.display();
	}
}
