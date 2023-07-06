package com.johny.bravo.main;

import java.util.Scanner;

import com.johny.bravo.linked_list.D_Link_List;
import com.johny.bravo.linked_list.Linked_List_Int;

public class DL_run {

	public static void main(String[] args) {
		
		D_Link_List dl = new D_Link_List();
		
		while(true) {
			System.out.println("--------------------- Welcome to the World of Double Linked List ----------------------");
			
			if(dl.isEmpty()) {
				System.out.println("\n Linked List is empty..... ");
				System.out.println("\n What do you want to do ??");
				System.out.println("\n 1. INSERT ");
				System.out.println("\n 99. QUIT ");
			}
			else {
				System.out.println("\n What do you want to do ??");
				System.out.println("\n 1. INSERT at end ");
				System.out.println("\n 2. INSERT at sorted position ");
				System.out.println("\n 3. Forward Traversal ");
				System.out.println("\n 8. Reverse a Doubly Linked List (Recursive Approach )");
				/*System.out.println("\n 3. REMOVE First element ");
				System.out.println("\n 4. REMOVE an element ");
				System.out.println("\n 5. Forward Traversal ");
				System.out.println("\n 6. Backward Traversal ");
				System.out.println("\n 7. Reverse a Linked List (Iterative Approach )");
				System.out.println("\n 8. Reverse a Linked List (Recursive Approach )");
				System.out.println("\n 9. Reverse a Linked List (Using Stack )");
				System.out.println("\n 10. Odds first, then even ");
				System.out.println("\n 11. Check if the Linked List is a Palindrome ");
				System.out.println("\n 12. Reverse every 3 elements ");*/
				System.out.println("\n 99. QUIT ");
			}
			
			System.out.println("\n Your wish : ");
			Scanner in = new Scanner(System.in);
			long startTime, endTime;
			int ch = in.nextInt();
			
			switch(ch) {
			
				case 1 :
					System.out.println("\n Input value : ");
					int a = in.nextInt();
					dl.insert_at_end(a);
					break;
				case 2 :
					System.out.println("\n Input value : ");
					int aa = in.nextInt();
					dl.SortedInsert(aa);
					break;	
				case 3 :
					dl.display_forward();
					break;
				case 8 :	
					startTime = System.nanoTime();
					dl.Reverse();
					endTime = System.nanoTime();
			        System.out.println("Time Taken in Nano Seconds : "+ (endTime - startTime));
					break;
				/*case 4 :
					System.out.println("\n Enter the element : ");
					int b = in.nextInt();
					ll_Int.removeLink(b);
					break;
				case 5 :
					ll_Int.displayAll();
					break;
				case 6 :
					ll_Int.printReverse();
					break;
				case 7 :
					startTime = System.nanoTime();
					ll_Int.reverseIterative();
					endTime = System.nanoTime();
			        System.out.println("Time Taken in Nano Seconds : "+ (endTime - startTime));
					break;
				case 8 :	
					startTime = System.nanoTime();
					ll_Int.reverseRec();
					endTime = System.nanoTime();
			        System.out.println("Time Taken in Nano Seconds : "+ (endTime - startTime));
					break;
				case 9 :	
					startTime = System.nanoTime();
					ll_Int.reverseStack();
					endTime = System.nanoTime();
			        System.out.println("Time Taken in Nano Seconds : "+ (endTime - startTime));
					break;	
				case 10 :
					ll_Int.separate();
					break;
				case 11 :	
					System.out.println("\n The Linked List is a Palindrome : "+ll_Int.isPalindrome());
					break;
				case 12 :
					//ll_Int.rev3();
					ll_Int.displayAll();
					break;*/
				case 99 :
					System.out.println("\n See you ......");
					return;
				default :
					System.out.println("\n Wrong Wrong !!!!");
			}
		}

	}

}
