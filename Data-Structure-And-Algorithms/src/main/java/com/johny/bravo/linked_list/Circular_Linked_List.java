package com.johny.bravo.linked_list;

public class Circular_Linked_List {
	
	private Link_Int head;
	
	public Circular_Linked_List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public int count() {
		int c = 1;
		if(isEmpty())
			return 0;
		Link_Int temp = head.getNextLink();
		while(temp != head) {
			c++;
			temp = temp.getNextLink();
		}
		return c;
	}
	
	public void traverse() {
		if(isEmpty())
			return;
		Link_Int temp = head;
		System.out.print(temp.getValue());
		temp = temp.getNextLink();
		while(temp != head) {
			System.out.print(" --> "+temp.getValue()+" --> ");
			temp = temp.getNextLink();
		}
		System.out.println(temp.getValue());
	}
	
	public void addLinkFirst(int v) {
		Link_Int n = new Link_Int(v);
		if(isEmpty()) {
			head = n;
		}	
		else {
			n.setNext(head);
			head = n;
		}
		n.setNext(head);
	}

	public void addLinkLast(int v) {
		Link_Int n = new Link_Int(v);
		if(isEmpty())
			head = n;
		else {
			Link_Int last = getLastNode();
			last.setNext(n);
		}
		n.setNext(head);
	}
	
	public Link_Int getLastNode() {
		if(isEmpty())
			return null;
		Link_Int temp = head.getNextLink();
		while(temp.getNextLink() != head)
			temp = temp.getNextLink();
		return temp;
	}
	
}
