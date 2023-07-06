package com.johny.bravo.stack_queue;

import com.johny.bravo.linked_list.Link_Int;

public class stack_linked_list<Item> {
	
	private Link_Int top;
	
	public stack_linked_list() {
		top = null;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int thing) {
		Link_Int new_link = new Link_Int(thing);
		new_link.setNext(top);
		top = new_link;
	}
	
	public int pop() {
		if(!isEmpty()) {
			Link_Int to_be_removed = top;
			top = top.getNextLink();
			int thing = to_be_removed.getValue();
			to_be_removed = null;
			return thing;
		} else {
			return -1;
		}
	}
	
	public void displayAll() {
		System.out.println("-------------------------------------------------------");
		Link_Int l = top;
		while(!(l == null)) {
			System.out.println(l.getValue());
			l = l.getNextLink();
		}
		System.out.println("-------------------------------------------------------");
	}

}
