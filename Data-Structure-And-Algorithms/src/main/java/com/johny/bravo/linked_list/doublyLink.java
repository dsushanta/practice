package com.johny.bravo.linked_list;

public class doublyLink {

	private int data;
	private doublyLink prev;
	private doublyLink next;
	
	public doublyLink(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	public int getData() {
		return data;
	}
	
	public doublyLink getprev() {
		return prev;
	}
	
	public doublyLink getnext() {
		return next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setprev(doublyLink node) {
		this.prev = node;
	}
	
	public void setnext(doublyLink node) {
		this.next = node;
	}
}
