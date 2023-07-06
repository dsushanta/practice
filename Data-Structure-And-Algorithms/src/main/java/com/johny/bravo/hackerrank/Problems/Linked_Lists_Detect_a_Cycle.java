/* Problem Statement ----------------------
A linked list is said to contain a cycle if any node is visited more than once while traversing the list. 
Complete the function provided in the editor below. It has one parameter: a pointer to a Node object named head 
that points to the head of a linked list. Your function must return a boolean denoting whether or not there is a cycle in the list. 
If there is a cycle, return true; otherwise, return false.
Note: If the list is empty, head will be null.
Input Format
Our hidden code checker passes the appropriate argument to your function. You are not responsible for reading any input from stdin.
Constraints

Output Format
If the list contains a cycle, your function must return true. If the list does not contain a cycle, it must return false. 
The binary integer corresponding to the boolean value returned by your function is printed to stdout by our hidden code checker.
*/


package com.johny.bravo.hackerrank.Problems;

import java.util.*;

public class Linked_Lists_Detect_a_Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean has_cycle(Node head) {
		Set<Node> unique_nodes = new LinkedHashSet<Node>();
		Node n = head;
		while(n != null) {
			if(unique_nodes.contains(n))
				return true;
			unique_nodes.add(n);
			n = n.next;
		}
		return false;
	}

}

class Node {
	int data;
	Node next;
}
