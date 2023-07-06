package com.johny.bravo.linked_list;

public class D_Link_List {

	public doublyLink head;
	
	public D_Link_List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void insert_at_end(int data) {
		doublyLink d = new doublyLink(data);
		if(isEmpty())
			head = d;
		else {
			doublyLink dl = head;
			while(dl.getnext() != null)
				dl = dl.getnext();
			dl.setnext(d);
			d.setprev(dl);
		}
	}
	
	public void display_forward() {
		if(isEmpty())
			return;
		doublyLink dl = head;
		while(dl != null) {
			System.out.print(dl.getData()+" ");
			dl = dl.getnext();
		}	
		System.out.println("\n");
	}
	
	public void SortedInsert(int data) {
		doublyLink item = new doublyLink(data);
	    boolean f = false;
	    
	    if(isEmpty()) {
	        head = item;
	    }
	    else {
	    	doublyLink l = head;
	        while(l != null) {
	            if((item.getData() > l.getData()) && (l.getnext() == null)) {
	                l.setnext(item);
	            	item.setprev(l);
	            	f = true;
	            }
	            else if(item.getData() > l.getData()) {
	            	l = l.getnext();
	            }
	            else {
	                l.getprev().setnext(item);
	                item.setnext(l);
	                item.setprev(l.getprev());
	                l.setprev(item);
	                f = true;
	            }
	            if(f)
	                break;
	        }
	    }
	}
	
	public void Reverse() {
	    doublyLink cur = head;
	    if((head == null) || (head.getnext() == null))
	        return;
	    else
	        Rev(cur);
	}

	public doublyLink Rev(doublyLink cur) {
	    if(cur.getnext() == null) {
	        cur.setprev(null);
	        head = cur;
	}
	    else {
	        doublyLink t = Rev(cur.getnext());
	        cur.setprev(t);
	        t.setnext(cur);
	        cur.setnext(null);
	    }
	    return cur;
	}
}
