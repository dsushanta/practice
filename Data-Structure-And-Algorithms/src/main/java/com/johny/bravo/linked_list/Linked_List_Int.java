package com.johny.bravo.linked_list;

import java.util.Stack;

public class Linked_List_Int {

	public Link_Int head;
	
	public Linked_List_Int() {
		head = null;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	
	
	public void addLinkFirst(int value) {
		Link_Int new_link = new Link_Int(value);
		new_link.setNext(head);
		head = new_link;
	}
	
	public void addLinkLast(int value) {
		Link_Int new_link = new Link_Int(value);
		Link_Int l = head;
		while(l.getNextLink() != null)
			l = l.getNextLink();
		l.setNext(new_link);
	}
	
	public int removeFirst() {
		if(!isEmpty()) {
			Link_Int to_be_removed = head;
			head = head.getNextLink();
			int value = to_be_removed.getValue();
			to_be_removed = null;
			return value;
		} else {
			return -1;
		}
	}
	
	public void displayAll() {
		System.out.println("-------------------------------------------------------");
		Link_Int l = head;
		while(l != null) {
			System.out.print(l.getValue()+" ");
			l = l.getNextLink();
		}
		System.out.println("-------------------------------------------------------");
	}
	
	public void displayLL(Link_Int ll) {
		System.out.println("-------------------------------------------------------");
		Link_Int l = ll;
		while(l != null) {
			System.out.print(l.getValue()+" ");
			l = l.getNextLink();
		}
		System.out.println("-------------------------------------------------------");
	}
	
	public int removeLink(int item) {	
		Link_Int currentLink = head;
		Link_Int prevLink = head;
		
		while(!(currentLink.getValue() == item)) {
			if(currentLink.getNextLink() == null) {
				System.out.println("Not Found");
				return -1;
			}	
			else {
				prevLink = currentLink;
				currentLink = currentLink.getNextLink();
			}
		}
		/*while(true) {
			if(currentLink.getValue() == item)
				break;
			else if(currentLink.getNextLink() == null) {
				System.out.println("Not Found");
				return -1;
			}	
			else {
				prevLink = currentLink;
				currentLink = currentLink.getNextLink();
			}
		}*/
		int a = currentLink.getValue();
		if(currentLink == head)
			head = head.getNextLink();
		else {
			prevLink.setNext(currentLink.getNextLink());
		}
		currentLink = null;
		return a;
	}
	
	public void printReverse() {
		printReverse(head);
	}
	
	private void printReverse(Link_Int l) {
		if(l == null)
			return;
		printReverse(l.getNextLink());
		System.out.println(l.getValue());
	}
	
	public void reverseRec() {
		Link_Int cur, prev;
		cur = head;
		prev = null;
		reverseRec(cur, prev);
	}
	
	private Link_Int reverseRec(Link_Int cur, Link_Int prev) {	
		if(cur == null) {
			head = prev;
			return prev;
		}
		cur = reverseRec(cur.getNextLink(), cur);
		cur.setNext(prev);
		return prev;
	}
	
	public void reverseIterative() {
		Link_Int cur, prev, next;
		cur = head;
		prev = null;
		while(cur !=null) {
			next = cur.getNextLink();
			cur.setNext(prev);
			prev = cur;
			cur = next;
		}
		head = prev;
	}
	
	public Link_Int reverseIterative(Link_Int h) {
		Link_Int cur, prev, next;
		cur = h;
		prev = null;
		while(cur !=null) {
			next = cur.getNextLink();
			cur.setNext(prev);
			prev = cur;
			cur = next;
		}
		h = prev;
		return h;
	}
	
	public void reverseStack() {
		Stack<Link_Int> s = new Stack<Link_Int>();
		Link_Int l = head;
		while (l != null) {
			s.push(l);
			l = l.getNextLink();
		}
		Link_Int temp = s.pop();
		head = temp;
		while(s.isEmpty() != true) {
			temp.setNext(s.pop());
			temp = temp.getNextLink();
		}	
		temp.setNext(null);
	}
	
	
	
	public void separate() {
		Link_Int odd, even, cur, even_h;
		even_h = null;
		even = null;
		odd = null;
		cur = head;
		while(cur != null) {
			if(cur.getValue()%2 == 0) {
				if(even != null)
					even.setNext(cur);
				else 
					even_h = cur;
				even = cur;
			}	
			else {
				if(odd != null)
					odd.setNext(cur);
				else
					head = cur;
				odd = cur;
			}	
			cur = cur.getNextLink();
		}
		odd.setNext(even_h);
		even.setNext(null);
	}
	
	private boolean compare(Link_Int h1, Link_Int h2) {
		Link_Int l1 = h1;
		Link_Int l2 = h2;
		while(l1 !=null && l2 != null) {
			if(l1.getValue() == l2.getValue()) {
				l1 = l1.getNextLink();
				l2 = l2.getNextLink();
			}
			else
				return false;
		}
		if(l1 == null && l2 == null)
			return true;
		return false;
	}
	
	public boolean isPalindrome() {
		
		Link_Int fast, slow, mid, slow_prev;
		boolean b = true;	
		fast = head;
		slow = head;
		mid = null;
		slow_prev = head;
		if(head != null && head.getNextLink() != null) {
			while(fast != null && fast.getNextLink() != null) {
				fast = fast.getNextLink().getNextLink();
				slow_prev = slow;
				slow = slow.getNextLink();
			}
			
			if(fast != null) {
				mid = slow;
				slow = slow.getNextLink();
			}
			slow_prev.setNext(null);
			slow = reverseIterative(slow);
			b = compare(head, slow);
			slow = reverseIterative(slow);		
			if(mid != null) {
				mid.setNext(slow);
				slow = mid;
			}	
			slow_prev.setNext(slow);
		}
		return b;
	}
	
	public int count() {
		int count = 0;
		Link_Int l = head;		
		while(l!=null) {
			count++;
			l = l.getNextLink();
		}
		return count;
	}

	public int get_node(int pos) {
		Link_Int l = head;
		int size = count();
		int pos_start = size - pos;
		for(int i=0; i<pos_start-1; i++) {
			l = l.getNextLink();
		}
		return l.getValue();
	}
	
}
 