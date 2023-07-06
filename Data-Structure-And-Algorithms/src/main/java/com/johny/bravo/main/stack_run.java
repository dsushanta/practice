package com.johny.bravo.main;

import com.johny.bravo.stack_queue.stack_array;
import com.johny.bravo.stack_queue.stack_linked_list;

public class stack_run {

	public static void main(String[] args) {
		
		//stack_linked_list<String> st = new stack_linked_list<String>();
		
//		st.push("Joey");
//		st.push("Chandler");
//		st.push("Monica");
//		st.push("Phoebe");
//		st.push("Ross");
//		st.push("Rachel");
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		st.push("Gunther");
//		st.displayAll();
		
		stack_array sa = new stack_array();
		sa.push(9);
		sa.push(7);
		sa.display();
		sa.pop();
		sa.display();
	}

}
