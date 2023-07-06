package com.johny.bravo.linked_list;

public class Link_Int {

	private int value;
	private Link_Int next;

	public Link_Int(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Link_Int getNextLink() {
		return this.next;
	}
	
	public void setNext(Link_Int next) {
		this.next = next;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
