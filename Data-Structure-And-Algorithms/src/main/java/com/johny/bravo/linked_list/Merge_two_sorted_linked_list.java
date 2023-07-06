package com.johny.bravo.linked_list;

public class Merge_two_sorted_linked_list {

	public static void main(String[] args) {
		lnk h1, h2, h, tmp;
		
		h1 = new lnk(1);
		tmp = h1;
		tmp.next = new lnk(3);
		tmp = tmp.next;
		tmp.next = new lnk(5);
		tmp = tmp.next;
		tmp.next = new lnk(7);
		
		h2 = new lnk(2);
		tmp = h2;
		tmp.next = new lnk(4);
		tmp = tmp.next;
		tmp.next = new lnk(6);
		tmp = tmp.next;
		tmp.next = new lnk(8);
		tmp = tmp.next;
		tmp.next = new lnk(10);
		tmp = tmp.next;
		tmp.next = new lnk(12);
		
		display(h1);
		display(h2);
		
		h = merge(null,h2);
//		h = merge(h1,h2);
		display(h);
		
	}
	
	public static void display(lnk h) {
		lnk tmp = h;
		while(tmp != null) {
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}	
		System.out.println();
	}
	
	public static lnk merge(lnk h1, lnk h2) {
		lnk h = null, tmp =  null;
		if(h1 == null) {
			h = h2;
			tmp = h2;
			h2 = h2.next;
			while(h2 != null) {
				tmp.next = h2;
				h2 = h2.next;
				tmp = tmp.next;
			}
		}
		
		else if(h2 == null) {
			h = h1;
			tmp = h1;
			h1 = h1.next;
			while(h1 != null) {
				tmp.next = h1;
				h1 = h1.next;
				tmp = tmp.next;
			}
		}
		
		while(h1 != null && h2 != null) {
			if(h == null)
			{
				if(h1.data < h2.data) {
					h = h1;
					h1 = h1.next;	
				}
				else {
					h = h2;
					h2 = h2.next;
				}
				tmp = h;
			}
			else {
				if(h1.data < h2.data) {
					tmp.next = h1;
					h1 = h1.next;	
				}
				else {
					tmp.next = h2;
					h2 = h2.next;
				}
				tmp = tmp.next;
			}
		}
		if(h1 != null) {
			while(h1 != null) {
				tmp.next = h1;
				h1 = h1.next;
				tmp = tmp.next;
			}
		}
		
		if(h2 != null) {
			while(h2 != null) {
				tmp.next = h2;
				h2 = h2.next;
				tmp = tmp.next;
			}
		}
		return h;
	}
}

class lnk {
	public int data;
	public lnk next;
	
	public lnk(int d) {
		data = d;
	}
}
