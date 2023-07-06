/**
 * 
 */
package com.johny.bravo.rough;

import java.util.Scanner;

import com.johny.bravo.sorting.Quick;
import com.johny.bravo.tree.Node;

/**
 * @author Sushant
 *
 */
public class BSTree_main {

	public static void main(String[] args) {

	BSTree bst = new BSTree();
	
	while (true) {
		System.out.println("\n--------------------------- Welcome to the Jungle -----------------------------\n\n");
		if(bst.isEmpty()) {
			System.out.println("\n Binary Tree is empty..... ");
			System.out.println("\n What do you want to do ??");
			System.out.println("\n 1. INSERT ");
			System.out.println("\n 11. Create a BST from Post Order List");
//			System.out.println("\n 13. Check if all the non-leaf nodes have single child");
			System.out.println("\n 14. Create a BST from In Order List");
//			System.out.println("\n 15. Create a BST from a Binary Tree");
			System.out.println("\n 99. QUIT ");
		}
		else {
			System.out.println("\n What do you want to do ??");
			System.out.println("\n 1. INSERT ");
//			System.out.println("\n 2. DELETE ");
			System.out.println("\n 3. PRE-ORDER TRAVERSAL ");
			System.out.println("\n 4. IN-ORDER TRAVERSAL ");
			System.out.println("\n 5. POST-ORDER TRAVERSAL ");
			System.out.println("\n 6. LEVEL-ORDER TRAVERSAL ");
			System.out.println("\n 7. GET HEIGHT OF THE TREE ");
			System.out.println("\n 8. GET MIN AND MAX ELEMENT IN THE TREE ");
			System.out.println("\n 9. SEARCH ");
			System.out.println("\n 10. IS BINARY TREE");
//			System.out.println("\n 12. Print BST Keys in a given range");
			System.out.println("\n 16. Get the Vertical Sum of a Tree using Doubly Linked List ");
//			System.out.println("\n 17. Get the Vertical Sum of a Tree using Has Map ");
			System.out.println("\n 18. Get Depth of any Node ");
			System.out.println("\n 19. Get Lowest Common Ancestor of two nodes ");
			System.out.println("\n 20. Get Distance Between two Nodes ");
			System.out.println("\n 21. Get Ancestor of any Node ");
			System.out.println("\n 22. Get the Right View of a Tree ");
			System.out.println("\n 23. Get the Top View of a Tree ");
			System.out.println("\n 24. Get the Mirror Image ");
			System.out.println("\n 25. Get the Boundary ");
			System.out.println("\n 26. Print the elements in the same Cell ");
			System.out.println("\n 27. Get Left Child of any node ");
			System.out.println("\n 28. Get Right Child of any node ");
			System.out.println("\n 29. Level Order Spiral ");
			System.out.println("\n 30. Print the Right Edge ");
			
			System.out.println("\n 99. QUIT ");
		}
		
		System.out.println("\n Your wish : ");
		Scanner in = new Scanner(System.in);
		int ch = in.nextInt();
		switch(ch) {
			case 1 :
				System.out.println("\n Enter Node Value : ");
				Comparable a = in.nextInt();
				bst.insert(a);
				break;
			
			case 2 :
				System.out.println("\n Which is the node to delete : ");
				Comparable b = in.nextInt();
				//bst.delete(b);
				break;
				
			case 3 :
				System.out.println("\n Pre-Order Traversal of Tree ------------------ ");
				bst.PreOrderTraversal();
				break;
				
			case 4 :
				System.out.println("\n In-Order Traversal of Tree ------------------ ");
				bst.InOrderTraversal();
				break;
				
			case 5 :
				System.out.println("\n Post-Order Traversal of Tree ------------------ ");
				bst.PostOrderTraversal();
				break;
				
			case 6 :
				System.out.println("\n Level-Order Traversal of Tree ------------------ ");
				bst.levelOrderTraversal();
				break;
				
			case 7 :
				System.out.println("\n Height of Binary Tree : "+bst.height());
				break;
				
			case 8 :
				System.out.println("\n Smallest node : "+bst.min());
				System.out.println("\n Biggest node : "+bst.max());
				break;
				
			case 9 :
				System.out.println("\n Enter Node to search : ");
				Comparable c = in.nextInt();
				System.out.println("\n Node found : "+bst.search(c));
				break;
				
			case 10 : 
				System.out.println("\n Binary Search Tree : "+bst.isBST());
				break;
				
			case 11 :
				System.out.println("\n How many Nodes : ");
				int size = in.nextInt();
				Comparable post_order_list[] = new Comparable [size];
				for(int i=0; i < size; i++) {
					if(i == (size-1)) {
						System.out.println("\n Enter the last Entry : ");
						post_order_list[i] = in.nextInt();
					}
					else {
						System.out.println("\n Enter next Entry : ");
						post_order_list[i] = in.nextInt();
					}
				}
				
				bst.BSTFromPostOrderList(post_order_list);
				break;
				
			case 12 :
//				System.out.println("\n Enter lower limit : ");
//				int lower = in.nextInt();
//				System.out.println("\n Enter upper limit : ");
//				int upper = in.nextInt();
//				if(upper > lower) 
//					bst.BSTInAGivenRange(lower, upper);
//				else
//					System.out.println("\n Enter correct lower and upper limits... ");
				break;
					
			case 13 :
//				System.out.println("\n Enter the pre-order traversal... ");
//				System.out.println("\n How many Nodes : ");
//				int s = in.nextInt();
//				int pre_order_list[] = new int [s];
//				for(int i=0; i < s; i++) {
//					if(i == (s-1)) {
//						System.out.println("\n Enter the last Entry : ");
//						pre_order_list[i] = in.nextInt();
//					}
//					else {
//						System.out.println("\n Enter next Entry : ");
//						pre_order_list[i] = in.nextInt();
//					}
//				}
//				if(bst.chkSingleChild(pre_order_list))
//					System.out.println("\n All the non-leaf nodes have only one child..");
//				else
//					System.out.println("\n There are non-leaf nodes with two children..");
				break;
				
			case 14 :
				System.out.println("\n How many Nodes : ");
				int in_size = in.nextInt();
				Comparable in_order_list[] = new Comparable [in_size];
				for(int i=0; i < in_size; i++) {
					if(i == (in_size-1)) {
						System.out.println("\n Enter the last Entry : ");
						in_order_list[i] = in.nextInt();
					}
					else {
						System.out.println("\n Enter next Entry : ");
						in_order_list[i] = in.nextInt();
					}
				}
				
				//bst.BSTFromInOrderList(in_order_list);
				break;	
				
			case 15 :
				System.out.println("\n How many Nodes : ");
				int tree_size = in.nextInt();
				Comparable[] in_order_list_binary = new Comparable[tree_size];
				System.out.println("\n Enter IN ORDER LIST of the Binary Tree --");
				for(int i=0; i < tree_size; i++) {
					if(i == (tree_size-1)) {
						System.out.println("\n Enter the last Entry : ");
						in_order_list_binary [i] = in.nextInt();
					}
					else {
						System.out.println("\n Enter next Entry : ");
						in_order_list_binary [i] = in.nextInt();
					}
				}
				Comparable[] sorted_in_order_list_binary = Quick.sort(in_order_list_binary);
				//bst.BSTFromInOrderList(sorted_in_order_list_binary);
				break;
				
			case 16 :
				bst.verticalOrderSumLL();
				break;
				
			case 17 :
				//bst.verticalOrderSumHashMap();
				break;
			case 18 :	
				System.out.println("\n Enter the element : ");
				int item = in.nextInt();
				System.out.println("\n Depth of the Node : "+bst.distanceFromRoot(item));
				break;
			case 19 :	
				System.out.println("\n Enter 1st Node : ");
				int item1 = in.nextInt();
				System.out.println("\n Enter 2nd Node : ");
				int item2 = in.nextInt();
				int lca = bst.findLCA(item1, item2);
				if(lca == -1)
					System.out.println("\n Error : Either the Tree is empty or nodes are not present");
				else
					System.out.println("\n Lowest Common ancestor of "+item1+" & "+item2+" : "+lca);
				break;
				
			case 20 :
				System.out.println("\n Enter 1st Node : ");
				int i1 = in.nextInt();
				System.out.println("\n Enter 2nd Node : ");
				int i2 = in.nextInt();
				int dbn = bst.distanceBetweenNodes(i1, i2);
				if(dbn == -1)
					System.out.println("\n Error : Either the Tree is empty or nodes are not present");
				else
					System.out.println("\n Distance between "+i1+" & "+i2+" : "+dbn);
				break;
			
			case 21 :
				System.out.println("\n Please enter the node : ");
				Integer a1 = in.nextInt();
				Node ancestor = bst.ancestor(a1);
				if(ancestor == null)
					System.out.println("\n No Ancestor !!!");
				else
					System.out.println("\n Ancestor of Node "+a1+" : "+ancestor.getData());
				break;
				
			case 22 :
				System.out.println("\n Here is the Right View of the tree :  \n");
				/*int[] rightmost = bst.rightView2();
				for(int i=0; i<rightmost.length; i++)
					System.out.print(rightmost[i]+" ");*/
				bst.rightView();
				break;
				
			case 23 :
				System.out.println("\n Here is the Top View of the tree :  ");
				bst.topView();
				break;
				
			case 24 :
				System.out.println("\n Normal Tree ...");
				bst.levelOrderTraversal();
				bst.mirror();
				System.out.println("\n Mirror Image ...");
				bst.levelOrderTraversal();
				bst.mirror();
				break;
				
			case 25 :
				System.out.println(" \n Boundary of the tree is : ");
				bst.boundary();
				break;
			
			case 26 :
				System.out.println(" \n Following elements are in the same Cell ------ ");
				bst.sameCell();
				break;
				
			case 27 :
				System.out.println(" \n please enter the node whose Left Child is to be fetched : ");
				Integer p = in.nextInt();
				if(bst.search(p))
					System.out.println(" \n Left Child of "+p+" : "+bst.leftChild(p));
				else
					System.out.println("\n The Requested node is not present in the Tree OR The node does not have a Left Child !!");
				break;
				
			case 28 :
				System.out.println(" \n please enter the node whose Right Child is to be fetched : ");
				Integer q = in.nextInt();
				if(bst.search(q))
					System.out.println(" \n Right Child of "+q+" : "+bst.rightChild(q));
				else
					System.out.println("\n The Requested node is not present in the Tree OR The node does not have a Right Child !!");
				break;
				
			case 29 :
				bst.levelOrderSpiral();
				break;
				
			case 30 :
				bst.printRightEdge();
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
