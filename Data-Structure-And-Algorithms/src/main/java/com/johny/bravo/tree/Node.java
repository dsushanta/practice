package com.johny.bravo.tree;

public class Node {

	private Comparable data;
	private Node left;
	private Node right;
	
	public Node(Comparable data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public Comparable getData() {
		return data;
	}
	
	public Node getLeftChild() {
		return left;
	}
	
	public Node getRightChild() {
		return right;
	}
	
	public void setData(Comparable data) {
		this.data = data;
	}
	
	public void setLeftChild(Node node) {
		this.left = node;
	}
	
	public void setRightChild(Node node) {
		this.right = node;
	}
}
