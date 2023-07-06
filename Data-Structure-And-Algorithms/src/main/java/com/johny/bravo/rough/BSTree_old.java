package com.johny.bravo.rough;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import com.johny.bravo.linked_list.doublyLink;
import com.johny.bravo.linked_list.doublyLinkNode;
import com.johny.bravo.sorting.Utils;
import com.johny.bravo.tree.Node;

public class BSTree_old {

	public Node root;
	private Comparable[] in_order_list;
	
	public BSTree_old() {
		this.root = null;
	}
	public boolean isEmpty() {
		return (this.root == null);
	}
	
	public void insert_bst(Comparable item) {
		root = insert_bst(root,item);
	}
	private Node insert_bst(Node node, Comparable item) {
		if(node == null)
			node = new Node(item);
		else if(Utils.less(item, node.getData()))
			node.setLeftChild(insert_bst(node.getLeftChild(),item));
		else
			node.setRightChild(insert_bst(node.getRightChild(),item));
		return node;
	}
	public boolean isBST() {		
		Comparable min = null, max = null;
		String class_of_Tree = root.getData().getClass().toString();	
		if(class_of_Tree.equalsIgnoreCase("class java.lang.Integer")) {
			min = Integer.MIN_VALUE;
			max = Integer.MAX_VALUE;
		}
		else if(class_of_Tree.equalsIgnoreCase("class java.lang.Double")) {
			min = Double.MIN_VALUE;
			max = Double.MAX_VALUE;
		}
		else if(class_of_Tree.equalsIgnoreCase("class java.lang.String")) {
			min = "";
			max = "$$$$$$$$@@@@@@@%%%%%%*****!!!!!!#######";
		}
		return isBST(root, min, max);
	}
	private boolean isBST(Node node, Comparable min, Comparable max) {
		if(node == null)
			return true;
		if(Utils.less(min, node.getData())
				&& Utils.less(node.getData(), max)
				&& isBST(node.getLeftChild(),min, (Integer)node.getData())
				&& isBST(node.getRightChild(), (Integer)node.getData(), max))
					return true;
			else 
				return false;
	}
	
	public void PreOrderTraversal() {
		PreOrderTraversal(root);
	}
	private void PreOrderTraversal(Node node) {
		if(node == null)
			return;
		System.out.print(" "+node.getData());
		PreOrderTraversal(node.getLeftChild());
		PreOrderTraversal(node.getRightChild());
	}
	
	public void PostOrderTraversal() {
		PostOrderTraversal(root);
	}
	private void PostOrderTraversal(Node node) {
		if(node == null)
			return;
		PostOrderTraversal(node.getLeftChild());
		PostOrderTraversal(node.getRightChild());
		System.out.print(" "+node.getData());
	}
	
	public void InOrderTraversal() {
		InOrderTraversal(root);
	}
	private void InOrderTraversal(Node node) {
		if(node == null)
			return;
		InOrderTraversal(node.getLeftChild());
		System.out.print(" "+node.getData());
		InOrderTraversal(node.getRightChild());
	}
	
	public void LevelOrderTraversal() {
		if(isEmpty())
			return;
		Queue<Node> discovered_nodes = new LinkedList<Node>();
		discovered_nodes.add(root);
		while(!discovered_nodes.isEmpty()) {
			Node t = discovered_nodes.poll();
			int data = (int)t.getData();
			System.out.print(" "+data);
			if(discovered_nodes.isEmpty())
				System.out.println("\n ------------------------------------------------------------------------\n ");
			else {
				int data2 = (int)discovered_nodes.peek().getData();
				if(distanceFromRoot(data) != distanceFromRoot(data2))
					System.out.println("\n ------------------------------------------------------------------------\n ");
			}	
			if(t.getLeftChild() != null)
				discovered_nodes.add(t.getLeftChild());
			if(t.getRightChild() != null)
				discovered_nodes.add(t.getRightChild());
		}
	}
	public int distanceFromRoot(int item) {
		int dist = distanceFromRoot(root, item);
		return dist;
	}
	
	private int distanceFromRoot(Node node, int item) {
		int left, right;
		if(node == null)
			return -1;
		
		if(item == (int)node.getData()) {
			return 0;
		}
		left = distanceFromRoot(node.getLeftChild(), item);
		if(left < 0) {
			right = distanceFromRoot(node.getRightChild(), item);
			if(right < 0)
				return -1;
			else
				return right +1;
		}
		else
			return left+1;
	}
	
	public boolean search(Comparable item) {
		return search(root,item);
	}
	private boolean search(Node node, Comparable item) {
		boolean found = false;
		if(node == null)
			found = false;
		else if(node.getData() == item)
			found = true;
		else if(Utils.less(item, node.getData()))
			found = search(node.getLeftChild(), item);
		else
			found = search(node.getRightChild(), item);
		return found;
	}
	
	public Comparable leftChild(Comparable item) {
		Comparable lChild = null;
		Node parent = nodeRef(root, item);
		if(parent == null)
			;
		else if(parent.getLeftChild() == null)
			;
		else 
			lChild = parent.getLeftChild().getData();
		return lChild;
	}
	
	public Comparable rightChild(Comparable item) {
		Comparable rChild = null;
		Node parent = nodeRef(root, item);
		if(parent == null)
			;
		else if(parent.getRightChild() == null)
			;
		else 
			rChild = parent.getRightChild().getData();
		return rChild;
	}
	private Node nodeRef(Node node, Comparable item) {
		Node n = null;
		if(node == null)
			n = null;
		else if(item == node.getData())
			n = node;
		else if(Utils.less(item, node.getData()))
			n = nodeRef(node.getLeftChild(), item);
		else
			n = nodeRef(node.getRightChild(), item);
		return n;
	}
	
	public Comparable min() {
		return min(root);
	}
	private Comparable min(Node node) {
		Comparable m = null;
		if(node == null)
			;
		else if(node.getLeftChild() == null)
			m = node.getData();
		else
			m = min(node.getLeftChild());
		return m;
	}
	
	public Comparable max() {
		return min(root);
	}
	private Comparable max(Node node) {
		Comparable m = null;
		if(node == null)
			;
		else if(node.getRightChild() == null)
			m = node.getData();
		else
			m = max(node.getRightChild());
		return m;
	}
	
	public int height() {
		return height(root);
	}
	public int height(Node node) {
		int h = -1;
		if(node == null)
			;
		else {
			int h_left = height(node.getLeftChild());
			int h_right = height(node.getRightChild());
			if(h_left >= h_right)
				h = h_left + 1;
			else
				h = h_right + 1;
		}		
		return h;
	}
	
	public void BSTFromPostOrderList(Comparable [] pol) {	
		root = BSTFromPostOrderList(root, pol, 0, pol.length-1);
		System.out.println("Is this a Binary Search Tree - "+isBST());
		//PreOrderTraversal();	
	}
	private int getPartitionIndex(Comparable []pol, Comparable item, int start, int end) {
		int partition = end+1;              // This is for a scenario where there is no left sub tree
		for(int i=start; i<=end; i++) {
			if(Utils.less(item, pol[i])) {
				partition = i;
				break;
			}
		}
		return partition;
	}
	private Node BSTFromPostOrderList(Node node, Comparable [] pol, int start, int end) {
		if(start > end)
			return null;
		if(start == end)
			return (new Node(pol[end]));
		node = new Node(pol[end]);
		int partition = getPartitionIndex(pol, pol[end], start, end-1);
		node.setLeftChild(BSTFromPostOrderList(node.getLeftChild(), pol, start, partition-1));
		node.setRightChild(BSTFromPostOrderList(node.getRightChild(), pol, partition, end-1));
		return node;
	}
	
	public void BSTFromInOrderList(Comparable []iol) {
		root = BSTFromInOrderList(root, iol, 0, iol.length-1);
	}
	
	private Node BSTFromInOrderList(Node node, Comparable []iol, int start, int end) {
		if(start>end)
			return null;
		int mid = (start+end)/2;
		node = new Node(iol[mid]);
		node.setLeftChild(BSTFromInOrderList(node.getLeftChild(), iol, start, mid-1));
		node.setRightChild(BSTFromInOrderList(node.getRightChild(), iol, mid+1, end));
		return node;
	}
	
	public void verticalOrderSumHashMap() {
		HashMap <Integer, Integer> sum = new HashMap<Integer, Integer> ();
		sum.put(0, 0);
		int pos = 0;
		verticalOrderSumHashMap(root,sum, pos);
		for(Map.Entry m: sum.entrySet())
			System.out.println(m.getKey()+" : "+m.getValue());
	}
	private void verticalOrderSumHashMap(Node node, HashMap <Integer, Integer> sum, int pos) {
		sum.put(pos, sum.get(pos)+(Integer)node.getData());
		if(node.getLeftChild() != null) {
			if(!sum.containsKey(pos-1))
				sum.put(pos-1, 0);
			verticalOrderSumHashMap(node.getLeftChild(), sum, pos-1);
		}
		if(node.getRightChild() != null) {
			if(!sum.containsKey(pos+1))
				sum.put(pos+1, 0);
			verticalOrderSumHashMap(node.getRightChild(), sum, pos+1);
		}
	}
	
	public void verticalOrderSumLL() {
		doublyLink sum = new doublyLink(0);
		verticalOrderSumLL(root,sum);
		while(sum.getprev() != null)
			sum = sum.getprev();
		doublyLink t = sum;
		while(t != null) {
			System.out.print(" "+t.getData());
			t = t.getnext();
		}
	}
	private void verticalOrderSumLL(Node node, doublyLink sum) {
		sum.setData(sum.getData()+(Integer)node.getData());
		if(node.getLeftChild() != null) {
			if(sum.getprev() == null) {
				sum.setprev(new doublyLink(0));
				sum.getprev().setnext(sum);
			}
			verticalOrderSumLL(node.getLeftChild(), sum.getprev());
		}
		if(node.getRightChild() != null) {
			if(sum.getnext() == null) {
				sum.setnext(new doublyLink(0));
				sum.getnext().setprev(sum);
			}
			verticalOrderSumLL(node.getRightChild(), sum.getnext());
		}
	}
	
	public int distanceFromRoot(Integer item) {
		return distanceFromRoot(root, item);
	}
	private int distanceFromRoot(Node node, Integer item) {
		Integer left, right;
		if(node == null)
			return -1;
		if(item == (Integer)node.getData())
			return 0;
		left = distanceFromRoot(node.getLeftChild(), item);
		if(left < 0) {
			right = distanceFromRoot(node.getRightChild(), item);
			if(right < 0)
				return -1;
			else
				return right+1;
		}
		else
			return left+1;
	}
	
	public void topView() {
		doublyLinkNode top = new doublyLinkNode();
		topView(root, top);
		while(top.getPrev() != null)
			top = top.getPrev();
		doublyLinkNode t = top;
		System.out.println("\n Here is the Top view of the tree -- \n");
		while(t != null) {
			System.out.print(t.getData().getData()+" ");
			t = t.getNext();
		}
	}
	private void topView(Node node, doublyLinkNode top) {
		if(top.getData() == null)
			top.setData(node);
		else {
			int d1 = distanceFromRoot((Integer)top.getData().getData());
			int d2 = distanceFromRoot((Integer)node.getData());
			if(d1 > d2)
				top.setData(node);
		}
		if(node.getLeftChild() != null) {
			if(top.getPrev() == null) {
				top.setPrev(new doublyLinkNode());
				top.getPrev().setNext(top);
			}
			topView(node.getLeftChild(), top.getPrev());
		}
		if(node.getRightChild() != null) {
			if(top.getNext() == null) {
				top.setNext(new doublyLinkNode());
				top.getNext().setPrev(top);
			}
			topView(node.getRightChild(), top.getNext());
		}	
	}
	
	public void rightView() {
		Queue<Node> discovered_nodes = new LinkedList<Node>();
		discovered_nodes.add(root);
		while(!discovered_nodes.isEmpty()) {
			Node temp1 = discovered_nodes.poll();
			if(discovered_nodes.isEmpty())
				System.out.print(temp1.getData()+" ");
			else {
				Node temp2 = discovered_nodes.peek();
				Integer d1 = distanceFromRoot((Integer)temp1.getData());
				Integer d2 = distanceFromRoot((Integer)temp2.getData());
				if(d1 != d2)
					System.out.print(temp1.getData()+" ");
			}
			if(temp1.getLeftChild() != null)
				discovered_nodes.add(temp1.getLeftChild());
			if(temp1.getRightChild() != null)
				discovered_nodes.add(temp1.getRightChild());
		}
	}
	
	public Integer lca(Integer item1, Integer item2) {
		Node lca_node = lca(root, item1, item2);
		if(lca_node == null)
			return -1;
		else
			return (Integer)lca_node.getData();
	}
	private Node lca(Node node, Integer item1, Integer item2) {
		if(node == null)
			return null;
		if((item1 == (Integer)node.getData()) || (item2 == (Integer)node.getData()))
			return node;
		Node left = lca(node.getLeftChild(), item1, item2);
		Node right = lca(node.getRightChild(), item1, item2);
		if((left != null) && (right != null))
			return node;
		else if(left != null)
			return left;
		else if(right != null)
			return right;
		else
			return null;
	}
	
	public int distanceBetweenNodes(Integer item1, Integer item2) {
		Integer dist1, dist2, lca, dist_lca, dbn;
		dist1 = distanceFromRoot(item1);
		dist2 = distanceFromRoot(item2);
		lca = lca(item1, item2);
		dist_lca = distanceFromRoot(lca);
		if((dist1 == -1) || (dist2 == -1) || (dist_lca == -1))
			return -1;
		else {
			//System.out.println(dist1+" : "+dist2+" : "+lca);
			dbn = dist1 + dist2 - 2*dist_lca;
		}
		return dbn;
	}
	
	public Node ancestor(Comparable item) {
		return ancestor(root, null, item);
	}
	private Node ancestor(Node node, Node parent, Comparable item) {
		Node a;
		if(node == null)
			return null;
		if(item == node.getData())
			a = parent;
		a = ancestor(node.getLeftChild(), node, item);
		if(a == null) {
			a = ancestor(node.getRightChild(), node, item);
		}	
		return a;
	}
	
	public void levelOrderSpiral() {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while((! s1.isEmpty()) || (! s2.isEmpty())) {
			System.out.println("\n ------------------------------------ \n");
			while(! s1.isEmpty()) {
				Node temp = s1.pop();
				System.out.print(temp.getData()+" ");
				if(temp.getRightChild() != null)
					s2.push(temp.getRightChild());
				if(temp.getLeftChild() != null)
					s2.push(temp.getLeftChild());
			}
			System.out.println("\n ------------------------------------ \n");
			while(! s2.isEmpty()) {
				Node temp = s2.pop();
				System.out.print(temp.getData()+" ");
				if(temp.getLeftChild() != null)
					s1.push(temp.getLeftChild());
				if(temp.getRightChild() != null)
					s1.push(temp.getRightChild());
			}
		}
	}
	
	public void mirror() {
		root = mirror(root);
	}
	private Node mirror(Node node) {
		if(node == null)
			return node;
		if((node.getLeftChild() == null) && (node.getRightChild() == null))
			return node;
		Node temp = node.getLeftChild();
		node.setLeftChild(node.getRightChild());
		node.setRightChild(temp);
		temp = null;
		node.setLeftChild(mirror(node.getLeftChild()));
		node.setRightChild(mirror(node.getRightChild()));
		return node;
	}
	
//	public void huffmanDecoding(Node node, String s) {
//		String output = null;
//		for(int i=0; i<s.length(); i++) {	
//			if(s.charAt(i) == '0')
//				node = node.getLeftChild();
//			else
//				node = node.getRightChild();
//			if((node.getLeftChild() == null) || (node.getRightChild() == null)) {
//				output = output.concat((String)node.getData());
//				continue;
//			}
//		}
//	}
	
	public void boundary() {
		System.out.print(root.getData()+" ");
		leftEdge(root);
		leaves(root);
		rightEdge(root);
	}
	
	private void leftEdge(Node node) {
		if(node == null || (node.getLeftChild() == null && node.getRightChild() == null))
			return;
		System.out.println(node.getData()+" ");
		if(node.getLeftChild() == null)
			leftEdge(node.getRightChild());
		else
			leftEdge(node.getLeftChild());
	}
	
	private void leaves(Node node) {
		if(node == null)
			return;
		if(node.getLeftChild() == null && node.getRightChild() == null)
			System.out.println(node.getData()+" ");
		leaves(node.getLeftChild());
		leaves(node.getRightChild());
	}
	
	private void rightEdge(Node node) {
		if(node == null || (node.getLeftChild() == null && node.getRightChild() == null))
			return;
		if(node.getRightChild() == null)
			rightEdge(node.getRightChild());
		else
			rightEdge(node.getLeftChild());
		System.out.println(node.getData()+" ");
	}
	
	public void sameCell() {
		Queue<Node> discovered_nodes = new LinkedList<Node>();
		discovered_nodes.add(root);
		while(!discovered_nodes.isEmpty()) {
			Node temp1 = discovered_nodes.poll();
			if(!discovered_nodes.isEmpty()) {
				Node temp2 = discovered_nodes.peek();
				Integer dist1 = distanceFromRoot((Integer)temp1.getData());
				Integer dist2 = distanceFromRoot((Integer)temp2.getData());
				if((dist1 == dist2) && (temp1.getRightChild() != null) && (temp2.getLeftChild() != null))
					System.out.println(temp1.getData()+" : "+temp2.getData());
			}
			if(temp1.getLeftChild() != null)
				discovered_nodes.add(temp1.getLeftChild());
			if(temp1.getRightChild() != null)
				discovered_nodes.add(temp1.getRightChild());
		}
	}
	
}
