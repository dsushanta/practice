package com.johny.bravo.rough;


public class Rough_A {

	class Node {
	    int data;
	    Node next;
	 }
	Node insert(Node head, Node item) {
	    Node cur = head;
	    Node prev = head;
	    while(cur != null) {
	        if(item.data > cur.data) {
	            prev = cur;
	            cur = cur.next;
	        }    
	        else {
	            if(cur == head) {
	                item.next = cur;
	                head = item;
	            }
	            else {
	                item.next = cur;
	                prev.next = item;
	            }
	           break;
	        }
	    }
	    return head;
	}

	Node MergeLists(Node headA, Node headB) {
	    if(headA == null)
	        return headB;
	    else if(headB == null)
	        return headA;
	    else {
	        Node l = headA;
	        while(l != null) {
	            headB = insert(headB, l);
	            l = l.next;
	        }
	        return headB;
	    }    
	}
}
