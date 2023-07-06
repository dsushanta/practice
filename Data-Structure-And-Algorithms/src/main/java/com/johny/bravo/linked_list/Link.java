package com.johny.bravo.linked_list;

public class Link<Item> {

	public Item content;
	public Link next;

	public Link(Item content) {
		this.content = content;
	}
	
	public Item getContent() {
		return this.content;
	}
	
	public Link getNextLink() {
		return this.next;
	}
}
