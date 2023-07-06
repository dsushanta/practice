package com.johny.bravo.linked_list;

public class Detect_Loop_In_Linked_List {

	public static void main(String[] args) {
		link head;
		
		link l1 = new link(1);
		link l2 = new link(2);
		link l3 = new link(3);
		link l4 = new link(4);
		link l5 = new link(5);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l3;
		
		head = l1;
		
		System.out.println(detect_loop(head));
		detect_and_remove_loop(head);
		System.out.println(detect_loop(head));
	}
	
	public static boolean detect_loop(link head) {
		link slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			System.out.println(slow.data+" : "+fast.data);
			if(slow == fast)
				return true;
		}
		return false;
	}
	
	public static boolean detect_and_remove_loop(link head) {
		link slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			System.out.println(slow.data+" : "+fast.data);
			if(slow == fast) {
				remove_loop(head, slow);
				return true;
			}	
		}
		return false;
	}
	
	public static void remove_loop(link head, link slow) {
		
		link h = head, s = slow;
		while(true) {
			while(s.next != slow && s.next != h)
				s = s.next;
			if(s.next == h) {
				s.next = null;
				break;
			}	
			else
				h = h.next;
		}
		
	}
}


class link {
	public int data;
	public link next;
	
	public link(int d) {
		data = d;
	}
}
