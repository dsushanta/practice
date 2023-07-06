package com.johny.bravo.main;

import java.util.Scanner;

import com.johny.bravo.linked_list.*;

public class Circular_Linked_List_Run {

	public static void main(String []args) {

		Circular_Linked_List cll = new Circular_Linked_List();
		
		while(true) {
			System.out.println("--------------------- Welcome to the World of Circular Linked List ----------------------");
			
			if(cll.isEmpty()) {
				System.out.println("\n Linked List is empty..... ");
				System.out.println("\n What do you want to do ??");
				System.out.println("\n 2. INSERT ");
				System.out.println("\n 99. QUIT ");
			}
			else {
				System.out.println("\n What do you want to do ??");
				System.out.println("\n 1. INSERT at end ");
				System.out.println("\n 2. INSERT at beginning ");
				System.out.println("\n 3. Traversal ");
				System.out.println("\n 4. Count the Circular Linked List ");
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
					cll.addLinkLast(a);
					break;
				case 2 :
					System.out.println("\n Input value : ");
					int aa = in.nextInt();
					cll.addLinkFirst(aa);
					break;	
				case 3 :
					cll.traverse();
					break;
				case 4 :
					System.out.println("No of Elements : "+cll.count());
					break;
				case 99 :
					System.out.println("\n See you ......");
					return;
				default :
					System.out.println("\n Wrong Wrong !!!!");
			}
		}
	}

}
