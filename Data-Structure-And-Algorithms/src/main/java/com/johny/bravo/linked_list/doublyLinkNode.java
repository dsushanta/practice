package com.johny.bravo.linked_list;

import com.johny.bravo.tree.Node;

public class doublyLinkNode {
	private Node data;
	private doublyLinkNode prev;
	private doublyLinkNode next;
	
	public doublyLinkNode() {
		this.data = null;
		prev = null;
		next = null;
	}
	
	public Node getData() {
		return data;
	}
	public void setData(Node data) {
		this.data = data;
	}
	public doublyLinkNode getPrev() {
		return prev;
	}
	public void setPrev(doublyLinkNode prev) {
		this.prev = prev;
	}
	public doublyLinkNode getNext() {
		return next;
	}
	public void setNext(doublyLinkNode next) {
		this.next = next;
	}
	
	
}
